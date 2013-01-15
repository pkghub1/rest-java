package com.incept5.rest.mock;

import com.incept5.rest.gateway.EmailServicesGateway;
import com.incept5.rest.user.mail.MailSenderService;
import com.incept5.rest.user.service.UserService;
import com.incept5.rest.user.service.VerificationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.social.connect.ConnectionFactoryLocator;

import static org.mockito.Mockito.mock;

/**
 * User: porter
 * Date: 07/05/2012
 * Time: 14:47
 */
@Configuration
@PropertySource("classpath:properties/app.properties")
public class AppMockConfiguration {

    @Autowired
    private Environment environment;

    public Environment environment() {
        return environment;
    }


    @Bean
    public UserService userService() {
        UserService userService = mock(UserService.class);
        return userService;
    }

    @Bean
    public VerificationTokenService verificationTokenService() {
        VerificationTokenService tokenService = mock(VerificationTokenService.class);
        return tokenService;
    }

    @Bean
    public MailSenderService mailSenderService() {
        MailSenderService mailSenderService = mock(MailSenderService.class);
        return mailSenderService;
    }

    @Bean
    public EmailServicesGateway emailServicesGateway() {
        EmailServicesGateway emailServicesGateway = mock(EmailServicesGateway.class);
        return emailServicesGateway;
    }

    @Bean
    public ConnectionFactoryLocator connectionFactoryLocator() {
        ConnectionFactoryLocator connectionFactoryLocator =  mock(ConnectionFactoryLocator.class);
        return connectionFactoryLocator;
    }

}


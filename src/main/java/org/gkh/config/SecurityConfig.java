package org.gkh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static String BASE_REST_URL = "/gkh/v1";
    private static String USER = "USER";
    private static String ADMIN = "ADMIN";

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers(BASE_REST_URL + "/private/accounts/*").hasRole(USER)
                .and()
                .formLogin();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("qwerty").roles(USER)
                .and()
                .withUser("admin").password("qwerty").roles(USER, ADMIN);
    }

}

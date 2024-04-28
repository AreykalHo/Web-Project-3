package com.bakery.shop.bakeme.config;

import com.bakery.shop.bakeme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Autowired
        private UserService userService;

        @Autowired
        private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
                auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
                http
                                .authorizeRequests(requests -> requests
                                                .anyRequest().permitAll())
                                .formLogin(login -> login
                                                .loginPage("/login")
                                                .successHandler(customAuthenticationSuccessHandler)
                                                .permitAll())
                                .logout(logout -> logout
                                                .logoutSuccessUrl("/login?logout")
                                                .permitAll());
        }
}

// @Configuration
// @EnableWebSecurity
// public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

// @Autowired
// private UserService userService;

// @Autowired
// private CustomAuthenticationSuccessHandler
// customAuthenticationSuccessHandler;

// @Autowired
// public void configureGlobal(AuthenticationManagerBuilder auth) throws
// Exception {
// auth.userDetailsService(userService).passwordEncoder(new
// BCryptPasswordEncoder());
// }

// @Override
// protected void configure(HttpSecurity http) throws Exception {
// http
// .authorizeRequests(requests -> requests
// .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**",
// "/images/**", "/login/**")
// .permitAll()
// .antMatchers("/admin/**").hasRole("ADMIN")
// .antMatchers("/home/**").hasRole("USER")
// .anyRequest().authenticated())
// .formLogin(login -> login
// .loginPage("/login")
// .successHandler(customAuthenticationSuccessHandler)
// .permitAll())
// .logout(logout -> logout
// .logoutSuccessUrl("/login?logout")
// .permitAll());
// }

// }

// package com.bakery.shop.bakeme.security;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.authorizeRequests()
//                 .antMatchers("/**").permitAll()
//                 .anyRequest().authenticated()
//                 .and().csrf().disable();
//     }
// }

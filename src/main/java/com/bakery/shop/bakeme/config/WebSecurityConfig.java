// package com.bakery.shop.bakeme.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

// import com.bakery.shop.bakeme.service.UserDetailsServiceImplement;

// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig {

//     @Bean
//     public UserDetailsService userDetailsService() {
//         return new UserDetailsServiceImplement();
//     }

//     @Bean
//     public BCryptPasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
//     public DaoAuthenticationProvider authenticationProvider() {
//         DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//         authProvider.setUserDetailsService(userDetailsService());
//         authProvider.setPasswordEncoder(passwordEncoder());

//         return authProvider;
//     }

//     private AuthenticationSuccessHandler authenticationSuccessHandler;

//     public WebSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
//         this.authenticationSuccessHandler = authenticationSuccessHandler;
//     }

//     @SuppressWarnings("deprecation")
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .authorizeRequests(requests -> requests
//                         .requestMatchers("/css/**").permitAll()
//                         .requestMatchers("/images/**").permitAll()
//                         .requestMatchers("/favicon.ico").permitAll()
//                         .requestMatchers("/admin").hasRole("ADMIN")
//                         .anyRequest().authenticated())
//                 .formLogin(login -> login
//                         .loginPage("/login")
//                         .successHandler(authenticationSuccessHandler)
//                         .permitAll())
//                 .logout(logout -> logout
//                         .permitAll())
//                 .csrf(csrf -> csrf.disable());
//         return http.build();
//     }

// }

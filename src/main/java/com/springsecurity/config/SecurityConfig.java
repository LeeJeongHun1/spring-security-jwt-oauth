package com.springsecurity.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.headers().frameOptions().disable();
        http.formLogin().disable();
//        http.formLogin().permitAll();
        http.authorizeRequests()
                .anyRequest().permitAll();
        // spring security
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // api
//        http.formLogin().disable();
//        http.authorizeRequests().anyRequest().permitAll();

//        CustomAuthenticationFilter authenticationFilter =
//                new CustomAuthenticationFilter(authManagerBuilder.getOrBuild());

        // 로그인 인증 필터
//        authenticationFilter.setFilterProcessesUrl("/v1/login");
//        authenticationFilter.setAuthenticationSuccessHandler(loginSuccessHandler);
//        authenticationFilter.setAuthenticationFailureHandler(loginFailureHandler);
//
//
//        http.addFilter(authenticationFilter)
//                .addFilterBefore(customAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
//                .authenticationProvider(authenticationProvider)
//                .authorizeRequests().anyRequest().permitAll();


        return http.build();
    }
}

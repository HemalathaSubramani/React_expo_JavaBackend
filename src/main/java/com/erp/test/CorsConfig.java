package com.erp.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(
                                "http://192.168.10.71:8083", // React Native frontend (Expo) running on 8083
                                "http://10.0.2.2:8083",     // Expo running locally on 8083
                                "http://192.168.10.71:8083", 
                                "exp://192.168.10.71:8083",  // Native Expo development URL for real devices
                                "http://192.168.10.71:19000", // Expo DevTools (Metro Bundler)
                                "http://192.168.10.71:19001", // Expo WebSocket for debugging
                                "http://192.168.10.71:19002"  // Expo internal API communication
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*") // Allow all headers
                        .exposedHeaders("*")
                        .allowCredentials(true); // Allow sending cookies/auth tokens
            }
        };
    }
}

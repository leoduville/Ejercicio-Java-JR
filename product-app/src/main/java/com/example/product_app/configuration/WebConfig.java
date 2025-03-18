package com.example.product_app.config;  

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Deshabilitar el manejo de recursos estáticos.
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").resourceChain(false);
    }
}

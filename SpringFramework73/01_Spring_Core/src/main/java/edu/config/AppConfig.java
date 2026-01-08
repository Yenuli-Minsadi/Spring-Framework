package edu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//component
@ComponentScan(basePackages="edu.bean")// scan and link all beans in the application with bean path, spring bean/components okkoma meken aran awilla
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig is created");
    }
}

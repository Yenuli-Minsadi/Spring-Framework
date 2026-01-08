package edu.config;

import edu.newBeans.NewTestBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//component
@ComponentScan(basePackages= {"edu.bean", "edu.newBeans"})// scan and link all beans in the application with bean path, spring bean/components okkoma meken aran awilla
//@ComponentScan(basePackageClasses = NewTestBean.class)
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig is created");
    }
}

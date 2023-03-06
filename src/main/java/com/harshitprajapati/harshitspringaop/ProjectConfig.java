package com.harshitprajapati.harshitspringaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ProjectConfig {

    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}

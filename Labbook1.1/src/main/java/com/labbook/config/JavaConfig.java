package com.labbook.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.labbook.entities")
@PropertySource("classpath:employee.properties")
public class JavaConfig {

}

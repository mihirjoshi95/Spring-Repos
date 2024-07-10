package com.boa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import({AppConfig.class,CustomerConfig.class})
public class CentrelizedConfig {

}

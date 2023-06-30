package lk.epic.client_server.config;

import lk.epic.client_server.controller.ServerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Child Context
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {ServerController.class})
public class WebAppConfig {

}

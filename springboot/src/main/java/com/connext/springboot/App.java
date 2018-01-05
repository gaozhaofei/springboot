package com.connext.springboot;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App 
{
      @RequestMapping("/h")
      public String home() {
        return "Hello";
      }
    
      @RequestMapping("/w")
      public String word() {
        return "World";
      }
      
    public static void main( String[] args )
    {
        System.out.println( "Hello World ! App!" );
        SpringApplication.run(App.class, args);
//        SpringApplication.run(UserController.class, args);
//        SpringApplication.run(FileController.class, args);
        
        
        
    }
    
    
    //test git commit
    
    
   /* @Bean
    public EmbeddedServletContainerFactory servletFactory(){
        TomcatEmbeddedServletContainerFactory tomcatFactory = 
                new TomcatEmbeddedServletContainerFactory();
        tomcatFactory.setPort(8011);
        tomcatFactory.setSessionTimeout(10,TimeUnit.SECONDS);
        return tomcatFactory;
        
    }
*/}

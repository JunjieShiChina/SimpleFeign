package me.shijunjie.SimpleFeignApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "me.shijunjie")
@EnableEurekaClient
@EnableFeignClients(basePackages = "me.shijunjie")
public class BootStrap 
{
    public static void main( String[] args )
    {
        SpringApplication.run(BootStrap.class, args);
    }
}

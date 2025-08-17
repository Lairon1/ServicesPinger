package ru.lairon1.servicespinger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:application-context.xml")
@SpringBootApplication
public class ServicesPingerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesPingerApplication.class, args);
    }

}

package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.entity.Phone;
import com.repository.PhoneRepository;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = { "com.config", "com.repository", "com.entity"})
public class PhoneprojecttApplication implements CommandLineRunner {

    @Autowired
     PhoneRepository phoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(PhoneprojecttApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Phone phone1 = new Phone("Apple", "iPhone X", 999.99);
        phoneRepository.save(phone1);

        Phone phone2 = new Phone("Samsung", "Galaxy S20", 899.99);
        phoneRepository.save(phone2);

        List<Phone> allPhones = phoneRepository.findAll();
        for (Phone phone : allPhones) {
            System.out.println(phone.toString());
        }
    }
}

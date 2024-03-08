package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Phone;

@Configuration
public class PhoneConfig {

    @Bean
    public Phone phoneBean() {
        Phone phone = new Phone();
        phone.setBrand("NewBrand");
        phone.setModel("NewModel");
        phone.setPrice(999.99);
        return phone;
}
}
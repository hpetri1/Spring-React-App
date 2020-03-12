package com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoData implements CommandLineRunner {

    private final ContactRepository repository;

    @Autowired
    public DemoData(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String...strings) throws Exception {
        this.repository.save(new Contact("Helena", "Me", "email@example.com"));
        this.repository.save(new Contact("Jason", "Lows", "jsaonl@example.com"));
        this.repository.save(new Contact("Hanna", "Klein", "hklein@example.com"));
    }
}
package com.electrorent.service;

import com.electrorent.model.Product;
import com.electrorent.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final ProductRepository repository;

    public DataLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new Product("Dell Inspiron Laptop", "Laptop", "Reliable laptop for study and work", 450, "💻"));
            repository.save(new Product("Canon EOS Camera", "Camera", "Digital camera for events and travel", 700, "📷"));
            repository.save(new Product("Epson Projector", "Projector", "HD projector for presentations and movies", 600, "📽️"));
            repository.save(new Product("Samsung Smartphone", "Smartphone", "Modern Android smartphone", 350, "📱"));
            repository.save(new Product("JBL Bluetooth Speaker", "Audio", "Portable wireless speaker", 250, "🔊"));
            repository.save(new Product("PlayStation Console", "Gaming", "Gaming console with controller", 800, "🎮"));
        }
    }
}

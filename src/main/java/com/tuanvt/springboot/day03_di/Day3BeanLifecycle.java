package com.tuanvt.springboot.day03_di;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
public class Day3BeanLifecycle {
    @Service
    public class ShoppingCartService {

        // LỖI CHẾT NGƯỜI LÀ Ở ĐÂY
        private int totalItems = 0;

        public ShoppingCartService() {
            System.out.println("1. Constructor: ShoppingCartService dang duoc tao (new)!");
        }

        @PostConstruct
        public void init() {
            System.out.println("2. PostConstruct: Bean da duoc khoi tao va bom DI xong! Chuan bi chay.");
        }

        public void addItem() {
            this.totalItems++;
            System.out.println("Them hang thanh cong. Tong so: " + totalItems);
        }

        @PreDestroy
        public void destroy() {
            System.out.println("3. PreDestroy: Server dang tat, don dep bo nho...");
        }
    }
}
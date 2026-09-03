package com.tuanvt.springboot.day02_immutability;

public class Day2Immutability {
    public static void main(String[] args) {
        // Kịch bản: Em lấy dữ liệu cấu hình thanh toán từ DB lên
        PaymentConfig config = new PaymentConfig("VNĐ", 10.0);

        System.out.println("Before Processing: Tax = " + config.taxRate());

        // Em truyền config này vào 1 hàm của một thư viện/đồng nghiệp viết
        processOrder(config);

        // Em dùng lại config để thanh toán cho người tiếp theo
        System.out.println("After Processing: Tax = " + config.taxRate());
    }

    public static void processOrder(PaymentConfig cfg) {
        // Người đồng nghiệp vô tình (hoặc cố ý) sửa data của em!
        System.out.println("Processing order...");
    }
}

// Đây là class Mutable (Có thể bị thay đổi)
record PaymentConfig(String name, double taxRate) {
}
package com.tuanvt.springboot.day02_immutability;

public class Day2Immutability {
    public static void main(String[] args) {
        // Kịch bản: Em lấy dữ liệu cấu hình thanh toán từ DB lên
        PaymentConfig config = new PaymentConfig("VNĐ", 10.0);

        System.out.println("Before Processing: Tax = " + config.getTaxRate());

        // Em truyền config này vào 1 hàm của một thư viện/đồng nghiệp viết
        processOrder(config);

        // Em dùng lại config để thanh toán cho người tiếp theo
        System.out.println("After Processing: Tax = " + config.getTaxRate());
    }

    public static void processOrder(PaymentConfig cfg) {
        // Người đồng nghiệp vô tình (hoặc cố ý) sửa data của em!
        cfg.setTaxRate(99.9);
        System.out.println("Processing order...");
    }
}

// Đây là class Mutable (Có thể bị thay đổi)
class PaymentConfig {
    private String currency;
    private double taxRate;

    public PaymentConfig(String currency, double taxRate) {
        this.currency = currency;
        this.taxRate = taxRate;
    }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public double getTaxRate() { return taxRate; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }
}
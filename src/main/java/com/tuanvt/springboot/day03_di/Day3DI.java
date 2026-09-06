package com.tuanvt.springboot.day03_di;

public class Day3DI {
    public static void main(String[] args) {
        // --- KỊCH BẢN 1: Code kiểu cũ (Tight Coupling) ---
        System.out.println("--- Scenario 1: Tight Coupling ---");
        BadOrderService badService = new BadOrderService();
        badService.checkout();

        // --- KỊCH BẢN 2: Code áp dụng DI (Loose Coupling) ---
        System.out.println("\n--- Scenario 2: Dependency Injection ---");

        // 1. CHÚNG TA đóng vai trò là IoC Container. Tự khởi tạo Dependency.
        PaymentGateway vnPay = new VnPayGateway();
        PaymentGateway momo = new MomoGateway();

        // 2. CHÚNG TA "bơm" (inject) dependency vào cho Service thông qua Constructor.
        GoodOrderService goodService1 = new GoodOrderService(vnPay);
        goodService1.checkout();

        GoodOrderService goodService2 = new GoodOrderService(momo);
        goodService2.checkout();
    }
}

// ---------------- CÁC CLASS PHỤ TRỢ ----------------

interface PaymentGateway {
    void pay();
}

class VnPayGateway implements PaymentGateway {
    public void pay() { System.out.println("Thanh toan bang VNPay"); }
}

class MomoGateway implements PaymentGateway {
    public void pay() { System.out.println("Thanh toan bang Momo"); }
}

// ---------------- KỊCH BẢN 1: TIGHT COUPLING ----------------
class BadOrderService {
    private VnPayGateway gateway;

    public BadOrderService() {
        // Lỗi thiết kế: Tự new! Trói chặt với VnPay.
        this.gateway = new VnPayGateway();
    }

    public void checkout() {
        gateway.pay();
    }
}

// ---------------- KỊCH BẢN 2: TỐT (DÙNG DI) ----------------
class GoodOrderService {
    // Luôn phụ thuộc vào Interface, không phụ thuộc vào class cụ thể!
    private final PaymentGateway gateway;

    // Không dùng new! Yêu cầu kẻ khác truyền vào qua Constructor
    public GoodOrderService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void checkout() {
        gateway.pay();
    }
}

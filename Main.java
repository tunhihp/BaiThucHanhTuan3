import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Product product1 = new Product("1", "Gao       ", 30.0);
        Product product2 = new Product("2", "Nuoc mam  ", 20.0);
        Product product3 = new Product("3", "Nuoc tuong", 15.0);
        Product product4 = new Product("4", "Muoi      ", 14.0);
        Product product5 = new Product("5", "Keo       ", 10.0);
        Product product6 = new Product("6", "Duong     ", 22.0);
        Product product7 = new Product("7", "Tieu      ", 10.0);

        Order order = new Order(1, LocalDate.now());

        order.addLineItem(product1, 9);
        order.addLineItem(product2, 5);
        order.addLineItem(product3, 7);
        order.addLineItem(product4, 4);
        order.addLineItem(product5, 7);
        order.addLineItem(product6, 1);
        order.addLineItem(product7, 3);

        double totalCharge = order.calcTotalCharge();


        System.out.println("HOA DON THU: " + order.getOrderID());
        System.out.println("NGAY XUAT HOA DON: " + order.getOrderDate());


        System.out.println("DANH SACH HANG:");

        for (OrderDetail lineItems : order.getLineItems()) {
            System.out.println("STT "+lineItems.getProduct().getProductID()+ " |TEN SP: "+lineItems.getProduct().getDescription()+ " |DON GIA: "+lineItems.getProduct().getPrice()+ " |SO LUONG: " + lineItems.getQuantity()+ " |THANH TIEN: " + lineItems.calcTotalPrice()+"VND");
        }

        System.out.println("THANH TIEN: " + totalCharge+"VND");
    }
}
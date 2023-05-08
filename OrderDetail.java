public class OrderDetail {
    private int quantity;
    private Product product;
    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }
    @Override
    public String toString() {
        return "Product ID: " + product.getProductID() + ", Description: " + product.getDescription() + ", Quantity: " + quantity + ", Total Price: " + calcTotalPrice();
    }
}

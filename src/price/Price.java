package price;

public class Price {
    private String productName;
    private String shopName;
    private double priceHrivhia;

    public Price() {
    }

    public Price(String productName, String shopName, double priceHrivhia) {
        this.productName = productName;
        this.shopName = shopName;
        this.priceHrivhia = priceHrivhia;
    }

    public String getProductName() {
        return productName;
    }

    public String getShopName() {
        return shopName;
    }

    public double getPriceHrivhia() {
        return priceHrivhia;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", priceHrivhia=" + priceHrivhia +
                '}';
    }
}

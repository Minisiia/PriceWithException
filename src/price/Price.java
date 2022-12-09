package price;

public class Price implements Comparable{
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
        return  "productName: " + productName +
                ", shopName: " + shopName +
                ", priceHrivhia:  " + priceHrivhia;
    }

    @Override
    public int compareTo(Object o) {
        return this.shopName.compareTo(((Price)o).shopName);
    }
}

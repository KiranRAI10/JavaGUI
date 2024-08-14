public class Department extends Store {
    private double totalSales;
    private double totalDiscount;
    private String productName;
    private double markedPrice;
    

    public Department(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount, String productName, double markedPrice) {
        super(storeId, storeName, location, openingHour,  totalSales,  totalDiscount);
        this.totalSales = totalSales;
        this.totalDiscount = totalDiscount;
        this.productName = productName;
        this.markedPrice = markedPrice;
    }
   
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMarkedPrice() {
        return markedPrice;
    }

    public void setMarkedPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
    
    public double calculateDiscountPrice(double markedPrice) {
        // Placeholder for discount calculation logic
        // For example, if discount is 10%
        double discountPercentage = 0.10;
        return markedPrice - (markedPrice * discountPercentage);
    }
    

}
    


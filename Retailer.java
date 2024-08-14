public class Retailer extends Store {
    private String purchaseYear; // private=restricted access
    private int vatInclusivePrice;
    private int loyaltyPoints;
    private boolean isOnlinePayment;
    // Constructor for the Retailer class
    public Retailer(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount,
                    String purchaseYear, int vatInclusivePrice, boolean isOnlinePayment, int loyaltyPoints) {
        super(storeId, storeName, location, openingHour, totalSales, totalDiscount);
        this.purchaseYear = purchaseYear;
        this.vatInclusivePrice = vatInclusivePrice;
        this.isOnlinePayment = isOnlinePayment; 
        this.loyaltyPoints = 0;

    }

    // Getter method for purchase year
    public String getPurchaseYear() {
        return purchaseYear;
    }

    // Getter or accessor method for VAT inclusive price
    public int getVatInclusivePrice() {
        return vatInclusivePrice;
    }

    // Getter or accessor method for loyalty points
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // Getter or accessor method for online payment
    public boolean isOnlinePayment() {
        return isOnlinePayment;
    }

    // Setter or mutator method for online payment
    public void setOnlinePayment(boolean newIsOnlinePayment) {
        this.isOnlinePayment = newIsOnlinePayment;
    }

    // Setter method to set loyalty points based on online payment
    public void setLoyaltyPoints(boolean newIsOnlinePayment, int newVatPrice) {
        if (newIsOnlinePayment) {
            loyaltyPoints = (int) (0.01 * newVatPrice);
        
    }
}

    // Method to remove the product based on condition
    public void removeProduct() {
        if (loyaltyPoints == 0 && (purchaseYear.equals("2020") || purchaseYear.equals("2021") || purchaseYear.equals("2022"))) {
            vatInclusivePrice = 0;
            loyaltyPoints = 0;
            isOnlinePayment = false;
        }
    }

    // Display or printing method
    @Override
    public void display() {
        super.display();
        System.out.println("Purchase Year: " + purchaseYear);
        System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
        System.out.println("Loyalty Points: " + loyaltyPoints);
        System.out.println("Online Payment: " + (isOnlinePayment ? "Yes" : "No")); // Display if the payment is online
    }
}

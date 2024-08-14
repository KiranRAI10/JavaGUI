
public class Store
{
    //Attributes of store class
    private int storeId; //private=restricted access
    private String storeName;
    private String location;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
   
    // creating constructor
    public Store(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount)
    {
        this.storeId= storeId;
        this.storeName=storeName;
        this.location=location;
        this.openingHour=openingHour;
         
        //initilizationg total sale zero and discount
        this.totalSales= totalSales;
        this.totalDiscount=totalDiscount;
        
    }
    //getter method
    public int getStoreId()
    {
        return storeId;
    }
    
    //getter method//
    public String getName()
    {
        return storeName;
    }
    //getter method//
    public String getLocation()
    {
        return location;
    }
    //getter method//
    public String getOpeningHour()
    {
        return openingHour;
    }
    public double getTotalSales()
    {
        return totalSales;
    }

    public double getTotalDiscount()
    {
        return totalDiscount;
    }

    // setter method to  total sales//
    public void setTotalSales(double totalSales)
    {
        this.totalSales= totalSales ;
    }
     // setter method for total discount//
    public void setTotalDiscount (double  totalDiscount)
    {
        this.totalDiscount= totalDiscount;
    }

   

    //method display or printing//
      public void display()
    {
        System.out.print("StoreId is :" + storeId);
        System.out.print("store name is:" + storeName);
        System.out.print("location is:" + location);
        System.out.print("opening hour:" + openingHour);
        
        if (totalDiscount==0.0) {
            System.out.println("there is no discount.");
        } else {
        //    System.out.println("Total sale is:" + totalSales);
           System.out.println("Total Discount is:" + totalDiscount);
        }
    }
}
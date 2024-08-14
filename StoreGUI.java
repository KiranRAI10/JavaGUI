
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.util.ArrayList;
import java.awt.Font;

public class StoreGUI {

    private JFrame frame;
    private JLabel title;
    private JLabel storeId;
    private JLabel storeId2;
    private JLabel storeId3;
    private JLabel storeId4;
    private JTextField storeId4TF;
    private JTextField storeId3TF;
    private JTextField storeIdTF;
    private JTextField storeId2TF;
    private JLabel storeName;
    private JTextField storeNameTF;
    private JLabel storename2;
    private JTextField storename2TF;
    private JLabel productid;
    private JTextField productidTF;
    private JLabel location;
    private JTextField locationTF;
    private JLabel openingHour;
    private JTextField openingHourTF;
    private JLabel totalSales;
    private JTextField totalSalesTF;
    private JLabel totalDiscount;
    private JTextField totalDiscountTF;
    private JLabel vatInclusivePrice;
    private JTextField vatInclusiveTF;
    private JLabel ispaymentonline;
    private JCheckBox ispaymentonlineTF;
    private JLabel purchaseyear;
    private JComboBox<Integer> purchasedyear;
    private JLabel productName;
    private JTextField productNameTF;
    private JLabel markedPrice;
    private JTextField markedPriceTF;
    private JTextField markedPrice1TF;
    private JButton addDepartment;
    private JButton addRetailer;
    private JButton discountprice;
    private JButton setloyaltypoints;
    private JButton removeproduct;
    private JButton display;
    private JButton displayDepartment;
    private JButton clear;
    private JLabel totalSales2;
    private JLabel openinghour2;
    private JLabel location2;
    private JLabel totaldiscount2;
    private JTextField totaldiscount2TF;
    private JTextField totalSale2TF;
    private JTextField openinghour2TF;
    private JTextField location2TF;
    private JLabel storetitle;
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel title3;

    private JLabel title5;
    private JLabel title4;
    private JLabel ispaymentonline1;
    private JCheckBox ispaymentonline1TF;
    private JLabel title2;
    private JLabel isinsale;
    private JCheckBox isinsaleTF;
    // private JLabel vatprice;
    // private JTextField vatpriceTF;

    private ArrayList<Store> storeList = new ArrayList<>();

    public StoreGUI() {
        frame = new JFrame("Store GUI");
        frame.setSize(800, 2000);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        storetitle = new JLabel("STORE GUI");
        storetitle.setFont(new Font("Arial", Font.BOLD, 25));
        storetitle.setBounds(570, 5, 300, 30);
        frame.add(storetitle);

        panel = new JPanel();
        panel.setBounds(10, 35, 650, 380);
        panel.setBackground(Color.white);
        var lineBorder = BorderFactory.createLineBorder(Color.black, 1); // creates border
        panel.setBorder(lineBorder);
        panel.setLayout(null);

        frame.add(panel);

        title = new JLabel("DEPARTMENT");
        title.setBounds(250, 20, 300, 30);
        panel.add(title);

        storeId = new JLabel("ID:");
        storeId.setBounds(20, 75, 100, 30);
        panel.add(storeId);

        storeIdTF = new JTextField();
        storeIdTF.setBounds(130, 75, 130, 30);
        panel.add(storeIdTF);

        storeName = new JLabel("Store Name:");
        storeName.setBounds(20, 120, 100, 30);
        panel.add(storeName);

        storeNameTF = new JTextField();
        storeNameTF.setBounds(130, 120, 130, 30);
        panel.add(storeNameTF);

        location = new JLabel("Location:");
        location.setBounds(20, 165, 100, 30);
        panel.add(location);

        locationTF = new JTextField();
        locationTF.setBounds(130, 165, 130, 30);
        panel.add(locationTF);

        openingHour = new JLabel("OpeningHours:");
        openingHour.setBounds(20, 210, 100, 30);
        panel.add(openingHour);

        openingHourTF = new JTextField();
        openingHourTF.setBounds(130, 210, 130, 30);
        panel.add(openingHourTF);

        totalSales = new JLabel("Total Sales:");
        totalSales.setBounds(350, 75, 100, 30);
        panel.add(totalSales);

        totalSalesTF = new JTextField();
        totalSalesTF.setBounds(460, 75, 130, 30);
        panel.add(totalSalesTF);

        totalDiscount = new JLabel("Total Discount:");
        totalDiscount.setBounds(350, 120, 100, 30);
        panel.add(totalDiscount);

        totalDiscountTF = new JTextField();
        totalDiscountTF.setBounds(460, 120, 130, 30);
        panel.add(totalDiscountTF);

        productName = new JLabel("Product Name:");
        productName.setBounds(350, 165, 100, 30);
        panel.add(productName);

        productNameTF = new JTextField();
        productNameTF.setBounds(460, 165, 130, 30);
        panel.add(productNameTF);

        markedPrice = new JLabel("Marked Price:");
        markedPrice.setBounds(350, 210, 100, 30);
        panel.add(markedPrice);

        markedPriceTF = new JTextField();
        markedPriceTF.setBounds(460, 210, 130, 30);
        panel.add(markedPriceTF);

        addDepartment = new JButton("Add Department");
        addDepartment.setBounds(140, 300, 150, 30);
        addDepartment.setBackground(Color.lightGray);
        panel.add(addDepartment);

        // Adding ActionListener to addDepartment button
        addDepartment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve values from the input fields and trim spaces
                String storeIdText = storeIdTF.getText().trim();
                String txtStoreName = storeNameTF.getText().trim();
                String txtLocation = locationTF.getText().trim();
                String txtOpeningHour = openingHourTF.getText().trim();
                String totalSalesText = totalSalesTF.getText().trim();
                String totalDiscountText = totalDiscountTF.getText().trim();
                String txtProductName = productNameTF.getText().trim();
                String markedPriceText = markedPriceTF.getText().trim();
        
                // Validate all fields
                if (storeIdText.isEmpty() || txtStoreName.isEmpty() || txtLocation.isEmpty() || txtOpeningHour.isEmpty() ||
                    totalSalesText.isEmpty() || totalDiscountText.isEmpty() || txtProductName.isEmpty() || markedPriceText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields", "ERROR: Incomplete", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Convert text fields to appropriate data types
                int storeId;
                double totalSales;
                double totalDiscount;
                double markedPrice;
        
                try {
                    storeId = Integer.parseInt(storeIdText);
                    totalSales = Double.parseDouble(totalSalesText);
                    totalDiscount = Double.parseDouble(totalDiscountText);
                    markedPrice = Double.parseDouble(markedPriceText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error: Invalid value", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Check if the marked price is greater than 0
                if (markedPrice <= 0) {
                    JOptionPane.showMessageDialog(frame, "Marked Price must be greater than 0", "Error: Invalid value", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Check if a Department with the same ID already exists
                for (Store store : storeList) {
                    if (store instanceof Department && store.getStoreId() == storeId) {
                        JOptionPane.showMessageDialog(frame, "Department with this Store ID already exists", "Error: Duplicate ID", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
        
                // Create a new Department object
                Department obj = new Department(storeId, txtStoreName, txtLocation, txtOpeningHour, totalSales, totalDiscount, txtProductName, markedPrice);
        
                // Add the Department object to the list
                storeList.add(obj);
        
                // Show a confirmation message
                JOptionPane.showMessageDialog(frame, "Department added successfully", "Completed", JOptionPane.INFORMATION_MESSAGE);
            }
        });
         
        displayDepartment = new JButton("Diplay");
        displayDepartment.setBounds(310, 300, 150, 30);
        displayDepartment.setBackground(Color.lightGray);
        panel.add(displayDepartment);

        displayDepartment.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        // Check if any of the text fields are empty
        if (storeIdTF.getText().isEmpty() || storeNameTF.getText().isEmpty() || locationTF.getText().isEmpty() ||
            openingHourTF.getText().isEmpty() || totalSalesTF.getText().isEmpty() || totalDiscountTF.getText().isEmpty() ||
            productNameTF.getText().isEmpty() || markedPriceTF.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Loop through the storeList and display information for Department objects
            for (Store store : storeList) {
                if (store instanceof Department) {
                    Department dept = (Department) store;
                    System.out.println("Store ID: " + dept.getStoreId());
                    System.out.println("Store Name: " + dept.getName());
                    System.out.println("Location: " + dept.getLocation());
                    System.out.println("Opening Hour: " + dept.getOpeningHour());
                    System.out.println("Total Sales: " + dept.getTotalSales());
                    System.out.println("Total Discount: " + dept.getTotalDiscount());
                    System.out.println("Product Name: " + dept.getProductName());
                    System.out.println("Marked Price: " + dept.getMarkedPrice());
                }
            }
        }
    }
});


                                                                                                                                                          
                

                
        panel1 = new JPanel();
        panel1.setBounds(10, 420, 650, 400);
        panel1.setBackground(Color.white);
        var lineBorder1 = BorderFactory.createLineBorder(Color.black, 1);// creating boarder and adding in variable
        panel1.setBorder(lineBorder1);
        panel1.setLayout(null);
        frame.add(panel1);

        title2 = new JLabel("RETAILER");
        title2.setBounds(250, 20, 300, 30);
        panel1.add(title2);

        storeId2 = new JLabel("ID:");
        storeId2.setBounds(20, 75, 100, 30);
        panel1.add(storeId2);

        storeId2TF = new JTextField();
        storeId2TF.setBounds(130, 75, 130, 30);
        panel1.add(storeId2TF);

        location2 = new JLabel("Location:");
        location2.setBounds(20, 120, 100, 30);
        panel1.add(location2);

        location2TF = new JTextField();
        location2TF.setBounds(130, 120, 130, 30);
        panel1.add(location2TF);

        openinghour2 = new JLabel("Opening Hours:");
        openinghour2.setBounds(20, 165, 100, 30);
        panel1.add(openinghour2);

        openinghour2TF = new JTextField();
        openinghour2TF.setBounds(130, 165, 130, 30);
        panel1.add(openinghour2TF);

        purchaseyear = new JLabel("Purchase Year:");
        purchaseyear.setBounds(20, 210, 100, 30);
        panel1.add(purchaseyear);

        Integer[] purchasedYear = { 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024 };
        purchasedyear = new JComboBox<>(purchasedYear);
        purchasedyear.setBounds(130, 210, 130, 30);
        purchasedyear.setBackground(Color.lightGray);
        panel1.add(purchasedyear);

        storename2 = new JLabel("Name:");
        storename2.setBounds(20, 270, 100, 30);
        panel1.add(storename2);

        storename2TF = new JTextField();
        storename2TF.setBounds(130, 270, 130, 30);
        panel1.add(storename2TF);


        totalSales2 = new JLabel("Total Sales:");
        totalSales2.setBounds(350, 75, 100, 30);
        panel1.add(totalSales2);

        totalSale2TF = new JTextField();
        totalSale2TF.setBounds(460, 75, 130, 30);
        panel1.add(totalSale2TF);

        vatInclusivePrice = new JLabel("VAT Inclusive:");
        vatInclusivePrice.setBounds(350, 120, 100, 30);
        panel1.add(vatInclusivePrice);

        vatInclusiveTF = new JTextField();
        vatInclusiveTF.setBounds(460, 120, 130, 30);
        panel1.add(vatInclusiveTF);

        totaldiscount2 = new JLabel("Total Discount:");
        totaldiscount2.setBounds(350, 165, 100, 30);
        panel1.add(totaldiscount2);

        totaldiscount2TF = new JTextField();
        totaldiscount2TF.setBounds(460, 165, 130, 30);
        panel1.add(totaldiscount2TF);

        ispaymentonline1 = new JLabel("IsPaymentOnline:");
        ispaymentonline1.setBounds(350, 210, 110, 30);
        panel1.add(ispaymentonline1);

        ispaymentonlineTF = new JCheckBox();
        ispaymentonlineTF.setBounds(460, 210, 130, 30);
        panel1.add(ispaymentonlineTF);

       

        addRetailer = new JButton("Add Retailer");
        addRetailer.setBounds(480, 260, 150, 30);
        addRetailer.setBackground(Color.lightGray);
        panel1.add(addRetailer);

       
        addRetailer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve values from the input fields
                String storeIdText = storeId2TF.getText();
                String txtStoreName = storename2TF.getText();
                String txtLocation = location2TF.getText();
                String txtOpeningHour = openinghour2TF.getText();
                String totalSalesText = totalSale2TF.getText();
                String totalDiscountText = totaldiscount2TF.getText();
                String vatInclusivePriceText = vatInclusiveTF.getText();
                boolean paymentOnline = ispaymentonlineTF.isSelected();
                String purchaseYear = purchasedyear.getSelectedItem().toString(); 
        
                // Validate all fields
                if (storeIdText.isEmpty() || txtStoreName.isEmpty() || txtLocation.isEmpty() || txtOpeningHour.isEmpty() ||
                    totalSalesText.isEmpty() || totalDiscountText.isEmpty() || vatInclusivePriceText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields", "ERROR: Incomplete", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                int storeId;
                double totalSales;
                double totalDiscount;
                int vatInclusivePrice;
        
                try {
                    storeId = Integer.parseInt(storeIdText);
                    totalSales = Double.parseDouble(totalSalesText);
                    totalDiscount = Double.parseDouble(totalDiscountText);
                    vatInclusivePrice = Integer.parseInt(vatInclusivePriceText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error: Invalid value", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Check if a Retailer with the same ID already exists
                for (Store store : storeList) {
                    if (store instanceof Retailer && store.getStoreId() == storeId) {
                        JOptionPane.showMessageDialog(frame, "Retailer with this Store ID already exists", "Error: Duplicate ID", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
        
                // Create and add a new Retailer object
                Retailer obj = new Retailer(storeId, txtStoreName, txtLocation, txtOpeningHour, totalSales, totalDiscount, purchaseYear, vatInclusivePrice, paymentOnline, 0);
                storeList.add(obj);
                JOptionPane.showMessageDialog(frame, "Retailer added successfully", "Completed", JOptionPane.INFORMATION_MESSAGE);
            }
        });
                
        display = new JButton("Display");
display.setBounds(297, 260, 150, 30);
display.setBackground(Color.lightGray);
panel1.add(display);

display.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Check if any of the relevant text fields are empty
        if (storeId2TF.getText().isEmpty() || storename2TF.getText().isEmpty() || location2TF.getText().isEmpty() ||
            openinghour2TF.getText().isEmpty() || totalSale2TF.getText().isEmpty() || totaldiscount2TF.getText().isEmpty() ||
            vatInclusiveTF.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(frame, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Loop through the storeList and display information for Retailer objects
            for (Store store : storeList) {
                if (store instanceof Retailer) {
                    Retailer retailer = (Retailer) store;
                    System.out.println("Store ID: " + retailer.getStoreId());
                    System.out.println("Store Name: " + retailer.getName());
                    System.out.println("Location: " + retailer.getLocation());
                    System.out.println("Opening Hour: " + retailer.getOpeningHour());
                    System.out.println("Total Sales: " + retailer.getTotalSales());
                    System.out.println("Total Discount: " + retailer.getTotalDiscount());
                    System.out.println("VAT Inclusive Price: " + retailer.getVatInclusivePrice());
                    System.out.println("Is Payment Online: " + (retailer.isOnlinePayment() ? "Yes" : "No"));
                    System.out.println("Purchase Year: " + retailer.getPurchaseYear());
                    System.out.println("Loyalty Points: " + retailer.getLoyaltyPoints()); // Added loyalty points display
                }
            }
        }
    }
});

        


        panel2 = new JPanel();
        panel2.setBounds(665, 35, 380, 290);
        panel2.setBackground(Color.white);
        var lineBorder2 = BorderFactory.createLineBorder(Color.black, 1);// creating boarder and adding in variable
        panel2.setBorder(lineBorder2);
        panel2.setLayout(null);
        frame.add(panel2);

        title3 = new JLabel("DISCOUNT");
        title3.setBounds(150, 11, 300, 30);
        panel2.add(title3);

        storeId3 = new JLabel("ID:");
        storeId3.setBounds(20, 75, 100, 30);
        panel2.add(storeId3);

        storeId3TF = new JTextField();
        storeId3TF.setBounds(130, 75, 130, 30);
        panel2.add(storeId3TF);

        isinsale = new JLabel("isInSale:");
        isinsale.setBounds(20, 165, 100, 30);
        panel2.add(isinsale);

        isinsaleTF = new JCheckBox();
        isinsaleTF.setBounds(130, 165, 130, 30);
        panel2.add(isinsaleTF);

        discountprice = new JButton("Discount");
        discountprice.setBounds(130, 230, 150, 30);
        discountprice.setBackground(Color.lightGray);
        panel2.add(discountprice);

        discountprice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String storeIdText = storeId3TF.getText();
                boolean isInSale = isinsaleTF.isSelected();
        
                // Validate the input fields
                if (storeIdText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter Store ID", "ERROR: Incomplete", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                int storeId;
                try {
                    storeId = Integer.parseInt(storeIdText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid Store ID", "Error: Invalid value", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Iterate through the storeList to find the matching store ID
                for (Store store : storeList) {
                    if (store instanceof Department && store.getStoreId() == storeId) {
                        Department dept = (Department) store;
        
                        if (!isInSale) {
                            JOptionPane.showMessageDialog(frame, "Not in Sale", "Info", JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
        
                        // Calculate discount price
                        double discountPrice = dept.calculateDiscountPrice(dept.getMarkedPrice());
                        JOptionPane.showMessageDialog(frame, "Discount Price: " + discountPrice, "Discount Calculated", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
        
                // If no matching store ID is found
                JOptionPane.showMessageDialog(frame, "Store ID not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
                
        
        panel3 = new JPanel();
        panel3.setBounds(1050, 35, 380, 290);
        panel3.setBackground(Color.white);
        var lineBorder3 = BorderFactory.createLineBorder(Color.black, 1);// creating boarder and adding in variable
        panel3.setBorder(lineBorder3);
        panel3.setLayout(null);
        frame.add(panel3);

        title4 = new JLabel("LOYALITY POINT");
        title4.setBounds(150, 11, 300, 30);
        panel3.add(title4);

        storeId4 = new JLabel(" RetailerID:");
        storeId4.setBounds(20, 75, 100, 30);
        panel3.add(storeId4);

        storeId4TF = new JTextField();
        storeId4TF.setBounds(130, 75, 130, 30);
        panel3.add(storeId4TF);

        // vatprice = new JLabel("VAT Price:");
        // vatprice.setBounds(20, 120, 100, 30);
        // panel3.add(vatprice);

        // vatpriceTF = new JTextField();
        // vatpriceTF.setBounds(130, 120, 130, 30);
        // panel3.add(vatpriceTF);

        ispaymentonline = new JLabel("isPaymentOnline:");
        ispaymentonline.setBounds(20, 165, 110, 30);
        panel3.add(ispaymentonline);

        ispaymentonline1TF = new JCheckBox();
        ispaymentonline1TF.setBounds(150, 165, 20, 30);
        panel3.add(ispaymentonline1TF);

        setloyaltypoints = new JButton("SetLoyalityPoint");
        setloyaltypoints.setBounds(130, 230, 150, 30);
        setloyaltypoints.setBackground(Color.lightGray);
        panel3.add(setloyaltypoints);

        setloyaltypoints.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String storeIdText = storeId4TF.getText().trim();
                String vatPriceText = vatInclusiveTF.getText().trim();
                boolean isPaymentOnline = ispaymentonline1TF.isSelected();
        
                // Validate the input fields
                if (storeIdText.isEmpty() ) {
                    JOptionPane.showMessageDialog(frame, "Please enter Store ID and VAT Price", "ERROR: Incomplete", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                int storeId;
                int vatPrice;
        
                try {
                    storeId = Integer.parseInt(storeIdText);
                    vatPrice = Integer.parseInt(vatPriceText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error: Invalid value", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                // Iterate through the storeList to find the matching store ID
                for (Store store : storeList) {
                    if (store instanceof Retailer && store.getStoreId() == storeId) {
                        Retailer retailer = (Retailer) store;

                        if (!isPaymentOnline){
                            JOptionPane.showMessageDialog(frame, "Loyalty Points not set","Error: Invalid request", JOptionPane.ERROR_MESSAGE);
                            return;
                        }


        
                        // Set loyalty points using the Retailer's method
                        retailer.setLoyaltyPoints(isPaymentOnline, vatPrice);
        
                        JOptionPane.showMessageDialog(frame, "Loyalty Points set successfully", "Completed", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
        
                // If no matching store ID is found
                JOptionPane.showMessageDialog(frame, "Store ID not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        panel4 = new JPanel();
        panel4.setBounds(850, 330, 380, 290);
        panel4.setBackground(Color.white);
        var lineBorder4 = BorderFactory.createLineBorder(Color.black, 1);// creating boarder and adding in variable
        panel4.setBorder(lineBorder4);
        panel4.setLayout(null);
        frame.add(panel4);

        title5 = new JLabel("REMOVE PRODUCT");
        title5.setBounds(150, 20, 300, 30);
        panel4.add(title5);

        productid = new JLabel("Product ID:");
        productid.setBounds(20, 150, 100, 30);
        panel4.add(productid);

        productidTF = new JTextField();
        productidTF.setBounds(130, 150, 130, 30);
        panel4.add(productidTF);

        removeproduct = new JButton("Remove Product");
        removeproduct.setBounds(130, 230, 150, 30);
        removeproduct.setBackground(Color.lightGray);
        panel4.add(removeproduct);

        removeproduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String storeIdText = productidTF.getText();
        
                // Check if the store ID field is empty
                if (storeIdText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a Store ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                int storeId;
                try {
                    storeId = Integer.parseInt(storeIdText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for Store ID", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
        
                boolean productRemoved = false;
        
                // Loop through the storeList to find the matching store ID
                for (Store store : storeList) {
                    if (store.getStoreId() == storeId) {
                        if (store instanceof Retailer) {
                            Retailer retailer = (Retailer) store;
                            retailer.removeProduct(); // Call the removeProduct method from Retailer class
                            JOptionPane.showMessageDialog(frame, "Product removed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                            productRemoved = true;
                            break;
                        }
                    }
                }
        
                // If no product was removed, show an error message
                if (!productRemoved) {
                    JOptionPane.showMessageDialog(frame, "No matching Store ID found or the Store is not a Retailer", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
       

        clear = new JButton("Clear");
        clear.setBounds(1050, 650, 150, 30);
        clear.setBackground(Color.lightGray);
        frame.add(clear);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Debugging: Print statements to see which components are cleared
                // System.out.println("Clearing Department Section");
                storeIdTF.setText("");
                storeNameTF.setText("");
                locationTF.setText("");
                openingHourTF.setText("");
                totalSalesTF.setText("");
                totalDiscountTF.setText("");
                productNameTF.setText("");
                markedPriceTF.setText("");                
                vatInclusivePrice.setText("");
                ispaymentonlineTF.setSelected(false);
                purchasedyear.setSelectedIndex(0);
        
                // System.out.println("Clearing Retailer Section");
                storeId2TF.setText("");
                storename2TF.setText("");
                location2TF.setText("");
                openinghour2TF.setText("");
                totalSale2TF.setText("");
                totaldiscount2TF.setText("");
                vatInclusiveTF.setText("");
                ispaymentonline1TF.setSelected(false);
                purchasedyear.setSelectedIndex(0);
        
                // System.out.println("Clearing Product Removal Section");
                storeId3TF.setText("");  
                productidTF.setText("");
        
                // System.out.println("Clearing Loyalty Points Section");
                storeId4TF.setText("");  
                // vatpriceTF.setText("");  
                ispaymentonline1TF.setSelected(false); 
            }
        });
        
        frame.setVisible(true);
    }

    

    
       
    public static void main(String[] args) {
        new StoreGUI();

    }
    

}

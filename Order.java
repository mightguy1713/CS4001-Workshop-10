package Week_10;

public class Order
{
    private int orderId;
    private String customerName;
    private double amount;
    //Constructor.
    public Order(int orderId , String customerName , double amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
    //Getter / Setter.
    public int getorderId(){
        return orderId;
    }
    public void setorderId(int getorderId){
        this.orderId = orderId;
    }
    
    public String getcustomerName(){
        return customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public double getamount(){
        return amount;
    }
    public void setamount(double getamount){
        this.amount = amount;
    }
    
    public double calculateFinalAmount(){
        return amount;
    }
    
    public String toString(){
        return "Order ID : " + orderId + "Customer Name : " + customerName + "Amount :" +amount;
    }
}
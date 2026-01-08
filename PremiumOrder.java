package Week_10;

public class PremiumOrder extends Order
{
    public PremiumOrder(int orderId , String customerName , double amount){
        super(orderId , customerName , amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        double premium = getamount() * 0.10;
        return super.calculateFinalAmount() + premium;
    }
    
    //Overload.
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
}
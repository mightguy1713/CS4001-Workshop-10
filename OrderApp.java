package Week_10;

public class OrderApp
{
    public static void main(String [] args){
        NormalOrder n1 = new NormalOrder(101 , "Abdica" , 10000);
        PremiumOrder p1 = new PremiumOrder(39332 , "Abhas" , 25000);
        
        //Normal Order.
        System.out.println("---Invoice for Normal Order---");
        System.out.println("Order Id: " +n1.getorderId());
        System.out.println("Customer Name: " +n1.getcustomerName());
        System.out.println("Amount : " +n1.getamount());
        System.out.println("Final Amount (with delivery): " +n1.calculateFinalAmount());
        System.out.println("Final Amount (with deliver and discount): " +n1.calculateFinalAmount(500));
        
        System.out.println();
        
        //Premium Order.
        System.out.println("---Invoice for Premium Order---");
        System.out.println("Order Id: " +p1.getorderId());
        System.out.println("Customer Name: " +p1.getcustomerName());
        System.out.println("Amount : " +p1.getamount());
        System.out.println("Final Amount : " +p1.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +p1.calculateFinalAmount(1000));
    }
}
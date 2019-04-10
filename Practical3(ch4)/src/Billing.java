public class Billing {
    public static void computerBill(double price){
        double total;
        total=price+price*0.08;
        System.out.println("The total price is: "+total);
    }
    public static void computerBill(double price,int quantity){
        double total;
        total=price*quantity*price*quantity*0.08;
        System.out.println("The total price is: "+total);

    }
    public static void computerBill(double price,int quantity, double coupon){
        double total;
        total=(price*quantity-coupon)+(price*quantity-coupon)*0.08;
        System.out.println("The total price is: "+total);

    }

    public static void main(String[] args){
        computerBill(7.9);
        computerBill(7.9,3);
        computerBill(7.9,3,2);
    }
}

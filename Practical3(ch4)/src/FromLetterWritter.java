public class FromLetterWritter {
    public static void displaySalutation(String lastname){

        System.out.println("Dear Mr. or Ms "+ lastname);
        System.out.println("Thank you for your recent order!");
    }

    public static void displaySalutation(String lastname,String firstname){
        System.out.println("Dear "+ firstname+" "+ lastname);
        System.out.println("Thank you for your recent order!");
    }

    public static void main(String[] args){
        displaySalutation("Quang");
        displaySalutation("Quang","Khai");
    }
}

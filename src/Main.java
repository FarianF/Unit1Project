
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner totalPpl = new Scanner(System.in);
        System.out.println("How man people in your party: ");
        String totalPrice = totalPpl.nextLine();
        int totalPplTwo = Integer.parseInt(totalPrice);


        Scanner billAmt = new Scanner(System.in);
        System.out.println("What is the total amount: ");
        String totalAmt = billAmt.nextLine();
        double totalAmtTwo = Double.parseDouble(totalAmt);


        Scanner tipPercent = new Scanner(System.in);
        System.out.println("What percent do you want to tip: ");
        String tipPrct = tipPercent.nextLine();
        int tipPrctTwo = Integer.parseInt(tipPrct);



    }
}

import java.util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args) {

        boolean running = true;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Hello!" +
                    " This is my currency converter" +
                    " Please, choose one of the options");

            // Printing the options

            System.out.println("1. USD to CAD");
            System.out.println("2. CAD to USD");
            System.out.println("3. BRL to CAD");
            System.out.println("4. CAD to BRL");

            // Adding the cases related to the options

            int exchange = sc.nextInt();
            switch (exchange) {
                case 1 -> {
                    System.out.println("Enter the amount in USD:");
                    double usd = sc.nextDouble();
                    if (usd >= 0) {
                        System.out.println(usd + " USD if equal to " + usd * 1.26 + " CAD. ");

                    } else {
                        System.out.println("The amount need to me in POSITIVE numbers, try it again :)");

                    }

                }
                case 2 -> {
                    System.out.println("Enter the amount in CAD:");
                    double cad = sc.nextDouble();
                    if (cad >= 0) {
                        System.out.println(cad + "CAD if equal to " + cad / 1.26 + " USD. ");

                    } else {
                        System.out.println("The amount need to me in POSITIVE numbers, try it again :)");
                    }

                }

                case 3 -> {
                    System.out.println("Enter the amount in BRL:");
                    double brl = sc.nextDouble();
                    if (brl >= 0) {
                        System.out.println(brl + " BRL if equal to " + brl * 0.22 + " CAD. ");

                    } else {
                        System.out.println("The amount need to me in POSITIVE numbers, try it again :)");
                    }
                }
                case 4 -> {
                    System.out.println("Enter the amount in CAD:");
                    double cad = sc.nextDouble();
                    if (cad >= 0) {
                        System.out.println(cad + " CAD if equal to" + cad / 0.22 + "BRL. ");

                    } else {
                        System.out.println("The amount need to me in POSITIVE numbers, try it again :)");
                    }
                }
            }

            System.out.println("Do you want make another conversion?");
            System.out.println("1. Yes \t\t\t 2. Any other key: No.");
            if(sc.nextInt() !=1){
                running = false;
            }


        } while(running);

        //Exit message

        System.out.println("Thank you for using my currency converter! Took me kinda long to get it done :)");
    }
}
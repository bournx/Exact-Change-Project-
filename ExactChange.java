import java.util.Scanner;

/**
 * Uses an algorithm to give change. 
 *
 * @author Nico Bour
 */
public class ExactChange {
    
    /**
    * uses an algorithm to give change. 
    *
    * @param args - Command Line Arguments
    */
    public static void main(String[] args) {
    
    
        Scanner s = new Scanner(System.in);
        int cash;
        int change;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        double total;
        double changeD;
        
        System.out.print("Total amount? ");
        total = s.nextDouble();
        System.out.print("Cash payment? ");
        cash = s.nextInt();
        System.out.println();
        
        changeD = cash - total;
        cash = cash * 100;
        total = total * 100;
        
        change = cash - (int) Math.round(total);
        dollars = change / 100;
        change = change % 100;
        quarters = change / 25;
        change = change % 25;
        dimes = change / 10;
        change = change % 10;
        nickels = change / 5;
        change = change % 5;
        pennies = change;
 
        System.out.printf("Change Due $%.02f\n\n", changeD);
        if (dollars != 0) {
            if (dollars == 1) {
                System.out.println("1 dollar");
            } else {
                System.out.println(dollars + " dollars");
            }
        } 
        if (quarters != 0) {
            if (quarters == 1) {
                System.out.println("1 quarter");
            } else {
                System.out.println(quarters + " quarters");
            }
        } 
 
        if (dimes != 0) {
            if (dimes == 1) {
                System.out.println("1 dime");
            } else {
                System.out.println(dimes + " dimes");
            }
        } 
        
        if (nickels != 0) {
            if (nickels == 1) {
                System.out.println("1 nickel");
            } else {
                System.out.println(nickels + " nickels");
            }
        }

        if (pennies != 0) {
            if (pennies == 1) {
                System.out.println("1 penny");
            } else {
                System.out.println(pennies + " pennies");
            }
        }     
    }   
}

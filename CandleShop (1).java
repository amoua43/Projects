import java.util.Scanner;
/**
 * ITSC 1212 Candle class for Project 3
 */
public class CandleShop {
// main method
    public static void main(String[] args) {
    
        //create scanner object
        Scanner scnr = new Scanner(System.in);
        //create variables to store type of candles
        int type1,type2,type3;

         // take user input of candle type 1
        System.out.println("Enter number of candles you want to buy of Type 1");
        type1 = scnr.nextInt();
        String name1 = "Birthday";
        // take user input of candle type 2
        System.out.println("Enter number of candles you want to buy of Type 2");
        type2 = scnr.nextInt();
        String name2 = "TeaLight";
        // take user input of candle type 3
        System.out.println("Enter number of candles you want to buy of Type 3");
        type3 = scnr.nextInt();
        String name3 = "Pillar";
        // create varible to store total price
        double totalPrice = 0.0;
        // multiply number of candles by their price and sum in the total price
        totalPrice+=(type1*5.99);
        totalPrice+=(type2*10.99);
        totalPrice+=(type3*14.99);
        // create variable for total burn time
        int totalBurnTime = 0;
        // multiply number of candles by their burn time and sum in the total price
        totalBurnTime+=(type1*3);
        totalBurnTime+=(type2*4);
        totalBurnTime+=(type3*5);
        // calculate cost per minute, also convert the time in minutes by multiplying it by 60
        double costPerMinute = (totalPrice/(totalBurnTime*60));
        // Create variable to store discountPrice
        double discountPrice = 0.0;
        // If price is more than 20, but less than 35, multiply by .05 and then subtract discount value from total price.
        if (totalPrice>20 && totalPrice <35){
        double discount = (totalPrice * .05);
        discountPrice = (totalPrice - discount);
        }
        // If price is greater than 35, but less than 55, multiply by .07 and then subtract discount value from total price.
        else if(totalPrice>35 && totalPrice <55){
        double discount = (totalPrice * .07);
        discountPrice = (totalPrice - discount);
        }
        // If price is greater than 55, but less than 100, multiple by .1 and then subtract discount value from total price.
        else if(totalPrice>55 && totalPrice <100){
        double discount = (totalPrice * .1);
         discountPrice = (totalPrice - discount);
        }
        // If price is more than 100, then multiple by .2 and then subtract discount value from total price. 
        else if(totalPrice>100){
        double discount = (totalPrice * .2);
        discountPrice = (totalPrice - discount);
        // Earn 1 point for every 10 purchase
        int totalCandle = type1+type2+type3;
        int pointsEarned = totalCandle/10;
        // Display the results...
        System.out.println("Total candles of Type 1: " + type1 + name1);
        System.out.println("Total candles of Type 2: " + type2 + name2);
        System.out.println("Total candles of Type 3: " + type3 + name3);
        System.out.println("Total price of candles: " + totalPrice);
        System.out.println("Total burn time of candles: " + totalBurnTime);
        System.out.println("Cost per minute: " + costPerMinute);
        System.out.println("Total price after discount is: " + discountPrice);
        // Output bonus points for each multiple of 10
        System.out.println("Number of Points Earned: " + pointsEarned); 
        // Histogram Output
        System.out.println("Histogram of how many candles bought: ");
        System.out.println(type1);
            for (int i = 0; i < type1; i++) {
                System.out.print("&");
            }
            System.out.println();
            System.out.println(type2);
            for (int i = 0; i < type2; i++) {
                System.out.print("@");
            }
            System.out.println();
            System.out.println(type3);
            for (int i = 0; i < type3; i++) {
                System.out.print("#");
            }
        
        }
    }
    }
    
       



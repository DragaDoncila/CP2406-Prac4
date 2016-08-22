import java.util.Scanner;

/**Class designed to ask user for the type of room they would like, and display choice with appropriate price. Also asks
 * user if they have a parking preference and prices appropriately.
 * Created by Draga on 10/08/2016.
 */
public class CondoSales {
    static final int PARK_PRICE = 150000;
    static final int GOLF_PRICE = 170000;
    static final int LAKE_PRICE = 210000;
    static final int GARAGE_PRICE = 5000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your choice of condo \nChoose 1 for Park View \nChoose 2 for Golf View \nChoose 3 for Lake View \n>>>");
        int roomChoice = input.nextInt();
        int roomPrice;
        switch (roomChoice){
            case 1:
                System.out.println("You chose a Park View room.");
                System.out.println("The cost is $" + PARK_PRICE);
                roomPrice = PARK_PRICE;
                break;
            case 2:
                System.out.println("You chose a Golf View room.");
                System.out.println("The cost is $" + GOLF_PRICE);
                roomPrice = GOLF_PRICE;
                break;
            case 3:
                System.out.println("You chose a Lake View room.");
                System.out.println("The cost is $" + LAKE_PRICE);
                roomPrice = LAKE_PRICE;
                break;
            default:
                System.out.println("Invalid room choice.");
                System.out.println("The cost is $0.00");
                roomPrice = 0;
        }

        if (roomChoice == 1 || roomChoice == 2 || roomChoice == 3){
            System.out.printf("What is your parking preference? \nChoose 1 for a garage \nChoose 2 for park space \n>>>");
            int parkChoice = input.nextInt();
            switch (parkChoice){
                case 1:
                    System.out.println("You chose a garage. Good choice!");
                    System.out.println("Your total cost is $" + (roomPrice + GARAGE_PRICE));
                    break;
                case 2:
                    System.out.println("You're a cheapskate who wants a parking space for nothing.");
                    System.out.println("Your total cost is $" + roomPrice);
                    break;
                default:
                    System.out.println("You made an invalid parking choice.");
                    System.out.println("Your total cost is $" + roomPrice);

            }
        }
        else{
            System.out.println("That's all folks!");
        }
    }
}

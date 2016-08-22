import java.util.Scanner;

/**Suggests appropriate phone plan based on talk minutes, text messages and data needed by the user.
 * Created by Draga on 10/08/2016.
 */
public class CellPhoneService {
    static final int PLAN_A_PRICE = 49;
    static final int PLAN_B_PRICE = 55;
    static final int PLAN_C_PRICE = 61;
    static final int PLAN_D_PRICE = 70;
    static final int PLAN_E_PRICE = 79;
    static final int PLAN_F_PRICE = 87;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many minutes do you need a month?>>> ");
        int minutes = input.nextInt();
        System.out.printf("How much data do you need a month in GB?>>> ");
        int data = input.nextInt();
        System.out.printf("How many text messages do you need a month?>>> ");
        int texts = input.nextInt();

        if (data > 0){
            if (data < 2){
                System.out.println("The best plan for you is Plan E priced at $" + PLAN_E_PRICE);
            }
            else{
                System.out.println("The best plan for you is Plan F priced at $" + PLAN_F_PRICE);
            }
        }
        else{
            if (minutes < 500){
                if (texts == 0){
                    System.out.println("The best plan for you is Plan A priced at $" + PLAN_A_PRICE);
                }
                else{
                    System.out.println("The best plan for you is Plan B priced at $" + PLAN_B_PRICE);
                }
            }
            else{
                if (texts <= 100){
                    System.out.println("The best plan for you is Plan C priced at $" + PLAN_C_PRICE);
                }
                else{
                    System.out.println("The best plan for you is Plan D priced at $" + PLAN_D_PRICE);
                }
            }
        }
    }
}

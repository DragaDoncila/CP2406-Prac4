import java.util.Scanner;

/**Checks whether user entered integer is even or odd and displays result
 * Created by Draga on 10/08/2016.
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is your integer?>>> ");
        int userNum = input.nextInt();
        if (userNum % 2 == 0) {
            System.out.println("Your number was even");
        }
        else
            System.out.println("Your number was odd");
    }
}

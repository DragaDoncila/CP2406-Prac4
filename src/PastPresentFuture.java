import java.time.LocalDate;
import java.util.Scanner;

/**Checks whether user entered date is in the past, present, or future, and displays as such.
 * Created by Draga on 10/08/2016.
 */
public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("What is the current day?>>> ");
        int day = input.nextInt();
        System.out.printf("What is the current month?>>> ");
        int month = input.nextInt();
        System.out.printf("What is the current year?>>>");
        int year = input.nextInt();

        LocalDate userDate = LocalDate.of(year, month, day);
        LocalDate todayDate = LocalDate.now();

        if (userDate.getYear() != todayDate.getYear()){
            System.out.println("Date is not this year!");
        }
        else{

        }
    }
}

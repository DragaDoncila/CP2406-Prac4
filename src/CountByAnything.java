import java.util.Scanner;

/**Class designed to count in increments entered by the user
 * Created by Draga on 22/08/2016.
 */
public class CountByAnything {
    final static int LOW_BOUNDARY = 3;
    final static int HIGH_BOUNDARY = 300;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What would you like to count by? >>>");
        int incrementValue = input.nextInt();

        for (int i = LOW_BOUNDARY, count = 0; i <= HIGH_BOUNDARY; i += incrementValue){
            System.out.printf(i + "\t");
            ++count;
            if (count % 10 == 0){
                System.out.println();
            }
        }

    }
}

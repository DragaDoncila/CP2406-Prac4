import java.util.Scanner;

/**Class takes 3 integers from user and displays them in ascending, and then
 * descending order
 * Created by Draga on 10/08/2016.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("First integer>>> ");
        int firstInt = input.nextInt();
        System.out.printf("Second integer>>>");
        int secondInt = input.nextInt();
        System.out.printf("Third integer>>>");
        int thirdInt = input.nextInt();



        if (firstInt > secondInt && firstInt > thirdInt){
//            print first int
            System.out.printf(firstInt + " ");
            if (secondInt > thirdInt){
                System.out.printf(" " + secondInt);
                System.out.printf(" " + thirdInt);
            }
            else{
                System.out.printf(" " + thirdInt);
                System.out.printf(" " + secondInt);
            }
        }
        else {
            if (secondInt > firstInt && secondInt > thirdInt){
                System.out.printf(" " + secondInt);
                if (firstInt > thirdInt){
                    System.out.printf(" " + firstInt);
                }
                else{
                    System.out.printf(" " + thirdInt);
                    System.out.printf(" " + firstInt);
                }
            }
            else{
                System.out.printf(" " + thirdInt);
                if (firstInt > secondInt){
                    System.out.printf(" " + firstInt);
                    System.out.printf(" " + secondInt);
                }
                else{
                    System.out.printf(" " + secondInt);
                    System.out.printf(" " + firstInt);
                }
            }
        }
    }
}

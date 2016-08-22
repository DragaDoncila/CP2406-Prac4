import javax.swing.*;

/**Ask user for even numbers until they choose to quit
 * Created by Draga on 22/08/2016.
 */
public class EvenEntryLoop {
    final static int SENTINEL = 999;
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Keep entering even numbers, enter " + SENTINEL + " to quit");
        String userEntry = JOptionPane.showInputDialog("Please enter a number:");
        int userNum = Integer.parseInt(userEntry);
        while (userNum != 999){
            if (userNum % 2 == 0){
                JOptionPane.showMessageDialog(null, "Good job!");
            }
            else{
                JOptionPane.showMessageDialog(null, "That is not an even number!");
            }
            userEntry = JOptionPane.showInputDialog("Please enter a number:");
            userNum = Integer.parseInt(userEntry);
        }
        JOptionPane.showMessageDialog(null, "Thank you for playing!");
    }
}

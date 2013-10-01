/*
 * Author: Tran Thuy Tien 
 */

/* Describe: 
 * This class contains several method to show some dialog box
 * Created date:  01/10/2013
 */
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class DialogBox {
    Scanner reader = new Scanner(System.in);
    Random random = new Random();
    
    void showMessageDialog () {
        JOptionPane.showMessageDialog(null, "Hello", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    void showInputDialog () {
        String num = JOptionPane.showInputDialog(null, "How old are you?", "Question:", JOptionPane.QUESTION_MESSAGE);
        int number = Integer.parseInt(num);
        if (number < 18) JOptionPane.showMessageDialog(null, "You are not allowed to sign in!", "Message", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "You are allowed to sign in!", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
    void sampleOptionPane () throws Exception {
        int i = gettingInput();
        if (i == 0) {
            int i0 = gettingOptions();
            switch (i0) {
                case 0 : System.out.println("Please go to \"Castle\" for the next step"); break;
                case 1 : System.out.println("Please go to \"Forest\" for the next step"); break;
                case 2 : System.out.println("Please go to \"Village\" for the next step");break;
                case 3 : System.out.println("Goodbye!");
            }
        }
        
        else if (i == 1) {
            System.out.println("Please enter your ID number: ");
            String id = (String)JOptionPane.showInputDialog(null, "ID number", null,JOptionPane.PLAIN_MESSAGE,null, null,null);
            if (id == null) System.out.println("Bye!");
            else {
                int idnum = Integer.parseInt(id);
                while (idnum < 0 || idnum > 10 ) {
                    System.out.println("Invalid! ID number must be between 0 and 10. Try again!");
                    id = (String)JOptionPane.showInputDialog(null, "ID number", null,JOptionPane.PLAIN_MESSAGE,null, null,null); 
                    idnum = Integer.parseInt(id);

                } 
            int point = random.nextInt(10);
            JOptionPane.showMessageDialog(null, point, "Point", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else System.out.println("Bye!");
        
    }
    
    int gettingInput () {
        Object[] options = {"New member", "Current member"};
        int choice = JOptionPane.showOptionDialog(null, "You are....?", "???", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        return choice;
    }
    
    int gettingOptions () {
        Object[] possibilities = {"Swordsman", "Archer", "Mage"};
        String select = (String)JOptionPane.showInputDialog(null, "Please select a character", null,JOptionPane.PLAIN_MESSAGE,null, possibilities,null);
        int choice;
        if (select == "Swordsman") choice = 0;
        else if (select == "Archer") choice = 1;
        else if (select == "Mage") choice = 2;
        else choice = 4;
        return choice;
    }
}

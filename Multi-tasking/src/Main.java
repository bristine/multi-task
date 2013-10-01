/*
 * Author: Tran Thuy Tien 
 */

/* Describe: 
 * This class contains several method to show some dialog box
 * Created date:  01/10/2013
 */

public class Main {
    public static void main(String[] args) {
        
        DialogBox showing = new DialogBox();
        try {
        showing.sampleOptionPane();
        }
        catch (Exception ex) {
            System.out.println("Error!");
        }
    }
}

/*
 * Selection 1: Would you like arches?
 * Selection 2: Would you like patterns?
 * Selection 3: Would you like to extend these to the sides?
 * Selection 4: Fancy or regular bricks?:
 */
package gp_menutest_1;
import javax.swing.JOptionPane;

public class GP_MenuTest_1 {
    public static void main(String[] args) {
        /* SAMPLE MENU
        String[] menu = {"Simple Design","Fancy Design"};
        int choice = JOptionPane.showOptionDialog(null,"Please choose an option"
                + " for your building.", "Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,menu,menu[0]);
        JOptionPane.showMessageDialog(null,"Your choice was option" 
                +menu[choice]);
        */
        
        String[] selection={"Yes", "No"};
        String[] brickChoice={"Fancy", "Regular"};
        
        // Asking for arches
        int choice1 = JOptionPane.showOptionDialog(null,"Would you like "
                + "arches on your wall?","Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,selection,selection[0]);
        
        // Asking for brick patterns
        int choice2 = JOptionPane.showOptionDialog(null,"Would you like "
                + "brick patterns on your wall?","Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,selection,selection[0]);
        
        // Asking about the side wrapping
        int choice3 = JOptionPane.showOptionDialog(null,"Would you like "
                + "these choices on the side wrap?","Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,selection,selection[0]);
        
        // ASking the type of brick
        int choice4 = JOptionPane.showOptionDialog(null,"What kind of brick  "
                + "would you like?","Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,brickChoice,brickChoice[0]);
        
        calculate(choice1, choice2, choice3, choice4);
    }
    
    public static void calculate(int choice1,int choice2,int choice3,int choice4){
        // Known variables
        int costPerCornice = 999;
        int costPerPallet = 250;
        int bricksPerCustomUnit; // TODO
        int cementPerCustomUnit; // TODO
        
        // Need to calculate
        int bricksNeeded;
        int cementNeeded;
        
    }
    
}

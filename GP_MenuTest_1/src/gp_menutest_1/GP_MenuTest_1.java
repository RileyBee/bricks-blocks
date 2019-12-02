/*
 * Selection 1: Would you like arches?
 * Selection 2: Would you like patterns?
 * Selection 3: Would you like to extend these to the sides?
 * Selection 4: Fancy or regular bricks?:
 */
package gp_menutest_1;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

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
        
        int bricksNeeded = calculateBricksNeeded(choice1, choice2, choice3, choice4);
        int cementNeeded = calculateCementNeeded(bricksNeeded);
        double brickCost = calculateBrickCost(bricksNeeded);
        double cementCost = calculateCementCost(cementNeeded);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Bricks needed: "+bricksNeeded);
        System.out.println("Brick cost: "+fmt.format(brickCost));
        System.out.println("Mortar Needed: "+cementNeeded);
        System.out.println("Mortar Cost: "+fmt.format(cementCost));
        
    }
    
    public static int calculateBricksNeeded(int choice1, int choice2, int choice3, int choice4){
        int bricksNeeded;
        double wallLength=55.0*5.0, wallHeight=28.0,wallSquare=0, wallWidth=1, brickLength=7.625,
                brickHeight=2.25, brickSquare=0, totalBrick=0;
        
        
        wallSquare = wallLength*wallHeight;
        brickSquare = ((brickLength+.375)*(brickHeight+.375))/144.0;
        totalBrick = wallSquare/brickSquare;
        totalBrick = totalBrick * wallWidth;
        totalBrick = totalBrick * 1.10;
        
        totalBrick = Math.ceil(totalBrick);
        
        bricksNeeded = (int) totalBrick;
        
        
        return bricksNeeded;
        
    }
    
    public static int calculateCementNeeded (int bricksNeeded){
        int cementNeeded=0;
        cementNeeded = (bricksNeeded)/142;
        
        return cementNeeded;
    }
    
    public static double calculateBrickCost (int bricksNeeded){
        double brickPallet= Math.ceil(bricksNeeded/510.0);
        double brickCost = brickPallet*275;
        
        return brickCost;
    }
    
    public static double calculateCementCost (int cementNeeded){
        double cementPallet= cementNeeded/35.0;
        double cementCost =cementPallet*500.0;        
        
        return cementCost;
    }
    
}

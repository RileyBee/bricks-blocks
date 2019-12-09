/*
 * Selection 1: Would you like arches?
 * Selection 2: Would you like patterns?
 * Selection 3: Would you like to extend these to the sides?
 * Selection 4: Fancy or regular bricks?:
 */
package project_version_1;
import static java.awt.BorderLayout.CENTER;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project_version_1 {
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
        float brickCost = calculateBrickCost(bricksNeeded);
        float cementCost = calculateCementCost(cementNeeded);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.println("Bricks needed: "+bricksNeeded);
        System.out.println("Brick cost: "+fmt.format(brickCost));
        System.out.println("Mortar Needed: "+cementNeeded);
        System.out.println("Mortar Cost: "+fmt.format(cementCost));
        
        JFrameProject(bricksNeeded, cementNeeded, brickCost, cementCost, fmt);
        
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
    
    public static float calculateBrickCost (int bricksNeeded){
        float brickPallet= (float) Math.ceil(bricksNeeded/510.00);
        float brickCost = brickPallet*275;
        
        return brickCost;
    }
    
    public static float calculateCementCost (int cementNeeded){
        float cementPallet= (float) (cementNeeded/35.0);
        float cementCost = (float) (cementPallet*500.0);        
        
        return cementCost;
    }
    
    public static void JFrameProject(int bricksNeeded, int cementNeeded, float brickCost, float cementCost, NumberFormat fmt) 
    {
        JFrame newJFrame = new JFrame();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel19 = new JLabel();
        JLabel jLabel21 = new JLabel();
        JLabel jLabel22 = new JLabel();
        JLabel jLabel24 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel1 = new JLabel();

        newJFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        newJFrame.getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel3.setText(fmt.format(cementCost));
        newJFrame.getContentPane().add(jLabel3);
        jLabel3.setBounds(780, 330, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("DEC 12, 2019");
        newJFrame.getContentPane().add(jLabel4);
        jLabel4.setBounds(750, 130, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("DEC 15, 2019");
        newJFrame.getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 200, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("arch cost");
        newJFrame.getContentPane().add(jLabel6);
        jLabel6.setBounds(780, 350, 90, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel7.setText("STATE TAX (0.7%)");
        newJFrame.getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 470, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setText("Amount Of Bricks: " + Integer.toString(bricksNeeded) + " Bricks");
        newJFrame.getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 310, 510, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("Amount Of Mortar: " + Integer.toString(cementNeeded) + " Cubic Feet");
        newJFrame.getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 330, 500, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Time & Labor");
        newJFrame.getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 370, 510, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("Arch Design Cost");
        newJFrame.getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 350, 520, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText(fmt.format(brickCost));
        newJFrame.getContentPane().add(jLabel13);
        jLabel13.setBounds(780, 310, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel14.setText("BRICKS");
        newJFrame.getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 310, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setText("MORTAR");
        newJFrame.getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 330, 90, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel16.setText("ARCH DESIGN");
        newJFrame.getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 350, 90, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setText("LABOR");
        newJFrame.getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 370, 90, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel19.setText(fmt.format(3084));
        newJFrame.getContentPane().add(jLabel19);
        jLabel19.setBounds(780, 370, 90, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel21.setText("state tax");
        newJFrame.getContentPane().add(jLabel21);
        jLabel21.setBounds(780, 470, 90, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel22.setText("Total Cost");
        newJFrame.getContentPane().add(jLabel22);
        jLabel22.setBounds(780, 560, 90, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel24.setText("subtotal");
        newJFrame.getContentPane().add(jLabel24);
        jLabel24.setBounds(780, 440, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Mr. Teter");
        newJFrame.getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 200, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Null\\Documents\\GitHub\\bricks-blocks\\JavaSchoolBuilderInvoice.jpg"));
        newJFrame.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 710);

        newJFrame.pack();
        newJFrame.setVisible(true);
        newJFrame.setSize(915, 875);
        newJFrame.setLocation(500, 100);
    }
    
}

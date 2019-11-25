/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_menutest_1;
import javax.swing.JOptionPane;

/**
 *
 * @author daltonb3657
 */
public class GP_MenuTest_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] menu = {"Simple Design","Fancy Design"};
        int choice = JOptionPane.showOptionDialog(null,"Please choose an option"
                + " for your building.", "Choose an option",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,menu,menu[0]);
        JOptionPane.showMessageDialog(null,"Your choice was option" 
                +menu[choice]);
    }
    
}

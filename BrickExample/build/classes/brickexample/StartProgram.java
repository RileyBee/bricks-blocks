/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickexample;

import java.io.*;
import java.util.*;

public class StartProgram 
{

    public static void main(String[] args) throws IOException
    {
        PullFromCSV.CreateBrick();
        
        List<Bricks> displayBricks = MaterialLists.newBricks;
        
        for (int i = 0; i < displayBricks.size(); i++)
        {
            System.out.print(displayBricks.get(i).getName()+ " ");
        }
    }
    
}

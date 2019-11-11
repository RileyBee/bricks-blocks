package brickexample;

import java.io.*;

public class PullFromCSV 
{
    public static void CreateBrick() throws IOException
    {
        String line;
        
        BufferedReader newCSV = new BufferedReader(new FileReader("ExampleBrickData.csv"));
        
        newCSV.readLine();
        
        while((line = newCSV.readLine()) != null)
        {
            String[] data = line.split(",");
            
            MaterialLists.newBricks.add(new Bricks(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4])));
        }
    }
    
}

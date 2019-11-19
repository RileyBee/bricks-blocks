package brickexample;

public class Bricks
{
    // fields
    private final String materialName;
    private final double materialCost;
    private final double length;
    private final double width;
    private final double height;
    
    
    /**
     * @param name The brick name.
     * @param cost The brick cost
     * @param len The brick length.
     * @param w The brick width.
     * @param h the brick height.
     */
    
    public Bricks (String name, double cost, double len, double w, double h)
    {
        materialName = name;
        materialCost = cost;
        length = len;
        width = w;
        height = h;
    } 
        
    public String getName()
    {
        return materialName;
    }
    
    public double getCost()
    {
        return materialCost;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
}

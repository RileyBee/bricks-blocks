package brickexample;

public class Bricks
{
    // fields
    private String materialName;
    private double materialCost;
    private double length;
    private double width;
    private double height;
    
    
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
    
    public void setName(String name)
    {
        materialName = name;
    }
    
    public void setCost(double cost)
    {
        materialCost = cost;
    }
    
    public void setLength(double len)
    {
        length = len;
    }
    
    public void setWidth(double w)
    {
        width = w;
    }
    
    public void setHeight(double h)
    {
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

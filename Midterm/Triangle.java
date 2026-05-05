public class Triangle
{
    //These attributes are constant and represent the different conversion rates
    private final double b = 0.0;
    private final double h = 0.0;
    private final double a = 0.0;

    //These are my attributes for the class, basically the base and height
    private double base;
    private double height;

    //The constructor as usual allows programs to set the initial values of
    //the attributes of any Triangle object
    public Triangle(double initBase, double initHeight)
    {
        base = initBase;
        height = initHeight;
    }

    //getters/setters for all attributes that require them (constants obviously don't need a setter, and
    //whether you want to provide a getter for them depends on your intentions)

    public double getBase()
    {
        return base;
    }

    public void setBase(double newBase)
    {
        if (newBase >= 0)
            base = newBase;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double newHeight)
    {
        if (newHeight >= 0)
            height = newHeight;

    }

    public double convert(double conversionArea)
    {
        double Area = 0.0;

        if (conversionArea > Area)
        {
            Area = (b * h) / 2;
            Area = a;
        }
        return Area;
    }

    public String toString()
    {
        String str = "";
        str += "Base: " + base + " Height: " + height;
        return str;
    }
}

class cylinder2
{
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double setRadius(double r)
    {
        return radius=r;
    }

    public double setHeight(double h)
    {
        return height=h;
    }


    public double area()
    {
        return 2*Math.PI*radius*radius;
    }


    public cylinder2()
    {
        radius=1;
        height=1;
    }

    public cylinder2( double r, double h)
    {
        radius=r;
        height=h;

    }

}

public class cylinder116
{
    public static  void main (String[] args)
    {
        cylinder2 c=new cylinder2(10,5);

        c.setHeight(10);
        c.setRadius(5);
        System.out.println("area " + c.area());

    }
}

class Rectangle
{
    private double length;
    private double breadth;

    public Rectangle()
    {
        length=1;
        breadth=1;
    }

    public Rectangle (double l, double b)
    {
        length = l;
        breadth=b;
    }

    public Rectangle( double s)
    {
        length=breadth=s;
    }
    public double getLength()
    {
        return  length;
    }

    public  double getBreadth()
    {
        return  breadth;
    }

    public void setLength( double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b)
    {
        breadth = b;
    }








    public double area()
    {
        return length * breadth;
    }
    public double perimeter()
    {
        return 2* (length + breadth);
    }
    boolean square()
    {
        return length == breadth;
    }


}

public class PractisingConstructor115
{
    public  static void main (String[] args)
    {

        Rectangle r = new Rectangle(10,5);

        System.out.println("Area" + r.area());



    }
}

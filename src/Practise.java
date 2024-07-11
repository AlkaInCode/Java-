class rectangle2
{
    private double length;
    private  double breadth;


    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }


    public double setLength(int l)
    {
        return length = l;
    }

    public double setBreadth(int b)
    {
        return breadth = b;
    }

    public double area()
    {
        return length*breadth;

    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public rectangle2()
    {
        length=1;
        breadth=1;
    }

    public rectangle2(double  l ,double b)
    {
        length=l;
        breadth=b;
    }


}

public class Practise
{
    public static void main(String[] args)
    {
        rectangle2 r = new rectangle2(5,10);
        r.setLength(5) ;
        r.setBreadth(10);

        System.out.println("area =" + r.area());
        System.out.println("perimeter =" + r.perimeter());




    }
}

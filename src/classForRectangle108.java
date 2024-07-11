
class rectangle
{
    private double length;
    private double breadth ;

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
public class classForRectangle108
{


    public static  void  main (String[] args)
    {
        rectangle r1 = new rectangle();
        r1.setLength(5);
        r1.setBreadth(10);
        System.out.println("area=" + r1.area());
        System.out.println("perimeter=" + r1.perimeter());
        System.out.println("Is Square=" + r1.square());
        System.out.println("length" + r1.getLength());
        System.out.println("length" + r1.getBreadth());



    }
}

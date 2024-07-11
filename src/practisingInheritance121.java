class inheritance
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI* radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

class cylinder3 extends  inheritance
{
    public double height;

    public double volume()
    {
        return area()*height;
    }



}


public class practisingInheritance121
{
    public static void main(String[] args)
    {
        cylinder3 c=new cylinder3();
        inheritance i = new inheritance();
        c.radius=7;
        c.height=12;
        System.out.println("area"+  c.area());
        System.out.println("volume"+ c.volume());
        System.out.println("area of inheritance class "+ i.area());

    }
}

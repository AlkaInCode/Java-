abstract class shape
{
    abstract public double perimeter();
    abstract public  double area();

}

class circle5 extends shape {
    double radius;

    public double perimeter()
    {
        return 2 * Math.PI * radius;

    }

    public double area()
    {
        return Math.PI*radius*radius;
    }
}

    class Rectangle1 extends shape
    {
        double length;
        double breadth;

       public  double perimeter()
        {
            return 2*(length+breadth);
        }

        public double area()
        {
            return  length*breadth;
        }
    }


public class AbstractClassShape138
{
    public static void main(String[] args)
    {
        circle5 c = new circle5();
        c.radius=5;
        System.out.println(c.perimeter());

        Rectangle1 r=new Rectangle1();
        r.length=10;
        r.breadth=10;

        System.out.println(r.area());

        shape sh = new circle5();
//        shape sh= r;
        
        System.out.println(sh.area());

    }

}

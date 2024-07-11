class rectangle11
{
    int length;
    int breadth;

    //constructors
     rectangle11()
    {
       length=breadth=1;

    }

   rectangle11(int l, int b)
    {
        length=l;
        breadth=b;
    }


}

class cuboid extends  rectangle11
{
    int height;

    //constructors
    cuboid()
    {
        height=1;
    }

    cuboid(int h)
    {
        height=h;
    }
    cuboid (int l, int b, int h)
    {
        super(l,b);
        height=h;
    }


    public int  volume1()
    {
        return length*breadth*height;
    }


}


public class Parameterised124QNo2
{
    public static  void main(String[] args)

    {
//   rectangle11.cuboid c =new rectangle11().new cuboid();
        cuboid c= new cuboid(5,8,10);
        System.out.println(c.volume1());


    }
}



class parent1
{
    public parent1()
    {
        System.out.println("non-param parent ");
    }
    parent1(int x)
    {
        System.out.println("param of parent"+ x);
    }
}

class child1 extends parent1
{
    public child1()
    {
        System.out.println("non-param of child");
    }
    public child1( int y)
    {
        System.out.println("param of  child  ");
    }

    child1(int x , int y)
    {
        super(x);
        System.out.println(" param of child"+ y);
    }
}
//class grandchild1 extends  child1
//{
//    public grandchild1()
//    {
//        System.out.println("grandchild constructor");
//    }
//}


public class ParametrisedConstructor124
{
    public static  void main(String[] args)
    {
        child1 c= new child1(10,30);

    }
}



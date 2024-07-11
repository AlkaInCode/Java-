 abstract class superrr
{
    public void meth1()
    {
        System.out.println("method1 super");
    }

    abstract void meth2();
}

class sub2 extends  superrr
{
   @Override public void meth2()
    {
        System.out.println("sub method2");
    }
    public void meth3()
    {
        System.out.println("meth3 sub");
    }
}

public class AbstractClass135
{
    public static void main(String[] args)
    {
//        sub2 s= new sub2();
        superrr s=new sub2();
        s.meth2();

    }

}

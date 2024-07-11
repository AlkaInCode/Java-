class super1
{
    public void meth1()
    {
        System.out.println("super meth1");
    }
    public void meth2()
    {
        System.out.println("super meth2");
    }
}

class sub1 extends  super1
{
    public void meth2()
    {
        System.out.println("sub1 meth2");
    }
    public void meth3()
    {
        System.out.println("sub1 meth3");
    }
}
public class DynamicDispatch131
{
    public  static void main(String[] args)
    {
        super1 s= new sub1();
        s.meth1();
        s.meth2();
        nh

    }
}

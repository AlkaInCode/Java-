interface  test5
{
    void meth1();
    void meth2();
}

class test implements  test5
{
   public  void meth1()
    {
        System.out.println(" sub meth1");
    }

    public void meth2()
    {
        System.out.println("sub meth2");
    }

}


public class practisinginterfaces142
{
    public static  void main(String[] args)
    {
        test5 t = new test();

    }
}

 class FinalKeyword
{
    //static block
   static final float PI;
   static  {
        PI=3.1425F;
    }

    //instance block
     final float y;
    {
        y=3.1425F;
    }


    //constructor
    final float z;
    public FinalKeyword(){
        z=3.1425F;
    }

    final void meth1()
    {
        System.out.println("hello");
    }
    void meth2()
    {
        System.out.println("good");
    }
}

class subFinal extends FinalKeyword
{
    void meth3()
    {
          System.out.println("bye");
    }
}

public class FinalKeyword158
{
    public static void main(String[] args)
    {
        final float k;
        k=89;
        FinalKeyword f= new FinalKeyword();
        f.meth2();

    }
}


class superr
        {
            void display()
            {
                System.out.println("superr class display");

            }
        }

        class sub extends  superr
        {
            void display(int x)
            {
                System.out.println("sub class display");
            }
        }


public class MethodOverriding127
{
    public static void main(String[] args)
    {
        superr s=new superr();
        s.display();
        sub subb=new sub();
        subb.display();

        //dynamic method dispatch
        superr ss= new sub();
        ss.display();
    }
}

class parent
{
    public parent()
    {
        System.out.println("parent constructor");
    }
}

class child extends parent
{
    public child()
    {
        System.out.println("child constructor");
    }
}
class grandchild extends  child
{
    public grandchild()
    {
        System.out.println("grandchild constructor");
    }
}


public class constructorInheritance123
{
    public static  void main(String[] args)
    {
        grandchild c= new grandchild();

    }
}

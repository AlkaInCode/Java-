 class StaticBlock
{

    static
    {

        System.out.println("block1");

    }

    static
    {
        System.out.println("block2");
    }
}


public class StaticBlock156
{
    public static void main (String[] args)
    {
        new StaticBlock();
    }
    static
    {
        System.out.println("block3");
    }

}

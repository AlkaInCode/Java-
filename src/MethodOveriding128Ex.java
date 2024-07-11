
class Tv
{
    public void switchOn()
    {
        System.out.println("tv is switchOn");
    }

    public void changeChannel()
    {
        System.out.println("change the tv channel");
    }
}

class smartTv extends  Tv
{
    @Override
    public void switchOn()
    {
        System.out.println("smart tv is switchOn");
    }

    @Override public void changeChannel()
    {
        System.out.println("smart tv channel is changed");
    }

    public void browse()
    {
        System.out.println("smart Tv is browsing");
    }
}

public class MethodOveriding128Ex
{
    public static  void main(String[] args)
    {
        Tv t=new smartTv();
        t.switchOn();

    }
}

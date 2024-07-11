class car
{
    public void start()
    {
        System.out.println("start the car");
    }

    public void accelerate()
    {
        System.out.println("accelerate the car");
    }
    public void changeGear()
    {
        System.out.println("chage the gear of car");
    }
}

class luxuryCar extends car
{

    public void changeGear()
    {
        System.out.println("automatic gear of Luxurycar");
    }
    public void openRoof()
    {
        System.out.println("open the roof of Luxurycar");
    }


}

public class MethodOverriding129Ex
{
    public static void main(String[] args)
    {

        car c= new luxuryCar();
        c.accelerate();
        c.start();
        c.changeGear();
//        c.openRoof(); not work here as it is not in car class becoz we are  taking reference of car

    }
}

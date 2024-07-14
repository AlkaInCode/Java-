//concrete class

class phonee{
    public void call()
    {
        System.out.println("phone can make call");
    }
    public void sms()
    {
        System.out.println("phone can sms too");
    }
}

//interface
interface camera
{
    void click();
    void record();
}

interface  musicPlayer
{
    void play();
    void stop();
    void pause();
}


class smartPhone extends phonee implements camera,musicPlayer
{
    public void videoCall()
    {
        System.out.println("smart can do videoCall");
    }

    public void click()
    {
        System.out.println("sub of click");
    }
    public void record()
    {
        System.out.println("sub of record");
    }
    public void play()
    {
        System.out.println("sub of play");
    }
    public void stop()
    {
        System.out.println("sub of stop");
    }
    public void pause()
    {
        System.out.println("sub of pose");
    }

}


public class DemoInterface144
{
    public static void main(String[] args)
    {
        smartPhone s=new smartPhone();
        s.click();
        camera c=s;
        s.record();
        s.play();
//        System.out.println( "click"+ s.videoCall());
    }

}

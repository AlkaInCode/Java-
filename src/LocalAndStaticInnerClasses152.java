//
//class outer2
//{
////    int x;
//    public void display(){
//        class inner2
//        {
////            int y=9;
//
//            public void innerDisplay()
//            {
//                System.out.println("hello");
//            }
//        }
////        inner2 i = new inner2();
////        i.innerDisplay();
//        new inner2().innerDisplay();
//    }
//
//}
//
//public class LocalAndStaticInnerClasses152
//{
//    public static  void  main(String[] args)
//    {
//        outer2 o = new outer2();
//        o.display();
//
//    }
//}

 


abstract  class My
{
    abstract  public void show();
}

class outer3
{
    public  void display()
    {
        new My()
        {
            public void show()
            {
                System.out.println("hell");
            }
        }.show();// we can do this way too
    }

}

public class LocalAndStaticInnerClasses152
{
    public static  void  main(String[] args)
    {
        outer3 o = new outer3();
        o.display();

    }
}








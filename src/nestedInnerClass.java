class outer
{
    int x=22;
    inner i = new inner();
    class inner
    {
        int y=25;
        public  void innerDisplay()
        {
            System.out.println(x + " " + y);
        }
    }

   public void outerDisplay()
   {
//       inner i = new inner();
       i.innerDisplay();
       System.out.println(i.y);
   }
}

public class nestedInnerClass
{
    public  static  void main(String[] args)
    {
        outer o=new outer();
        o.outerDisplay();


    }
}

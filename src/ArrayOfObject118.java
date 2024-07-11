
class subject
{
    private  String subId;
    private  String name;
    private  int maxMarks;
    private  int marksObtain;


    //getter method
    public String getSubId(){return  subId;}
    public  String getName(){return name;}
    public  int getMaxMarks(){return  maxMarks;}
    public int getMarksObtain(){return  marksObtain;}



    //setter method
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }

    public void setMarksObtain(int m0)
    {
        maxMarks=m0;
    }


    //constructor
    public subject(String subId, String name)
    {
        this.subId=subId;
        this.name=name;
    }


    public subject(String subId, String name,  int maxMarks , int marksObtain)
    {
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }

    public String toString()
    {
        return  "\nSubject ID:"+ subId + "\n Name:" + name + "\nMarks Obtained: " + marksObtain;
    }


}

public class ArrayOfObject118
{
    public static void main (String[] args)
    {

        subject sub[] = new subject[4];
        sub[0]=new subject("s101", "DS" ,100,99);
        sub[1]=new subject("s102", "algo" ,100,88);
        sub[2]=new subject("s103", "oops" ,100,96);


        for(subject s: sub)
            System.out.println(s);


    }
}

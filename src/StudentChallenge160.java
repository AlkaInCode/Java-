import java.util.Date;
class Student12
{
    private String rollNo;
    private  static  int count =1;

    private String assignRollNo()
    {
        Date d = new Date();
        String rno= "Univ-"+ (d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student12()
    {
        rollNo=assignRollNo();
    }

    public String getRollNo()
    {
        return rollNo;
    }

}


public class StudentChallenge160
{
    public  static  void main(String[] args)
    {
        Student12 s1=new Student12();
        Student12 s2=new Student12();
        Student12 s3=new Student12();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());


    }
}

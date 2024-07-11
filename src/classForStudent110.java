class student
{
    public int roll;
    public String name;
    public String course;
    public int   m1,m2,m3;

    public int   total()
    {
        return  m1+m2+m3;

    }

    public float   average()
    {
        return (float) total() / 3 ;
    }

    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return  'B';

    }

    public String Detail()
    {
        return "roll no =" + roll + "\n"+ "name"+ name + "\n" + "course =" + course+ "\n";
    }
}


public class classForStudent110
{
    public static void main(String[] args)
    {
        student st = new student();
        st.name= "Alka";
        st.course= " Science";
        st.roll= 1905888;

        st.m1= 90;
        st.m2= 99;
        st.m3= 89;

        System.out.println("average marks "+ st.average());
        System.out.println(st.Detail() + "\n" + st.grade());

    }
}

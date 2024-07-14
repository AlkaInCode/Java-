
    interface Member
    {
        public void callback();
    }

    class Store
    {
        Member members[]=new Member[10];
        int count=0;

        void register(Member m)
        {
            members[count++]=m;
        }
        void inviteSale()
        {
            for(int i=0;i<count;i++)
                members[i].callback();
        }

    }

    class Customerr implements Member
    {
        String name;

        Customerr(String n)
        {
            name=n;
        }
        public void callback()
        {
            System.out.println("Ok, I will visit,"+name);


        }

    }


    public class callBackMethod145
    {

        public static void main(String[] args)
        {
            Store s=new Store();
            Customerr c1=new Customerr("John");
            Customerr c2=new Customerr("Smith");

            s.register(c1);
            s.register(c2);

            s.inviteSale();
        }

    }


class Test5 {
    static int x = 10;
    int y = 9;

    void show() {
        System.out.println(y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class DemoStaticMembers154 {
    public static void main(String[] args) {
        Test5 t1 = new Test5();
        t1.show();      // Output will be 9
        Test5.display(); // Output will be 10
        t1.x=30;
        t1.y=50;
    }
}

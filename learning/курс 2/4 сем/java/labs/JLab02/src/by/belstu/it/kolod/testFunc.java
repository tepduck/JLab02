package by.belstu.it.kolod;

public class testFunc {
    int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public testFunc(int test) {
        this.test = test;
    }

    public String getValue()
    {
        sayHello();
        return "Hello";}

    public static void sayHello() {
        System.out.println("Hello from testFunc");
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello from for "+i);
        }
    }
}

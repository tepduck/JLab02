package by.belstu.it.kolod;

public class testFunc {
    int test;

    //created with code generation
    public int getTest() {
        return test;
    }
    //created with code generation
    public void setTest(int test) {
        this.test = test;
    }
    //created with refactoring
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

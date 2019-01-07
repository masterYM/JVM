package classloading._3;

public class ConstClass {
    static {
        System.out.println("ConstClass init !");
    }
    public static final String HELLOWORLD = "Hello world!";
}

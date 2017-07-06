import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ques3 {
    public static void main(String[] args) {

        ques3 cls = new ques3();
        Class c = cls.getClass();
            Method[] m1=c.getDeclaredMethods();
            Field[] f=c.getDeclaredFields();
        System.out.println("Method are:");
            for(Method m:m1)
            {
                System.out.println(m.toString());
            }
        System.out.println("Fields are:");
            for(Field f1:f)
            {
                System.out.println(f1.toString());
            }
    }

    private Integer show() {
        return 1;
    }

    public void showInteger(Integer i) {
        this.i = i;
    }
    public int i=8;
    public String abc="aashish";
}

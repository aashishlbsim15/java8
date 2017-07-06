interface Interface1 {

    void method1(String str);

    default void log(String str){

        System.out.println("I1 logging::"+str);
    }

    static void  staticmethod(){
        System.out.println("static method");
    }
}





class interfaceimpl implements Interface1
{
   public void method1(String s)
   {
    System.out.println("hello "+s);

   }
public void log(String str)
{
    System.out.println("hello: "+str+" this is my log");
}

}
public class ques5 {
    public static void main(String[] args) {
       interfaceimpl impl=new interfaceimpl();
        impl.method1("aashish");
        impl.log("first");
        Interface1.staticmethod();
    }

}

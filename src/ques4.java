import java.util.Scanner;

@FunctionalInterface
interface table
{
    void printtable(int a);
}
public class ques4 {
        private static void operate(int a,table t)
    {
        t.printtable(a);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        table p=(int a)->{
            for(int i=1;i<=10;i++)
            {
                System.out.println(a*i);
            }
        };
        System.out.println("Enter a number");
        int num=in.nextInt();
        operate(num,p);
    }


}

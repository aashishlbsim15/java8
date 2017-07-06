/*


import java.util.*;
import java.util.function.Predicate;
class Employee
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   private String name;
  private  int age;
    Employee(String n,int a)
    {
        name=n;
        age=a;
    }
}



public class ques6 {


    public static  void evaluate(List<Employee> list, Predicate<Employee> p)
    {
        for(Employee n:list){
            if(p.test(n))
            {
                System.out.println("Name:"+n.getName());
                System.out.println("Name:"+n.getAge());

            }
        }
    }




    public static void main(String[] args) {

Employee e=new Employee("aashish",22);
        Employee e3=new Employee("nitin",26);
        Employee e1=new Employee("randhir",25);
        Employee e2=new Employee("shaan",22);
        List<Employee> elist=new ArrayList<>();
        elist.add(e);
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        evaluate(elist,(n)->{
            String name=n.getName();
            if(name.endsWith("n"))
            {
                if(n.getAge()>24)
                    return true;
                else
                    return false;
            }
            else
                return false;
        });

    }
}



*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class ques6
{
    public static  void evaluate(List<Integer> list, Predicate<Integer> p)
    {
        for(Integer n:list){
            if(p.test(n))
            {
                System.out.println(n);


            }
        }
    }
    public static void main(String[] args) {
        List<Integer> listnum=new ArrayList<>();
        listnum.add(25);
        listnum.add(45);
        listnum.add(78);
        listnum.add(14);
        listnum.add(3);
        listnum.add(17);
        evaluate(listnum,n->{
            int count=1;
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
            if(count<=2)
                return true;
            else return  false;
        });

    }
}
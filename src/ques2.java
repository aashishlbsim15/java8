/*

import java.io.*;

class Employee implements Serializable
{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}



public class ques2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e=new Employee();

        e.setName("aashish");
        Employee e1=new Employee();

        e1.setName("vrinda");
        Employee e2=new Employee();

        e2.setName("shaan");
        FileOutputStream filestream=new FileOutputStream("Employee.ser");
        ObjectOutputStream os=new ObjectOutputStream(filestream);
        os.writeObject(e);
        os.writeObject(e1);
        os.writeObject(e2);

FileInputStream fs=new FileInputStream("Employee.ser");
ObjectInputStream ois=new ObjectInputStream(fs);
Employee fe=(Employee)ois.readObject();
        Employee se=(Employee)ois.readObject();
        Employee te=(Employee)ois.readObject();
        System.out.println("first employee data");
        System.out.println("Name: "+fe.getName());
        System.out.println("Second employee data");
        System.out.println("Name: "+se.getName());
        System.out.println("Third employee data");
        System.out.println("Name: "+te.getName());



    }


}

*/

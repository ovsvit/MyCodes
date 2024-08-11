import java.io.*;
/*import java.lang.*;
class Employee implements Serializable {
    int id;
    String name;
    static String company = "SSS IT Pvt Ltd"; // transient keyword to exclude from serialization

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class da5_staticmem {*/
    class Employee implements Serializable {
        int id;
        String name;
        static String company = "SSS IT Pvt Ltd"; // transient keyword to exclude from serialization
    
        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
       // Employee employee = new Employee(1, "John Doe");
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

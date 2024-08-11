//Name:Jumana Begyum M
//Reg no:21BIT0694
import java.io.*;
class adrs implements Serializable {
    String addressLine, city, state;
    public adrs(String addressLine, String city, String state) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
    }
}

public class stud implements Serializable 
{
    int id;
    String name;
    adrs address;
    public stud(int id, String name, adrs address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) 
    {
        adrs address = new adrs("123 Street", "City", "State");
        stud student = new stud(1, "John", address);

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
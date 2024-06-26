//This program is an example of Encapsulation 

public class Encapsulation {

    private String Name;
    private int Age;
    private int Rollno;

    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public int getRollno()
    {
        return Rollno;
    }

    public void setName(String newName)
    {
        Name = newName;
    }
    public void setAge(int newAge)
    {
        Age = newAge;
    }
    public void setRollno(int newRollno)
    {
        Rollno = newRollno;
    }
    public static void main(String args[])
    {
        Encapsulation en = new Encapsulation();

        en.setName("Rohit");
        en.setAge(23);
        en.setRollno(1);

        System.out.println("Geek Name = "+en.getName());
        System.out.println("Geek Age = "+en.getAge());
        System.out.println("Geek Rollno = "+en.getRollno());
    }
}
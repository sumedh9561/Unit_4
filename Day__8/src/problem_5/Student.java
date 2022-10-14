package problem_5;


public class Student {
    private int roll;
    private String name;
    private String address;
    private int marks;

    Student(){

    }



    public Student(int roll, String name, String address, int marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }



    public void setRoll(int roll) {
        this.roll=roll;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public String getAddress() {
        return this.address;
    }


    public void setMarks(int marks) {
        this.marks=marks;
    }

    public int getMarks() {
        return this.marks;
    }

}

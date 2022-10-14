package problem_3;

public class Member {
    String	Name ;
    int 	Age ;
    String 	PhoneNumber ;
    String Address ;
    double 	Salary ;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    public void printSalary(){
        System.out.println(Salary);
    }
}
class Employee extends Member{
    String 	Specialisation ;
    String 	Department ;
    public String getSpecialisation() {
        return Specialisation;
    }
    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
}
class Manager extends Member{
    String 	Specialisation ;
    String 	Department ;
    public String getSpecialisation() {
        return Specialisation;
    }
    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }
}



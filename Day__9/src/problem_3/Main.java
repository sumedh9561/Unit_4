package problem_3;


    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner input = new Scanner(System.in);
            Employee obj = new Employee();
            Manager obj1 = new Manager();
            System.out.println("Enter Manager detail");

            System.out.println("Enter Department");
            String department = input.next();
            obj1.setDepartment(department);

            System.out.println("Enter Specialisation");
            String specialisation = input.next();
            obj1.setSpecialisation(specialisation);

            System.out.println("Enter Name");
            String name = input.next();
            obj1.setName(name);

            System.out.println("Enter Age");
            int age = input.nextInt();
            obj1.setAge(age);

            System.out.println("Enter Phone Number");
            String phoneNumber = input.next();
            obj1.setPhoneNumber(phoneNumber);

            System.out.println("Enter Address");
            String Address = input.next();
            obj1.setAddress(Address);

            System.out.println("Enter Salery");
            double salary = input.nextDouble();
            obj1.setSalary(salary);


            System.out.println("Enter Employee detail");

            System.out.println("Enter Department");
            String departmen = input.next();
            obj.setDepartment(departmen);

            System.out.println("Enter Specialisation");
            String specialisatio = input.next();
            obj.setSpecialisation(specialisatio);

            System.out.println("Enter Name");
            String nam = input.next();
            obj.setName(nam);

            System.out.println("Enter Age");
            int ag = input.nextInt();
            obj.setAge(ag);

            System.out.println("Enter Phone Number");
            String phoneNumbe = input.next();
            obj.setPhoneNumber(phoneNumbe);

            System.out.println("Enter Address");
            String Addres = input.next();
            obj.setAddress(Addres);

            System.out.println("Enter Salery");
            double salar = input.nextDouble();
            obj.setSalary(salar);


            //print

            System.out.println("   *-:   Manager detail  :-* ");
            System.out.println("Specialisation :- " +  obj1.getSpecialisation());
            System.out.println("Department     :- " +  obj1.getDepartment());
            System.out.println("Name           :- " +  obj1.getName());
            System.out.println("Age            :- " +  obj1.getAge());
            System.out.println("Phone Number   :- " +  obj1.getPhoneNumber());
            System.out.println("Address        :- " +  obj1.getAddress());
            System.out.println("Salery         :- " +  obj1.getSalary());

            System.out.println("************************************************************************" );

            System.out.println("     *-:  Employee detail  :-* ");
            System.out.println("Department      :- " +  obj.getDepartment());
            System.out.println("Specialisation  :- " +  obj.getSpecialisation());
            System.out.println("Name            :- " +  obj.getName());
            System.out.println("Age             :- " +  obj.getAge());
            System.out.println("Phone Number    :- " +  obj.getPhoneNumber());
            System.out.println("Address         :- " +  obj.getAddress());
            System.out.println("Salery          :- " +  obj.getSalary());
        }

    }

package problem__3;

public class Student {

    int roll;
    String name;
    int marks;

    void displayStudentDetails(){


        System.out.println("Name :- "+name);
        System.out.println("Roll No :- "+ roll);
        System.out.println("Marks :- "+marks);
    }

    public static void main(String[] args) {

        System.out.println("Student-1");
        Student student1 =new Student();
        student1.name="NITISH KUAMR";
        student1.roll=52;
        student1.marks=563;
        student1.displayStudentDetails();

        System.out.println("*************************************************");

        System.out.println("Student-2");
        Student student2 =new Student();
        student2.name="KISHAN KUAMR";
        student2.roll=52;
        student2.marks=540;
        student2.displayStudentDetails();

        student1=new Student();
        student2=student1;



    }
}

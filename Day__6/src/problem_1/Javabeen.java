package problem_1;

public class Javabeen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //using zero argument constructor
        Student student1 = new Student();
        student1.setRoll(27);
        student1.setName("Nitish");
        student1.setAge(21);
        student1.setMarks(450);


        Student student2 = new Student(7, "Kishan",23, 350);
        System.out.println("Student1 details: ");

        student1.showDetails();
        System.out.println("Student2 details using getter methods");
        System.out.println("Roll is :"+student2.getRoll());
        System.out.println("Name is :"+student2.getName());
        System.out.println("Age is :"+student2.getAge());
        System.out.println("Marks is :"+student2.getMarks());
    }

}

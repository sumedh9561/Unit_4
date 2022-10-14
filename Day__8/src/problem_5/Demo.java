package problem_5;

import java.util.Scanner;


    public class Demo {



        public static void main(String[] args) {



            Scanner sc=new Scanner(System.in);
            System.out.println("How many Student objects need to be\r\n"
                    + "created: ");
            int n=sc.nextInt();

            Student[] student=new Student[n];


            for(int i=0;i<student.length;i++) {

                System.out.println("Enter Roll Number: ");
                int roll=sc.nextInt();


                System.out.println("Enter Name: ");
                String name=sc.next();


                System.out.println("Enter Address: ");
                String address=sc.next();


                System.out.println("Enter Marks Number: ");
                int marks=sc.nextInt();
                student[i] = new Student();
                student[i].setRoll(roll);
                student[i].setName(name);
                student[i].setAddress(address);
                student[i].setMarks(marks);


            }
            for(int j=0;j<student.length;j++) {

                System.out.println("Roll is : "+student[j].getRoll());
                System.out.println("Name is : "+student[j].getName());
                System.out.println("Address is: "+student[j].getAddress());
                System.out.println("Marks is : "+student[j].getMarks());

                System.out.println("======================");
            }

            int total=0;
            for(int m=0;m<student.length;m++) {
                total+=student[m].getMarks();
            }
            total=total/student.length;
            System.out.println("Average of all the Student marks is: "+total);






        }

    }


package problem_1;


    public class Student extends Person{

        int studentId ;
        String courseEnrolled ;
        int	courseFee ;

        Address a1=new Address();
        @Override
        public String toString() {

            return "Student [studentId=" + 1+ ", courseEnrolled=" + "JA111"+ ", courseFee=" + 3000
                    + "["+"city= " + "NewDelhi" +","+"State= " + "Delhi"+","+"pincode= "+110012+"]"+"]";
        }



    }

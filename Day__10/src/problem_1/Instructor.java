package problem_1;


    public class Instructor extends Person {

        int instructorId;
        int salary;

        Address a1=new Address();

        @Override
        public String toString() {
//		return "nstructor [instructorId=" + instructorId + ", salary=" + salary
//				+ "["+"city" + a1.city +"State" + a1.state+"pincode"+a1.pincode+"]"+"]";

            return "nstructor [instructorId=" + 12 + ", salary=" + 12000
                    + "["+"city= " +","+ "chennai" +","+"State= " + "TN"+","+"pincode= "+312443+"]"+"]";


        }

    }


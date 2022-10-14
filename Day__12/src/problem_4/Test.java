package problem_4;

public class Test implements Intr{
    @Override
    public int[] display(int p) {


        int len=0;

        for(int i=2;i<=p;i++) {
            int count=0;
            for(int j=2;j<=i;j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==1) {
                len++;
            }
        }



        int arr[]= new int[len];
        int ind=0;

        for(int i=2;i<=p;i++) {
            int count=0;
            for(int j=2;j<=i;j++) {

                if(i%j==0){
                    count++;

                }
            }
            if(count==1) {
                arr[ind]=i;
                ind++;
            }
        }


        for(int ar:arr) {

        }

        return arr;
    }

}

public class toDebugUsingLoop {

    public static void main(String[] args) {

        //To debug the code in intelliJ
        int i,sumOfMatch=0,count=0;

        for (i=1; i<=1000; i++){

            if (i%3 ==0 && i%5 ==0){
                sumOfMatch+=i;
                count++;
                System.out.println("Found a match is: "+i);
            }
            if (count==5){
                break;
            }
        }
        System.out.println("Total sum = "+sumOfMatch);
    }
}

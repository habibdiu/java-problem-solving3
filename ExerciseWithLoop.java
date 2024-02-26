import java.util.Scanner;

public class ExerciseWithLoop {

    public static void main(String[] args) {

        //problem solve with loop
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter three integer value: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        boolean isTrue = hasSameLastDigit(a, b,c);
        System.out.println("isLast Digit Same: "+isTrue);

    }
    public static boolean hasSameLastDigit(int x, int y, int z){

        if (x>=10 && y>=10 && z>=10 && x<=1000 && y<=1000 && z<=1000){

            int newX, newY, newZ;
            newX = x%10;
            newY = y%10;
            newZ = z%10;

            if (newX == newY || newX == newZ || newY == newZ){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("Invalid");
            return false;
        }
    }
}


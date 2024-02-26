import java.util.Scanner;

public class UserInputStream {

    public static void main(String[] args){

        //user input using System.console which IDE disabled but can run in terminal
        String yearNow = "2023";

        try {
            System.out.println(systemConsole(yearNow));
        }catch (NullPointerException e){
            System.out.println(scannerConsole(yearNow));
        }
    }
    public static String systemConsole(String presentYear){

        int yearInInt = Integer.parseInt(presentYear);

        String name = System.console().readLine("What is your name: ");
        int yearOfBirth = Integer.parseInt(System.console().readLine("And year of birth: "));
        int age = yearInInt-yearOfBirth;

        return "You are "+name+" and "+age+" years old";
    }

    public static String scannerConsole(String presentYear){

        int yearInInt = Integer.parseInt(presentYear);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("And year of birth: ");
        String yearOfBirth = sc.nextLine();
        int age = yearInInt-Integer.parseInt(yearOfBirth);

        return "You are "+name+" and "+age+" years old";
    }
}

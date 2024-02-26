import java.util.Scanner;

public class SwitchAndEnhancedType1 {

    public static void main(String[] args){

        //Moth printing using switch
        Scanner sc = new Scanner(System.in);
        String month;

        System.out.print("Month to get in which period: _");
        month = sc.nextLine();

        //with switch statement
        /*switch (month){
            case "january":
                System.out.println("1st");
                break;
            case "february":
                System.out.println("2nd");
                break;
            case "march":
                System.out.println("3rd");
                break;
            case "april":
                System.out.println("4th");
                break;
            default:
                System.out.println("Invalid");
        }*/

        //Enhanced switch statement
        switch (month){

            case "january", "february", "march" -> System.out.println("1st");
            case "april", "may", "june" -> System.out.println("2nd");
            case "july", "august", "september" -> System.out.println("3rd");
            case "october", "november", "december" -> System.out.println("4th");
            default -> System.out.println("Invalid Month");
        }
    }
}
import java.util.Scanner;

public class SwitchAndEnhancedType3 {

    public static void main(String[] args) {


        //Moth printing using switch
        Scanner sc = new Scanner(System.in);
        String month;

        System.out.print("Month to get in which period: _");
        month = sc.nextLine();


        //Enhanced switch statement
        String getMonth =  switch (month) {

            case "january", "february", "march" ->  {yield "1st";}
            case "april", "may", "june" -> "2nd";
            case "july", "august", "september" -> "3rd";
            case "october", "november", "december" -> "4th";
            default -> {
                String badRequest = month+ "is bad request";
                yield badRequest;
            }
        };
        System.out.println("You've tried for: "+getMonth);
    }
}

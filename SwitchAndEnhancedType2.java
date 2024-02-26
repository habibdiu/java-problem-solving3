import java.util.Scanner;

public class SwitchAndEnhancedType2 {

    public static void main(String[] args) {

        //Switch statement
        Scanner sc = new Scanner(System.in);
        String month;

        System.out.print("Month to get in which period: _");
        month = sc.nextLine();
        SwitchAndEnhancedType2 switchAndEnhancedType2 = new SwitchAndEnhancedType2();
        String getMonth = switchAndEnhancedType2.switchMonth(month);
        System.out.println("You've tried to get the month period: "+getMonth);
    }

    String switchMonth(String month){
        switch (month){
            case "january":
            case "february":
            case "march":
                return "1st";
            case "april":
            case "may":
            case "june":
                return "2nd";
            case "july":
            case "august":
            case "september":
                return "3rd";
            case "october":
            case "november":
            case "december":
                return "4th";

        }
        return "bad";
    }
}

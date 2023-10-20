import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String studentNo = "";
        String menuChoice = "";
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        ssn = SafeInput.getRegExString(in, "Enter your SSN", ssnRegEx);
        System.out.println("You said your ssn is " + ssn);
        String studentNoRegEx = "^(M|m)\\d{5}$";
        studentNo = SafeInput.getRegExString(in,"Enter your UC Student M number", studentNoRegEx);
        System.out.println("You said your UC Student M number is " + studentNo);
        String menuChoiceRegEx = "^[OoSsVvQq]$";
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", menuChoiceRegEx);
        System.out.println("You said your menu choice is: " + menuChoice);
    }
}

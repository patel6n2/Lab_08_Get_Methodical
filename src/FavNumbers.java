import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int integer = 0;
        double decimal = 0.0;
        integer = SafeInput.getInt(in, "Enter your favorite integer");
        decimal = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("You said your favorite integer is " + integer + " and your favorite double is " + decimal);
    }
}

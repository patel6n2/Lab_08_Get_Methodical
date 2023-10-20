import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String message = "";
        boolean done = false;
        do
        {
            System.out.print("Enter a message between 1 and 54 characters in length: ");
            message = in.nextLine();
            if(message.length() > 0 && message.length() <= 54)
            {
                done = true;
                SafeInput.prettyHeader(message);
            }
            else
                System.out.println("\nYou must enter at least one character and no more than fifty four characters!\n");
        }while(!done);
    }
}
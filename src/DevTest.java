import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner (System.in);

    public static void main(String[] args)
    {
        String firstName = "";
        String ssn = "";
        String message = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;
        boolean isConfirmed = false;
        boolean done = false;
        /*
        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);
        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);
        salary = getDouble(testScan, "Enter your salary");
        System.out.println("You said your salary is: " + salary);
        favNum = getRangedInt(testScan, "Enter your favorite number", 1, 10);
        System.out.println("You said your fav num is: " + favNum);
        salary = getRangedDouble(testScan, "Enter your salary", 300, 100000);
        System.out.println("You said salary is " + salary);
        //put the test here for getYNConfirm
        isConfirmed = SafeInput.getYNConfirm(testScan,"Do you want to continue?");
        System.out.println("You said continue: " + isConfirmed);
        //put the text here for getRegExString
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        ssn = getRegExString(testScan, "Enter your SSN", ssnRegEx);
        System.out.println("You said ssn is: " + ssn);
         */
    }

    // Methods go here!

    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use for the input
     * @param prompt the message for the user telling them what to input
     * @return a String of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();

            if(response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");
        }while(!done);

        return response;
    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }
        }while(!done);

        return value;
    }

    /**
     * returns an unconstrained double value
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @return an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double value = 0;
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }
        }while(!done);

        return value;
    }

    /**
     * gets a double val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to user for what to enter
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return any valid double
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }
        }while(!done);

        return value;
    }

    /**
     * Gets a double value within an inclusive range
     * @param pipe Scanner to use for input
     * @param prompt msg to user about what to enter
     * @param low low bound of inclusive range
     * @param high high bound of inclusive range
     * @return a double within inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double value = 0;
        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear the buffer

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);
            }
        }while(!done);

        return value;
    }

    /**
     * Returns a true false value for Yes or No Input [YN]
     * @param pipe scanner to read the input
     * @param prompt msg to tell the user what to input
     * @return a boolean true or false for yes or no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do
        {
            System.out.print(prompt + "[YyNn]: ");
            response = pipe.nextLine();

            if(response.toUpperCase().matches("[YN]"))
            {
                done = true;
                if (response.equalsIgnoreCase("Y"))
                    retVal = true;
                else // N
                    retVal = false;
            }
            else
                System.out.println("\nYou must enter a [y/n]!\n");
        }while(!done);

        return retVal;
    }

    /**
     * takes a regEx String and returns a valid match from the user
     * @param pipe scanner to use for input
     * @param prompt msg to user telling them what is needed for input
     * @param regEx a String that represents a Regular Expression to use for the test
     * @return a String value that matches the regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a String that matches the pattern " + regEx + "\n");
        }while(!done);

        return response;
    }

    /**
     * creates a pretty header and centers the msg
     * @param msg the message to display centered
     */
    public static void prettyHeader(String msg)
    {
        int leftover = 0;
        int halfLeftover = 0;
        boolean done = false;
        leftover = 54 - msg.length();
        halfLeftover = leftover / 2;
        for (int i = 1; i <= 60; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("*");
        }
        for (int i = 1; i <= halfLeftover; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 1; i <= halfLeftover; i++)
        {
            System.out.print(" ");
        }
        if (leftover % 2 != 0)
        {
            System.out.print(" ");
        }
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= 60; i++)
        {
            System.out.print("*");
        }
    }
}
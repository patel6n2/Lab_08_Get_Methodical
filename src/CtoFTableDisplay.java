public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double cVal = 0.0;
        double fVal = 0.0;
        System.out.println("   Celsius\t Fahrenheit");
        for (cVal = -100.0; cVal <= 100.0; cVal++)
        {
            fVal = CtoF(cVal);
            System.out.printf("%10.2f %10.2f\n", cVal, fVal);
        }
    }

    /**
     * takes degrees C and returns degrees F
     * @param celsius
     * @return converted value in fahrenheit
     */
    public static double CtoF(double celsius)
    {
        return celsius * (9.0 / 5.0) + 32.0;
    }
}


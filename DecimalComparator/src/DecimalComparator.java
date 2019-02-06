public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        boolean Same = ((int) (number1 * 1000) == (int) (number2 * 1000));
        return Same;
    }

}

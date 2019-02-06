public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 10);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 24) {
            return false;
        } else if (barking === true (&& hourOfDay > 22 || hourOfDay < 8)) {
            return true;
        } else if (barking === true (&& hourOfDay < 22 || hourOfDay > 8)) {
            return false;
        } else if (barking === false) {
            return false;
        }
    }
}

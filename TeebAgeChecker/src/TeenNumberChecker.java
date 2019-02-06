public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(15, 38, 30);
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if(13 <= age1 && age1 <= 19) {
            return true;
        } else if(13 <= age2 && age2 <= 19) {
            return true;
        } else if(13 <= age3 && age3 <= 19) {
            return true;
        }
        return false;
    }
}

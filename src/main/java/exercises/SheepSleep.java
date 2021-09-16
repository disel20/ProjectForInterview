package exercises;

public class SheepSleep {

    public static String countingSheep(int num) {
        //Add your code here
        String str = "";
        for (int i = 1; i <= num; i++) {
            str = str + i + " sheep...";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}

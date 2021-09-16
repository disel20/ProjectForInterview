package exercises;

public class ReverseStringWithoutUsingInbuiltFunction {

    public static void main(String[] args) {
        String str = "Revers String";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }
}

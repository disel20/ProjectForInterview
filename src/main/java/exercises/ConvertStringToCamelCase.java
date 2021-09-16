package exercises;

public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-new-task"));
    }

    static String toCamelCase(String s){
        StringBuilder buf = new StringBuilder(s.length());
        String result = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == '_' || s.charAt(i) == '-') {
                c = s.charAt(i+1);
                buf.append(Character.toUpperCase(c));
                i++;
            }
            else {
                buf.append(c);
            }
        }
        return buf.toString();
    }

}

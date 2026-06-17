import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) {
                    return false;
                }

                if (ch == ')' && st.peek() != '(') {
                    return false;
                }

                if (ch == '}' && st.peek() != '{') {
                    return false;
                }

                if (ch == ']' && st.peek() != '[') {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String s = sc.nextLine();

        System.out.println(isValid(s));

        sc.close();
    }
}
import java.util.*;

public class Main {

    public static int solve(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if (s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if (s.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if (s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] tokens = new String[n];

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.next();
        }

        System.out.println(solve(tokens));
    }
}
import java.util.*;

public class histogram {

    public static int solve(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            while (!st.isEmpty() &&
                  (i == heights.length || heights[st.peek()] >= heights[i])) {

                int height = heights[st.pop()];

                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();

                int width = right - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println(solve(heights));
    }
}
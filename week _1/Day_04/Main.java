
public class Main {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2},
            {3, 4}
        };

        int r = 1, c = 4;

        int[][] result = matrixReshape(mat, r, c);

        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
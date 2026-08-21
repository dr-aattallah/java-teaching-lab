public class MatrixReview {
    public static void main(String[] args) {
        int[][] data = {{10,20},{30,40}};
        for (int[] r : data) {
            for (int v : r) System.out.print(v + " ");
            System.out.println();
        }
    }
}

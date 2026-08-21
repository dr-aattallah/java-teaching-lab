public class Array2DDemo {
    public static void main(String[] args) {
        int[][] m = {{1,2},{3,4}};
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }
}

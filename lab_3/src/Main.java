import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                try {
                    matrix[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    return;
                }
            }
        }

        System.out.print("Enter the column number to print: ");
        int colToPrint;
        try {
            colToPrint = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        if (colToPrint < 0 || colToPrint >= cols) {
            System.out.println("There is no column with number " + colToPrint);
            return;
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][colToPrint]);
        }
    }
}
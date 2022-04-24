import java.util.Random;

public class Test {
    public static void main(String [] args){
        if (args.length != 3) {
            System.out.println("Usage: java Test <number of rows> <number of columns> <number of times>");
            System.exit(0);
        }
        else {
            int row = Integer.parseInt(args[0]);
            int column = Integer.parseInt(args[1]);
            int times = Integer.parseInt(args[2]);
            int[][] counter = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    counter[i][j] = 0;
                }
            }
            Random r = new Random();
            for (int i = 0; i < times; i++) {
                int rowIndex = r.nextInt(row);
                int columnIndex = r.nextInt(column);
                counter[rowIndex][columnIndex]++;
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(counter[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

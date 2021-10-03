package round2.problem3;

import java.io.*;

public class Solution {

    private static final String INPUT_FILE_NAME = "traffic_control_input.txt";
    private static final String OUTPUT_FILE_NAME = "traffic_control_output.txt";

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (FileReader fileReader = new FileReader(INPUT_FILE_NAME);
             BufferedReader reader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(OUTPUT_FILE_NAME);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {

            int cases = Integer.parseInt(reader.readLine());

            for (int i = 1; i <= cases; i++) {
                String[] input = reader.readLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int m = Integer.parseInt(input[1]);
                int a = Integer.parseInt(input[2]);
                int b = Integer.parseInt(input[3]);
                int[][] solution = trafficControl(n, m, a, b);
                if (solution == null) {
                    writer.write("Case #" + i + "" + ": Impossible\n");
                } else {
                    writer.write("Case #" + i + "" + ": Possible\n");
                    for (int line = 0; line < n; line++) {
                        for (int row = 0; row < m; row++) {
                            if (row == m - 1) {
                                writer.write(solution[line][row] + "\n");
                            } else {
                                writer.write(solution[line][row] + " ");
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] trafficControl(int n, int m, int a, int b) {
        if (m + n - 1 > a || m + n - 1 > b) {
            return null;
        }

        int[][] solution = new int[n][m];
        for (int i = 0; i < n; i++) {
            solution[i][0] = solution[i][m - 1] = 1;
        }

        for (int i = 0; i < m; i++) {
            solution[n - 1][i] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                solution[i][j] = 999;
            }
        }

        solution[0][0] = a - n - m + 2;
        solution[0][m - 1] = b - n - m + 2;

        return solution;
    }

}

import java.io.*;

public class Solution {

    private static final String INPUT_FILE_NAME = "weak_typing_chapter_1_input.txt";
    private static final String OUTPUT_FILE_NAME = "weak_typing_chapter_1_output.txt";

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
                int length = Integer.parseInt(reader.readLine());
                String exercise = reader.readLine();
                writer.write("Case #" + i + "" + ": " + minimumSwitches(exercise, length) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int minimumSwitches(String exercise, int length) {
        // The last character between X and O that was found.
        char lastChar = 'X';
        int switchCount = 0;

        char[] letters = exercise.toCharArray();
        int index = 0;

        for (; index < length; index++) {
            if (letters[index] != 'F') {
                lastChar = letters[index];
                break;
            }
        }

        for (; index < length; index++) {
            if (letters[index] != 'F' && letters[index] != lastChar) {
                lastChar = letters[index];
                switchCount++;
            }
        }

        return switchCount;
    }

}

import java.io.*;

public class Solution2 {

    private static final String INPUT_FILE_NAME = "weak_typing_chapter_2_sample_input.txt";
    private static final String OUTPUT_FILE_NAME = "weak_typing_chapter_2_sample_output.txt";

    private static final int MODULO = 1_000_000_007;

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
                writer.write("Case #" + i + "" + ": " + minimumSwitchesSubstring(exercise, length) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long minimumSwitchesSubstring(String exercise, int length) {
        // The last character between X and O that was found.
        char lastChar = 'X';
        long switchCount = 0;
        int lastIndex = 0;

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
                int switchLength = index - lastIndex + 1;

                for (int size = switchLength; size <= length; size++) {
                    switchCount += Math.min(length - size, lastIndex + size) - Math.max(index - size, 0) + 2;
                }
                lastChar = letters[index];
                lastIndex = index;
            }
        }

        return switchCount % 1_000_000_007;
    }

}

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final String INPUT_FILE_NAME = "consistency_chapter_1_input.txt";
    private static final String OUTPUT_FILE_NAME = "consistency_chapter_1_output.txt";

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
                writer.write("Case #" + i + "" + ": " + makeConsistent(reader.readLine()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int makeConsistent(String string) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char character : string.toCharArray()) {
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        int topVowelFrequency = 0;
        int topConsonantFrequency = 0;
        int totalVowels = 0;
        int totalConsonants = 0;

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (isVowel(entry.getKey())) {
                if (topVowelFrequency < entry.getValue()) {
                    topVowelFrequency = entry.getValue();
                }
                totalVowels += entry.getValue();
            } else {
                if (topConsonantFrequency < entry.getValue()) {
                    topConsonantFrequency = entry.getValue();
                }
                totalConsonants += entry.getValue();
            }
        }

        if (totalVowels == 0) {
            if (totalConsonants == topConsonantFrequency) {
                return 0;
            }
            if (topConsonantFrequency > 2 * (totalConsonants - topConsonantFrequency)) {
                return (totalConsonants - topConsonantFrequency) << 1;
            }
            return totalConsonants;
        }

        if (totalConsonants == 0) {
            if (totalVowels == topVowelFrequency) {
                return 0;
            }
            if (topVowelFrequency > 2 * (totalVowels - topVowelFrequency)) {
                return (totalVowels - topVowelFrequency) << 1;
            }
            return totalVowels;
        }

        if (totalVowels == topVowelFrequency) {
            if (totalConsonants == topConsonantFrequency) {
                return Math.min(totalVowels, totalConsonants);
            }
            if (topConsonantFrequency > 2 * (totalConsonants - topConsonantFrequency) + totalVowels) {
                return ((totalConsonants - topConsonantFrequency) << 1) + totalVowels;
            }
            return totalConsonants;
        }

        if (totalConsonants == topConsonantFrequency) {
            if (totalVowels > 2 * (totalVowels - topVowelFrequency) + totalConsonants) {
                return ((totalVowels - topVowelFrequency) << 1) + totalConsonants;
            }
            return totalVowels;
        }

        return Math.min(((totalVowels - topVowelFrequency) << 1) + totalConsonants,
                ((totalConsonants - topConsonantFrequency) << 1) + totalVowels);
    }

    private static boolean isVowel(char character) {
        return character == 'A' || character == 'E' || character == 'I'
                || character == 'O' || character == 'U';
    }

}

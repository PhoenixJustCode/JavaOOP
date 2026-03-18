// How to run:
// cd practice/week5/problem2
// javac pr5/io/app/WordCounter.java
// java pr5.io.app.WordCounter
// (make sure input.txt is in the problem2 directory)

package pr5.io.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading input.txt: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(wordCounts.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        try (PrintWriter writer = new PrintWriter("report.txt")) {
            for (Map.Entry<String, Integer> entry : sorted) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("report written to report.txt");
        } catch (IOException e) {
            System.out.println("error writing report.txt: " + e.getMessage());
        }
    }
}

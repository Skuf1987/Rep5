import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {
    public static void main(String args[]) {
        Set<String> set = new TreeSet<>();
        Map<String, Integer> wordCount = new HashMap<>();
        addWord("Йогурт", set, wordCount);
        addWord("Уголь", set, wordCount);
        addWord("Ураган", set, wordCount);
        addWord("Ель", set, wordCount);
        addWord("Нож", set, wordCount);
        addWord("Голова", set, wordCount);
        addWord("Гора", set, wordCount);
        addWord("Шар", set, wordCount);
        addWord("Голова", set, wordCount);
        addWord("Уголь", set, wordCount);
        addWord("Голова", set, wordCount);
        System.out.println(set);
        for(String word : set) {
            System.out.println(word + ": " + wordCount.get(word) + " раз(а)");
        }
    }
    private static void addWord(String word, Set<String> set, Map<String, Integer> wordCount) {
        set.add(word);
        int count = wordCount.containsKey(word) ? wordCount.get(word) : 0;
        wordCount.put(word, count + 1);
    }
}

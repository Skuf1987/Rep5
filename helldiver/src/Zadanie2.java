import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Zadanie2 {
        private Map<String, List<String>> directory;
        public Zadanie2() {
            directory = new HashMap<>();
        }
        public void add(String surname, String phoneNumber) {
            if (!directory.containsKey(surname)) {
                directory.put(surname, new ArrayList<>());
            }
            directory.get(surname).add(phoneNumber);
        }
        public List<String> get(String surname) {
            return directory.get(surname);
        }
    }


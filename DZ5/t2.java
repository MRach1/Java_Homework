package DZ5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class t2 {
    public static void main(String[] args){
        ArrayList<String> emps = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        TreeMap<String, Integer> map = new TreeMap<>();
        String j = "";
        int c = 0;
        for (String i: emps){
            String[] words = i.split(" ");
            j = words[0];
            if (map.containsKey(j)){
                c = map.get(j) + 1;
                map.put(j, c);
            }
            else{
                map.put(j, 1);
            }
        }
        sort(map);
    }
    public static void sort(Map<String, Integer> names) {
        Map<String, Integer> sortedName = names.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedName.entrySet().forEach(System.out::println); 
    }
}

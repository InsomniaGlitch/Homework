package Name_sort;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sorter {
    static Scanner in = new Scanner(System.in);
    public static void function() throws IOException {
        String[] file = Files
            .lines(Paths.get("C:\\folder\\input.txt"))
            .flatMap(str -> Stream.of(str.split(" ")))
            .toArray(String[]::new);
        List<String> names = Arrays.asList(file);
        ArrayList<Long> list = new ArrayList<>();
        LinkedHashMap<String, Long> sorted_frequency = new LinkedHashMap<>();
        Map<String, Long> frequency =
        names.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        for (Entry<String, Long> entry : frequency.entrySet()) {
            if(entry.getValue() != 1) {list.add(entry.getValue()); } }
        Collections.sort(list, new Comparator<Long>() {
            public int compare(Long l1, Long l2) {
                return (l2).compareTo(l1); }});
        for (Long l : list) {
            for (Entry<String, Long> entry : frequency.entrySet()) {
                if (entry.getValue().equals(l)) {
                    sorted_frequency.put(entry.getKey(), l);
                }
            }
        }
        sorted_frequency.forEach((s, l) -> System.out.println(s + ": " + l));
    }
}

package classroom.web05_12_2019.warmup;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringFilter {
    public static void main(String[] args) {
        String ss="abcdeaa";

        IntStream distinct = ss.chars().distinct();
        String collect = distinct.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(collect);
    }}


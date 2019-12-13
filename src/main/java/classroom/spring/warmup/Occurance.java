package classroom.spring.warmup;

import classroom._12_11_2019.warmup.GenArray;

import java.util.*;

public class Occurance {
    public static void main(String[] args) {
        GenArray ran = new GenArray();
        int[] array = ran.genArrByLenght(50, 10, 25);
        List<Integer> numbers = new ArrayList<>();
        for (int ar: array) {

            numbers.add(ar);
        }

        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        numbers.stream().forEach(num -> counts.put(num, Collections.frequency(numbers,num)));
    /*    for (Integer intg : numbers) {
            if (counts.containsKey(intg)) {
                counts.put(intg, counts.get(intg) + 1);
            } else {
                counts.put(intg, 1);
            }
        }
*/
//        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        System.out.println(counts);
    }
}

package classroom.web03_12_2019.warmup;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WarmUp {
    private int[][] array;
    public void setArray(int[][] array) {
        this.array = array;
    }
    Integer[] sorted(int[][] arr){
        List<Integer> streamed = new ArrayList<>();
        Arrays.stream(arr).collect(Collectors.toList()).forEach(a-> Arrays.stream(a).forEach(b->streamed.add(b)));
        Integer[] intArray = new Integer[streamed.size()];
        System.out.println(streamed);
        return intArray = streamed.toArray(intArray);
    }

    public static void main(String[] args) {
        int[][] arr={{1,6,3},{},{5,4},{7,8,2,9},{}};
        List<Integer> streamed = new ArrayList<>();
        Arrays.stream(arr).collect(Collectors.toList()).forEach(a-> Arrays.stream(a).forEach(b->streamed.add(b)));
        Integer[] intArray = new Integer[streamed.size()];
        System.out.println(streamed);
        intArray = streamed.toArray(intArray);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

    }
}

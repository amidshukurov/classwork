package classroom.web30_11_2019;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int n=11;
        int [] arr = new int[n];
        for (int i = 0; i <n/2 ; i++) {
            arr[i]=(n-1)/2;
            arr[n-1-i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}

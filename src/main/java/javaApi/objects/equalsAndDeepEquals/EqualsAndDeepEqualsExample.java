package javaApi.objects.equalsAndDeepEquals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

    //객체 동등 비교
    public static void main(String[] args) {
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println(Objects.equals(o1, o2));             // t
        System.out.println(Objects.equals(o1, null));        // f
        System.out.println(Objects.equals(null, o2));        // f
        System.out.println(Objects.equals(null, null));   // t
        System.out.println(Objects.deepEquals(o1, o2) + "\n");  // f -> t

        Integer[] arr1 = {1, 2};
        Integer[] arr2 = {1, 2};
        System.out.println(Objects.equals(arr1, arr2));         // t -> f
        System.out.println(Objects.deepEquals(arr1, arr2));     // t
        System.out.println(Arrays.deepEquals(arr1, arr2));      // t
        System.out.println(Objects.deepEquals(null, arr2));  // f
        System.out.println(Objects.deepEquals(arr1, null));  // f
        System.out.println(Objects.deepEquals(null, null)); // t
    }
}

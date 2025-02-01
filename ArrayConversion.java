import java.util.ArrayList;
import java.util.Arrays;

class ArrayConversion {
    ArrayList<Integer> arrayToArrayList(Integer[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    Integer[] arrayListToArray(ArrayList<Integer> list) {
        return list.toArray(new Integer[0]);
    }
}
import java.util.Arrays;

public class task3 {
    public static int[] mergeSort(int[] sortArr) {
        int[] arrA = Arrays.copyOf(sortArr, sortArr.length);
        int[] arrB = new int[sortArr.length];
        int[] result = mergeSortInner(arrA, arrB, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] arrA, int[] arrB, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return arrA;
        }

        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sort1 = mergeSortInner(arrA, arrB, startIndex, middle);
        int[] sort2 = mergeSortInner(arrA, arrB, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sort1 == arrA ? arrB : arrA;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sort1[index1] < sort2[index2]
                    ? sort1[index1++] : sort2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sort1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sort2[index2++];
        }
        return result;
    }
    public static void main(String args[]) {
        int[] sortArr = {24, 12, 1, 5,32, 64, 3, 8};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
}


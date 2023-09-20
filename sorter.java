import java.util.Arrays;

class sorter{
    public static void main(String[] args) {
        int[] inputArray = {64, 25, 12, 22, 11};
        System.out.println("Input Array: " + Arrays.toString(inputArray));

        selectionSort(inputArray);

        System.out.println("Sorted Array: " + Arrays.toString(inputArray));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void sort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
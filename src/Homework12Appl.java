public class Homework12Appl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 10, 99);
        printArray(arr);
        int res = indexOfMax(arr);
        System.out.println("Index of max = " + res);

    }

    public static int indexOfMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
}

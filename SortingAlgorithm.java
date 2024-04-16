public class SortingAlgorithm {
    public static int[] sort(int[] array) {
        int startingIndex = 0;
        do {
            for (int index = startingIndex; index < array.length; index++) {
                if (array[index] < array[startingIndex]) {
                    int temp = array[startingIndex];
                    array[startingIndex] = array[index];
                    array[index] = temp;
                }
            }
            startingIndex += 1;
        } while (startingIndex != array.length - 1);
        return array;
    }

    public static void main(String[] args) {
        int length = (int) (Math.random() * 20) + 30;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Before sorting: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        int[] sortedArray = sort(array);
        System.out.println();
        System.out.print("After Sorting: ");
        for (int sortedElement : sortedArray) {
            System.out.print(sortedElement + " ");
        }
    }
}
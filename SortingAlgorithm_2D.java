public class SortingAlgorithm_2D {
    public static int[][] sort2D(int[][] array2D, int rowNum, int columnNum) {
        int startingIndex = 0;
        int[] tempArray = new int[rowNum * columnNum];
        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < columnNum; c++) {
                tempArray[r * columnNum + c] = array2D[r][c];
            }
        }
        do {
            for (int index = startingIndex; index < tempArray.length; index++) {
                if (tempArray[index] < tempArray[startingIndex]) {
                    int temp = tempArray[startingIndex];
                    tempArray[startingIndex] = tempArray[index];
                    tempArray[index] = temp;
                }
            }
            startingIndex += 1;
        } while (startingIndex != tempArray.length - 1);
        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < columnNum; c++) {
                array2D[r][c] = tempArray[r * columnNum + c];
            }
        }
        return array2D;
    }

    public static void main(String[] args) {
        int rowNum = (int) (Math.random() * 10) + 20;
        int columnNum = (int) (Math.random() * 10) + 20;
        int[][] array2D = new int[rowNum][columnNum];
        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < columnNum; c++) {
                array2D[r][c] = (int) (Math.random() * 1000);
            }
        }
        System.out.println("Before Sorting: ");
        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < columnNum; c++) {
                if (array2D[r][c] < 10) {
                    System.out.print("00" + array2D[r][c] + " ");
                } else if (array2D[r][c] < 100) {
                    System.out.print("0" + array2D[r][c] + " ");
                } else {
                    System.out.print(array2D[r][c] + " ");
                }
            }
            System.out.println();
        }
        int[][] sortedArray2D = sort2D(array2D, rowNum, columnNum);
        System.out.println("\nAfter Sorting: ");
        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < columnNum; c++) {
                if (sortedArray2D[r][c] < 10) {
                    System.out.print("00" + sortedArray2D[r][c] + " ");
                } else if (sortedArray2D[r][c] < 100) {
                    System.out.print("0" + sortedArray2D[r][c] + " ");
                } else {
                    System.out.print(sortedArray2D[r][c] + " ");
                }
            }
            System.out.println();
        }
    }
}

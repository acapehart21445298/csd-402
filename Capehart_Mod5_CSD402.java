public class Capehart_Mod5_CSD402 {

    public static void main(String[] args) {

        // Test largest integer
        int[][] numbers = {
            {10, 25, 30},
            {45, 15, 20},
            {35, 50, 40}
        };

        int[] largestLocation = locateLargest(numbers);

        System.out.println("Largest value is at row "
                + largestLocation[0] + ", column " + largestLocation[1]);

        // Test largest double
        double[][] decimalNumbers = {
            {10.5, 25.2, 30.8},
            {45.6, 15.3, 20.1},
            {35.4, 50.9, 40.7}
        };

        int[] doubleLargestLocation = locateLargest(decimalNumbers);

        System.out.println("Largest decimal value is at row "
                + doubleLargestLocation[0] + ", column " + doubleLargestLocation[1]);

        // Test smallest integer
        int[] smallestLocation = locateSmallest(numbers);

        System.out.println("Smallest value is at row "
                + smallestLocation[0] + ", column " + smallestLocation[1]);

        int[] doubleSmallestLocation = locateSmallest(decimalNumbers);

        System.out.println("Smallest decimal value is at row "
                + doubleSmallestLocation[0] + ", column " + doubleSmallestLocation[1]);
    }

    private static void validateArray(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        for (int row = 0; row < arrayParam.length; row++) {
            if (arrayParam[row] == null || arrayParam[row].length == 0) {
                throw new IllegalArgumentException("Array rows cannot be null or empty.");
            }
        }
    }

    private static void validateArray(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }

        for (int row = 0; row < arrayParam.length; row++) {
            if (arrayParam[row] == null || arrayParam[row].length == 0) {
                throw new IllegalArgumentException("Array rows cannot be null or empty.");
            }
        }
    }

    // Find largest integer
    public static int[] locateLargest(int[][] arrayParam) {
        validateArray(arrayParam);

        int largest = arrayParam[0][0];
        int largestRow = 0;
        int largestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }

        return new int[]{largestRow, largestColumn};
    }

    // Find largest double
    public static int[] locateLargest(double[][] arrayParam) {
        validateArray(arrayParam);

        double largest = arrayParam[0][0];
        int largestRow = 0;
        int largestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }

        return new int[]{largestRow, largestColumn};
    }

    // Find smallest integer
    public static int[] locateSmallest(int[][] arrayParam) {
        validateArray(arrayParam);

        int smallest = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }

        return new int[]{smallestRow, smallestColumn};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        validateArray(arrayParam);

        double smallest = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;
                }
            }
        }

        return new int[]{smallestRow, smallestColumn};
    }
}
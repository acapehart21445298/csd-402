public class capehart_mod_4_csd402 {

    public static short average(short[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }

    return (short) (sum / array.length);
}

    public static int average(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }

    return sum / array.length;
}

public static long average(long[] array) {
    long sum = 0;

    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }

    return sum / array.length;
}

public static double average(double[] array) {
    double sum = 0;

    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }

    return sum / array.length;
}
    public static void main(String[] args) {

short[] shortArray = {10, 20, 30, 40};

int[] intArray = {150, 250, 350, 450, 550};

long[] longArray = {1000, 2000, 3000, 4000, 5000, 6000};

double[] doubleArray = {10.5, 20.5, 30.5};

System.out.println("AVERAGE OF ARRAYS");
System.out.println("------------------------------");

System.out.println("Short Array: " + java.util.Arrays.toString(shortArray));
System.out.println("Average: " + average(shortArray));

System.out.println();

System.out.println("Int Array: " + java.util.Arrays.toString(intArray));
System.out.println("Average: " + average(intArray));

System.out.println();

System.out.println("Long Array: " + java.util.Arrays.toString(longArray));
System.out.println("Average: " + average(longArray));

System.out.println();

System.out.println("Double Array: " + java.util.Arrays.toString(doubleArray));
System.out.println("Average: " + average(doubleArray));

    }
}

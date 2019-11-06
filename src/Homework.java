import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Homework {


    public static void main(String[] args) {
        System.out.println(isPolyndrome("arafra"));
        System.out.println(Arrays.toString(randomArray(10)));
        int[] array;
        array = randomArray(10);
        System.out.println(findNumberPosition(array, 34));
        System.out.println(Arrays.toString(findMinAndMax(array)));
        System.out.println(averageOfArray(array));
        System.out.println(negativeNumber(array));
        System.out.println(Arrays.toString(deleteElement(array, 3)));
        System.out.println(Arrays.toString(inReverse(array)));
        System.out.println(isArrayIncreacing(array));
        System.out.println(Arrays.toString(arrayShuffle(array)));
        System.out.println(Arrays.toString(isIncreace(array)));
        System.out.println(Arrays.deepToString(twoDimensional(3, 3)));
    }

    public static boolean isPolyndrome(String s) {
        int stringChars = s.length();
        for (int i = 0; i < (stringChars / 2); ++i) {
            if (s.charAt(i) != s.charAt(stringChars - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int[] randomArray(int n) {
        int max = 100;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * ++max) - 25;
        }
        return array;
    }

    public static int findNumberPosition(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findMinAndMax(int[] array) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            } else {
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            array[max] = min;
            array[min] = max;
        }
        return array;
    }

    public static double averageOfArray(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
        }
        return average;
    }

    public static int negativeNumber(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] < 0) {
                count++;
                break;
            }
        }
        return count;
    }

    public static int[] deleteElement(int[] array, int position) {
        int[] resArray = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != position) {
                resArray[j] = array[i];
                j++;
            }
        }
        return resArray;
    }


    public static int[] inReverse(int[] array) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[array.length - 1 - i];
        }
        return res;
    }

    public static boolean isArrayIncreacing(int[] array) {
        boolean res = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                res = false;
            }
        }
        return res;
    }

    public static int[] arrayShuffle(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = rnd.nextInt(array.length - 1);
            array[index] = array[i];
        }
        return array;
    }

    public static int[] isIncreace(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static int[][] twoDimensional(int a, int b) {
        int max = 100;
        int[][] array2d = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * ++max) - 25;
            }
        }
        return array2d;
    }
}

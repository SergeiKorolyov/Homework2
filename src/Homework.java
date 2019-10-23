import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isPolyndrome("ara ara"));
        System.out.println(Arrays.toString(randomArray(10)));
        int[] array;
        array = randomArray(10);
        System.out.println(positionFinder(array, 34));
        System.out.println(Arrays.toString(findMinAndMax(array)));
        System.out.println(averageOfArray(array));
        System.out.println(negativeNumber(array));
        System.out.println(Arrays.toString(deleteElement(array, 3)));
        System.out.println(Arrays.toString(inReverse(array)));
        System.out.println(isArrayIncreacing(array));
        System.out.println(Arrays.toString(arrayShuffle(array)));
        System.out.println(Arrays.toString(isIncreace(array)));
       System.out.println(twoDimensional(3,3));
    }

    public static boolean isPolyndrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int[] randomArray(int n) {
        int max = 100;
        int min = -100;
        max -= min;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * ++max) + min;
        }
        return array;
    }

    public static int positionFinder(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findMinAndMax(int[] array) {
        int max = array[0];
        int imax = 0;
        int min = array[0];
        int imin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
        }
        array[imin] = max;
        array[imax] = min;
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
            if (array[i] < 0) ;
            count++;
        }
        return count;
    }

    public static int[] deleteElement(int[] array, int position) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == position)
                i++;
            {
                for (j = 0; j < array.length - 1; j++) {
                    array[i] = array[j];
                    j++;
                }
            }
        }
        return array;
    }


    public static int[] inReverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[j] = array[i];
            j--;
        }
        return reverseArray;
    }

    public static boolean isArrayIncreacing(int[] array) {
        boolean res = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                res = false;
            }
        }
        return res;
    }

    public static int[] arrayShuffle(int[] array) {
        Random rnd = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
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
        int min = -100;
        max -= min;
        int[][] array2d = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * ++max) + min;
            }
        }
        return array2d;
    }
}

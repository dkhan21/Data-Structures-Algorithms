import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        //SWITCH N with 32, 100, 1000, or 10000
        int n = 32;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];
        int[] array4 = new int[100];
        int[] array5 = new int[1000];
        int[] array6 = new int[10000];


        //For Worst Case Input
        for(int m = 0; m < n; m++){
            array1[m] = n-m;
        }


        //For Best case input
        for(int m = 0; m < n; m++){
            array2[m] = m;
        }

        //For Random Input at n = 32
        Random random = new Random();
        for(int i = 0; i < array3.length; i++){
            array3[i] = random.nextInt(100);
        }
        //For Random Input at n = 100
        for(int i = 0; i < array4.length; i++){
            array4[i] = random.nextInt(100);
        }

        //For Random Input at n = 1000
        for(int i = 0; i < array5.length; i++){
            array5[i] = random.nextInt(100);
        }

        //For Random Input at n = 10000
        for(int i = 0; i < array6.length; i++){
            array6[i] = random.nextInt(100);
        }

        int[] input_array1 = array1.clone();
        int[] input_array2 = array2.clone();
        int[] input_array3 = array3.clone();
        int[] input_array4 = array4.clone();
        int[] input_array5 = array5.clone();
        int[] input_array6 = array6.clone();


        int global_counter1 = 0;
        int global_counter2 = 0;
        int global_counter3 = 0;
        int global_counter4 = 0;
        int global_counter5 = 0;
        int global_counter6 = 0;

        int compareCounter1 = 0;
        int compareCounter2 = 0;
        int compareCounter3 = 0;
        int compareCounter4 = 0;
        int compareCounter5 = 0;
        int compareCounter6 = 0;


        for (int i = 1; i < array1.length; i++) {

            int key = array1[i];
            int k;
            for (k = i; k > 0; k--) {
                global_counter1++;
                if (array1[k - 1] > key) {
                    compareCounter1++;
                    array1[k] = array1[k - 1];
                    continue;
                }
                break;
            }
            array1[k] = key;

        }
        System.out.println("Worst Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = " + n);
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array1.length; j++){
            System.out.print(input_array1[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter1);
        System.out.println("Comparison Count: " + compareCounter1);

        //N = 32 for best case

        for (int j = 1; j < array2.length; j++) {

            int key = array2[j];
            int k;
            for (k = j; k > 0; k--) {
                global_counter1++;
                if (array2[k - 1] > key) {
                    compareCounter1++;
                    array2[k] = array2[k - 1];
                    continue;
                }
                break;
            }
            array2[k] = key;

        }
        System.out.println();
        System.out.println();
        System.out.println("Best Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = " + n);
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array2.length; j++){
            System.out.print(input_array2[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array2.length; a++) {
            System.out.print(array2[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter2);
        System.out.println("Comparison Count: " + compareCounter2);

        // n = 32 for Average Case

        for (int l = 1; l < array3.length; l++) {

            int key = array3[l];
            int k;
            for (k = l; k > 0; k--) {
                global_counter3++;
                if (array3[k - 1] > key) {
                    compareCounter3++;
                    array2[k] = array3[k - 1];
                    continue;
                }
                break;
            }
            array3[k] = key;

        }
        System.out.println();
        System.out.println();
        System.out.println("Average Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = " + n);
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array3.length; j++){
            System.out.print(input_array3[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array3.length; a++) {
            System.out.print(array3[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter3);
        System.out.println("Comparison Count: " + compareCounter3);

        //N = 100 for average case

        for (int a = 1; a < array4.length; a++) {

            int key = array4[a];
            int k;
            for (k = a; k > 0; k--) {
                global_counter4++;
                if (array4[k - 1] > key) {
                    compareCounter4++;
                    array4[k] = array4[k - 1];
                    continue;
                }
                break;
            }
            array4[k] = key;

        }
        System.out.println();
        System.out.println();
        System.out.println("Average Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = 100");
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array4.length; j++){
            System.out.print(input_array4[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array4.length; a++) {
            System.out.print(array4[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter4);
        System.out.println("Comparison Count: " + compareCounter4);

        //N = 1000 for average case

        for (int b = 1; b < array5.length; b++) {

            int key = array5[b];
            int k;
            for (k = b; k > 0; k--) {
                global_counter5++;
                if (array5[k - 1] > key) {
                    compareCounter5++;
                    array5[k] = array5[k - 1];
                    continue;
                }
                break;
            }
            array5[k] = key;

        }
        System.out.println();
        System.out.println();
        System.out.println("Average Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = 1000");
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array5.length; j++){
            System.out.print(input_array5[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array5.length; a++) {
            System.out.print(array5[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter5);
        System.out.println("Comparison Count: " + compareCounter5);

        /*
        //N = 10000 for average case

        for (int c = 1; c < array6.length; c++) {

            int key = array6[c];
            int k;
            for (k = c; k > 0; k--) {
                global_counter6++;
                if (array6[k - 1] > key) {
                    compareCounter6++;
                    array6[k] = array6[k - 1];
                    continue;
                }
                break;
            }
            array6[k] = key;

        }
        System.out.println();
        System.out.println();

        System.out.println("Average Case");
        System.out.println("___________");
        System.out.println();
        System.out.println("n = 10000");
        System.out.print("Input Array: ");

        for(int j = 0; j < input_array6.length; j++){
            System.out.print(input_array6[j] + ", ");
        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for (int a = 0; a < array6.length; a++) {
            System.out.print(array6[a] + ", ");
        }
        System.out.println();
        System.out.println("Global Count: " + global_counter6);
        System.out.println("Comparison Count: " + compareCounter6);

         */

    }

}

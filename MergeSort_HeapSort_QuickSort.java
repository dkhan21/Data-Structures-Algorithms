import java.util.Random;

public class MergeSort_HeapSort_QuickSort {
    private static int compareCount1 = 0;
    public static void main(String[] args) {
        //Merge Sort: n= 32

        int[] array1 = new int[32];
        int[] array2 = new int[32];
        int[] array3 = new int[32];


        //Sorted
        for(int i = 0; i < 32 ; i++){
            array1[i] = i;
        }
        //Reversed
        for(int j = 0; j < 32; j++){
            array2[j] = 31- j;
        }
        //Randome Generated
        Random random = new Random();
        for(int i = 0;  i < 32; i++){
            array3[i] = random.nextInt(32);
        }

        int[] array4 = array1.clone();
        int[] array5 = array2.clone();
        int[] array6 = array3.clone();

        int[] array7 = array1.clone();
        int[] array8 = array2.clone();
        int[] array9 = array3.clone();

        System.out.println("MergeSort");
        System.out.println("----------------------------------------------------");

        //Sorted
        System.out.println("MergeSort- Sorted:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        mergeSort(array1);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();
        System.out.println();


        //Reverse
        compareCount1 = 0;
        System.out.println("MergeSort- Reverse:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        mergeSort(array2);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();
        System.out.println();

        //Random
        compareCount1 = 0;
        System.out.println("MergeSort- Random:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        mergeSort(array3);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();

        // HEAPSORT IS NOW HERE
        System.out.println("HeapSort");
        System.out.println("----------------------------------------------------");
        //Sorted
        compareCount1 = 0;
        System.out.println("HeapSort- Sorted:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array4[i] + " ");
        }
        System.out.println();
        heapSort((array4));

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array4[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();

        //Reverse
        compareCount1 = 0;
        System.out.println("HeapSort- Reverse:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array5[i] + " ");
        }
        System.out.println();
        heapSort(array5);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array5[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();

        // Random
        compareCount1 = 0;
        System.out.println("HeapSort- Random:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array6[i] + " ");
        }
        System.out.println();
        heapSort(array6);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array6[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();


        //Quicksort

        System.out.println("QuickSort");
        System.out.println("----------------------------------------------------");

        //Sorted
        compareCount1 = 0;
        System.out.println("QuickSort- Sorted:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array7[i] + " ");
        }
        System.out.println();
        quickSort(array7, 0, 31);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array7[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();

        //Reverse
        compareCount1 = 0;
        System.out.println("QuickSort- Reverse:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array8[i] + " ");
        }
        System.out.println();
        quickSort(array8, 0, 31);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array8[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();

        //Random
        compareCount1 = 0;
        System.out.println("QuickSort- Random:");
        System.out.println("Before: " );
        for(int i = 0; i < 32 ; i++){
            System.out.print(array9[i] + " ");
        }
        System.out.println();
        quickSort(array9, 0, 31);

        System.out.println("After:");
        for(int i = 0; i < 32 ; i++){
            System.out.print(array9[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println();


        //Question 2-------------------------------------------------------------------------------
        int n1 = 1024;
        int n2 = 32768;
        int n3 = 1048576;

        int[] arrayMerge1 = new int[n1];
        int[] arrayMerge2 = new int[n2];
        int[] arrayMerge3 = new int[n3];

        int[] arrayHeap1 = new int[n1];
        int[] arrayHeap2 = new int[n2];
        int[] arrayHeap3 = new int[n3];

        int[] arrayQuick1 = new int[n1];
        int[] arrayQuick2 = new int[n2];
        int[] arrayQuick3 = new int[n3];

        for(int i = 0;  i < n1; i++){
            arrayMerge1[i] = random.nextInt(n1);
            arrayHeap1[i] = random.nextInt(n1);
            arrayQuick1[i] = random.nextInt(n1);
        }

        for(int i = 0;  i < n2; i++){
            arrayMerge2[i] = random.nextInt(n2);
            arrayHeap2[i] = random.nextInt(n2);
            arrayQuick2[i] = random.nextInt(n2);
        }

        for(int i = 0;  i < n3; i++){
            arrayMerge3[i] = random.nextInt(n3);
            arrayHeap3[i] = random.nextInt(n3);
            arrayQuick3[i] = random.nextInt(n3);
        }


        //Merge-----------

        //n = 2^10
        // NOTICE: I put the measured time for 2^10 in millisecond since it was really small.
        System.out.println("Large Array Sizes Sorting:");
        System.out.println();

        System.out.println("MergeSort");
        System.out.println("----------------------------------------------------");
        compareCount1 = 0;
        System.out.println("MergeSort- Sorted - 2^10:");
        long startTime = System.nanoTime();
        mergeSort(arrayMerge1);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        double t = (double)  time / 1_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to MergeSort 2^10 values in milliseconds: " + t );
        System.out.println();

        // n= 2^15
        compareCount1 = 0;
        System.out.println("MergeSort- Reverse - 2^15:");
        startTime = System.nanoTime();
        mergeSort(arrayMerge2);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to MergeSort 2^10 values in seconds: " + t );
        System.out.println();

        // n = 2^20

        compareCount1 = 0;
        System.out.println("MergeSort- Random - 2^20:");
        startTime = System.nanoTime();
        mergeSort(arrayMerge3);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to MergeSort 2^10 values in seconds: " + t );
        System.out.println();

        //Heap
        System.out.println("HeapSort");
        System.out.println("----------------------------------------------------");
        compareCount1 = 0;
        System.out.println("HeapSort- Sorted - 2^10:");
        startTime = System.nanoTime();
        heapSort(arrayHeap1);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to HeapSort 2^10 values in milliseconds: " + t );
        System.out.println();

        // n= 2^15
        compareCount1 = 0;
        System.out.println("HeapSort- Reverse - 2^15:");
        startTime = System.nanoTime();
        heapSort(arrayHeap2);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to HeapSort 2^10 values in seconds: " + t );
        System.out.println();

        // n = 2^20

        compareCount1 = 0;
        System.out.println("HeapSort- Random - 2^20:");
        startTime = System.nanoTime();
        heapSort(arrayHeap3);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to HeapSort 2^10 values in seconds: " + t );
        System.out.println();


        //Quick
        System.out.println("QuickSort");
        System.out.println("----------------------------------------------------");
        compareCount1 = 0;
        System.out.println("QuickSort- Sorted - 2^10:");
        startTime = System.nanoTime();
        quickSort(arrayQuick1, 0, 1023);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to QuickSort 2^10 values in milliseconds: " + t );
        System.out.println();

        // n= 2^15
        compareCount1 = 0;
        System.out.println("QuickSort- Reverse - 2^15:");
        startTime = System.nanoTime();
        quickSort(arrayQuick2, 0, 32767);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to QuickSort 2^15 values in seconds: " + t );
        System.out.println();

        // n = 2^20

        compareCount1 = 0;
        System.out.println("QuickSort- Random - 2^20:");
        startTime = System.nanoTime();
        quickSort(arrayQuick3, 0, 1048575);
        endTime = System.nanoTime();
        time = endTime - startTime;
        t = (double)  time / 1_000_000_000.0;
        System.out.println("Number of Compare Occurences: " + compareCount1);
        System.out.println("Time to QuickSort 2^20 values in seconds: " + t );
        System.out.println();

    }

    public static void quickSort(int[] array, int lx, int hx){
        if(lx >= hx){
            return;
        }
        int pv = array[hx];

        int p1 = lx;
        int p2 = hx;

        while(p1 < p2){
            while(p1 < p2 && array[p1] <= pv){
                compareCount1++;
                p1++;
            }

            while(array[p2] >= pv && p1 < p2 ){
                compareCount1++;
                p2--;
            }
            swap(array, p1, p2);
        }
        swap(array, p1, hx);

        quickSort(array, lx, p1-1);
        quickSort(array, p1+1, hx);


    }

    public static void swap(int[] array, int ind1, int ind2){
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    public static void heapSort(int[] array) {
        int length = array.length;
        // Created the max heap first
        for (int i =length/2-1; i >= 0; i--) {
            heapify(array, length, i);
        }
        //We then get the elements from the heap one by one
        for (int i = length - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            int t = array[0];
            array[0] =array[i];
            array[i] =t;

            // Recursive call on the reduced heap
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int length, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

            // left > than the root
        if ((left < length) && (array[left] > array[largest])) {
            compareCount1++;
            largest = left;
        }
            // right side > than largest
        if ((right < length) && (array[right] > array[largest])) {
            compareCount1++;
            largest = right;
        }
            // Swap if largest not in root
        if (largest != index) {
            int swap = array[index];
            array[index] = array[largest];
            array[largest] = swap;
            // We heapify the tree
            heapify(array, length, largest);
        }
    }


    public static void mergeSort(int[] array){
        int len = array.length;
        if(len < 2){
            return;
        }
        int mid = len /2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];

        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int j = mid; j < len; j++ ){
            right[j - mid] = array[j];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);

    }
    public static void merge(int[] array, int[] left, int[] right){
        int a = 0, b = 0, c = 0;
        int rightLen = right.length;
        int leftLen = left.length;

        while (a < leftLen && b < rightLen) {
            if (left[a] <= right[b]) {
                compareCount1 += 1;
                array[c] = left[a];
                a++;
            } else {
                compareCount1 += 1;
                array[c] = right[b];
                b++;
            }
            c++;
        }
        while (a < leftLen) {
            array[c] = left[a];
            a++;
            c++;
        }

        while (b < rightLen) {
            array[c] = right[b];
            b++;
            c++;
        }
    }


}

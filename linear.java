public class linear {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 1, 0 };

        int min = 0;
        int max = 1;

        printArr(arr);
        System.out.println();
        linearsort(arr, min, max);

    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
    
    static void linearsort(int arr[], int min, int max) {
        if (max == arr.length - 1) {
            printArr(arr);
            return;
        }
    
        
        if (arr[min] >= arr[max]) {
            arr[max] = arr[min];
            max = min;
        }
        else {
            arr[min] = arr[max];
            min = max;
        }

        // linearsort(arr, min+1, max+1);
       
    }
}

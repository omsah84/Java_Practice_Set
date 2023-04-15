public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        int start = 0;
        int end = arr.length;

        printArr(arr);
        System.out.println();
        reverseArr(arr, start, end - 1);
    }

    static void printArr(int arr[])
    {
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    static void reverseArr(int arr[], int start, int end) {
        
        if (start >= end) {
            printArr(arr);
            return;
        }     
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArr(arr, start+1, end-1);

    }
    

}

import javax.lang.model.util.ElementScanner14;

public class linearSearch {
    static int search(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7,8,0 };
        int value = 0;

        int ind = search(arr, value);

        if (ind == -1) {
            System.out.println("The value not found..");
        } else {
            System.out.println("The index of value " + value + " is " + arr[ind]);

        }

    }
}

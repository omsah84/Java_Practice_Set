import java.util.Scanner;

public class TwoDarray {

    //constructor
    TwoDarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for row..");
        int row = sc.nextInt();
        System.out.println("Enter for col..");
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];

        //input taking in array..
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                //for formatting
                System.out.print("Enter the array element.. arr[" + r + "," + c + "] = ");
                arr[r][c] = sc.nextInt();
            }

        }
        
        //print array element ....
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + arr[i][j]);

            }
            System.out.println();
        }

        
    }
//drive code
    public static void main(String[] args) {
        while (true) {
            //instance block 
            //showing for array size
            {

                System.out.println("Array size..");
            }
            

            //making object of this class 
            //and also called a constructor
            TwoDarray oj = new TwoDarray();
            

            //this is styling a
            System.out.println("==========================================");
        }
       
    }
}

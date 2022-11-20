package from2to10;

import java.util.Scanner;

public class BinaryCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while(true){
            int n = scan.nextInt();

            if(n==0)
                break;

            if(n<=255){
                int[] arr = new int[8];

                if(n >= 128){
                    n = n - 128;
                    arr[0] = 1;
                } else arr[0] = 0;

                if(n >= 64){
                    n = n - 64;
                    arr[1] = 1;
                } else arr[1] = 0;

                if(n >= 32){
                    n = n - 32;
                    arr[2] = 1;
                } else arr[2] = 0;

                if(n >= 16){
                    n = n - 16;
                    arr[3] = 1;
                } else arr[3] = 0;

                if(n >= 8){
                    n = n - 8;
                    arr[4] = 1;
                } else arr[4] = 0;

                if(n >= 4){
                    n = n - 4;
                    arr[5] = 1;
                } else arr[5] = 0;

                if(n >= 2){
                    n = n - 2;
                    arr[6] = 1;
                } else arr[6] = 0;

                if(n == 1){
                    n = n - 1;
                    arr[7] = 1;
                } else arr[7] = 0;

                for (int i = 0; i < 8; i++) {
                    arr[i] = arr[i];
                    System.out.print(arr[i] + " ");
                }
                System.out.print("\n");
            }
        }

    }
}

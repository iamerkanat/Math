package from2to10;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();

        if(n<=255){
            int[] arr = new int[8];
            for (int i = 0; i < 8; i++) {
                if(i == 0 && n >= 128){
                    n = n - 128;
                    arr[i] = 1;
                }
                else if(i == 0 && !(n >= 128)){
                    arr[i] = 0;
                }
                if(i == 1 && n >= 64){
                    n = n - 64;
                    arr[i] = 1;
                } else if(i == 1 && !(n >= 64)){
                    arr[i] = 0;
                }
                if(i == 2 && n >= 32){
                    n = n - 32;
                    arr[i] = 1;
                } else if(i == 2 && !(n >= 32)){
                    arr[i] = 0;
                }
                if(i == 3 && n >= 16){
                    n = n - 16;
                    arr[i] = 1;
                } else if(i == 3 && !(n >= 16)){
                    arr[i] = 0;
                }
                if(i == 4 && n >= 8){
                    n = n - 8;
                    arr[i] = 1;
                } else if(i == 4 && !(n >= 8)){
                    arr[i] = 0;
                }
                if(i == 5 && n >= 4){
                    n = n - 4;
                    arr[i] = 1;
                } else if(i == 5 && !(n >= 4)){
                    arr[i] = 0;
                }
                if(i == 6 && n >= 2){
                    n = n - 2;
                    arr[i] = 1;
                } else if(i == 6 && !(n >= 2)){
                    arr[i] = 0;
                }
                if(i == 7 && n == 1){
                    n = n -1;
                    arr[i] = 1;
                } else if(i == 7 && !(n == 1)){
                    arr[i] = 0;
                }

                System.out.print(arr[i] + " ");
            }

    }
}
}

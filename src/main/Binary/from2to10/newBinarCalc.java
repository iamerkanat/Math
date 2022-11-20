package from2to10;

import java.util.Scanner;

public class newBinarCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            if (n == 0)
                break;

            if(n<=255 && !(n==0)) {
                int[] arr = new int[8];
                for (int i = 0; i < 8; i++) {
                    if (i == 0 && n >= 128) {
                        n = n - 128;
                        arr[i] = 1;
                    } else if (i == 0 && !(n >= 128)) {
                        arr[i] = 0;
                    }
                    if (i == 1 && n >= 64) {
                        n = n - 64;
                        arr[i] = 1;
                    } else if (i == 1 && !(n >= 64)) {
                        arr[i] = 0;
                    }
                    if (i == 2 && n >= 32) {
                        n = n - 32;
                        arr[i] = 1;
                    } else if (i == 2 && !(n >= 32)) {
                        arr[i] = 0;
                    }
                    if (i == 3 && n >= 16) {
                        n = n - 16;
                        arr[i] = 1;
                    } else if (i == 3 && !(n >= 16)) {
                        arr[i] = 0;
                    }
                    if (i == 4 && n >= 8) {
                        n = n - 8;
                        arr[i] = 1;
                    } else if (i == 4 && !(n >= 8)) {
                        arr[i] = 0;
                    }
                    if (i == 5 && n >= 4) {
                        n = n - 4;
                        arr[i] = 1;
                    } else if (i == 5 && !(n >= 4)) {
                        arr[i] = 0;
                    }
                    if (i == 6 && n >= 2) {
                        n = n - 2;
                        arr[i] = 1;
                    } else if (i == 6 && !(n >= 2)) {
                        arr[i] = 0;
                    }
                    if (i == 7 && n == 1) {
                        n = n - 1;
                        arr[i] = 1;
                    } else if (i == 7 && !(n == 1)) {
                        arr[i] = 0;
                    }

                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
            }
            if(n >= 256){
                int[] array = new int [16];
                for (int i = 0; i < 16; i++) {
                    if(i == 0 && n >= (int)Math.pow(2, 15)){
                        n = n - (int)Math.pow(2, 15);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 15))){
                        array[i] = 0;}

                    if(i == 1 && n >= (int)Math.pow(2, 14)){
                        n = n - (int)Math.pow(2, 14);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 14))){
                        array[i] = 0;}

                    if(i == 2 && n >= (int)Math.pow(2, 13)){
                        n = n - (int)Math.pow(2, 13);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 13))){
                        array[i] = 0;}

                    if(i == 3 && n >= (int)Math.pow(2, 12)){
                        n = n - (int)Math.pow(2, 12);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 12))){
                        array[i] = 0;}

                    if(i == 4 && n >= (int)Math.pow(2, 11)){
                        n = n - (int)Math.pow(2, 11);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 11))){
                        array[i] = 0;}

                    if(i == 5 && n >= (int)Math.pow(2, 10)){
                        n = n - (int)Math.pow(2, 10);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 10))){
                        array[i] = 0;}

                    if(i == 6 && n >= (int)Math.pow(2, 9)){
                        n = n - (int)Math.pow(2, 9);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 9))){
                        array[i] = 0;}

                    if(i == 7 && n >= (int)Math.pow(2, 8)){
                        n = n - (int)Math.pow(2, 8);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 8))){
                        array[i] = 0;}

                    if(i == 8 && n >= (int)Math.pow(2, 7)){
                        n = n - (int)Math.pow(2, 7);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 7))){
                        array[i] = 0;}

                    if(i == 9 && n >= (int)Math.pow(2, 6)){
                        n = n - (int)Math.pow(2, 6);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 6))){
                        array[i] = 0;}

                    if(i == 10 && n >= (int)Math.pow(2, 5)){
                        n = n - (int)Math.pow(2, 5);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 5))){
                        array[i] = 0;}

                    if(i == 11 && n >= (int)Math.pow(2, 4)){
                        n = n - (int)Math.pow(2, 4);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 4))){
                        array[i] = 0;}

                    if(i == 12 && n >= (int)Math.pow(2, 3)){
                        n = n - (int)Math.pow(2, 3);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 3))){
                        array[i] = 0;}

                    if(i == 13 && n >= (int)Math.pow(2, 2)){
                        n = n - (int)Math.pow(2, 2);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 2))){
                        array[i] = 0;}

                    if(i == 14 && n >= (int)Math.pow(2, 1)){
                        n = n - (int)Math.pow(2, 1);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 1))){
                        array[i] = 0;}

                    if(i == 15 && n >= (int)Math.pow(2, 0)){
                        n = n - (int)Math.pow(2, 0);
                        array[i] = 1;
                    } else if (i == 0 && !(n >= (int)Math.pow(2, 0))){
                        array[i] = 0;}

                    System.out.print(array[i] + " ");
                }
                System.out.println("");
            }


        }

    }
}

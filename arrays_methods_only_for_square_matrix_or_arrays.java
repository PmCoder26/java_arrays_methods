package practice;

import java.util.Scanner;
// Only applicable for square matrix or array.
public class arrays_methods {
    public static Scanner sc=new Scanner(System.in);

    public static int[][] arrayCreater(int row, int column){

        int[][] arr=new int[row][column];
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr.length; y++){
                System.out.print("Enter element "+(x+1)+" , "+(y+1)+": ");
                arr[x][y]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void arrayPrinter(int[][] arr){
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr.length; y++){
                System.out.print(arr[x][y]+"  ");
            }
            System.out.println();
        }
    }
    public static int[][] arrayTranspose(int[][] arr){
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr.length; y++){
                if((arr[x]!=arr[y]) && x<y){
                    int temp;
                    temp=arr[x][y];
                    arr[x][y]=arr[y][x];
                    arr[y][x]=temp;
                }
            }
        }
        return arr;
    }
    public static int[][] rotate_Clockwise_By90(int[][] arr){
        arr=arrayTranspose(arr);
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr.length/2; y++){
                int temp=0;
                temp=arr[x][arr.length-1-y];
                arr[x][arr.length-1-y]=arr[x][y];
                arr[x][y]=temp;
            }
        }
        return arr;
    }
    public static void pascalTrianle(int n){
        int[][] ar=new int[n][n];
        for(int x=0; x<ar.length; x++){
            for(int y=0; y<=x; y++){
                if(x==y || y==0){
                    ar[x][y]=1;
                }
                else{
                    ar[x][y]=ar[x-1][y]+ar[x-1][y-1];
                }
            }
        }
        arrayPrinter(ar);
    }

    public static void PrintSpiral(int[][] arr) {
        int rCol = arr.length - 1, lCol = 0;
        int topRow = 0, bottomRow = arr.length - 1;
        int elements = 1;
        while (elements <= arr.length * arr.length) {
//        Steps to print in spiral form
//        1) topRow -> lCol to rCol.
            for (int i = lCol; i <= rCol; i++) {
               if(elements > arr.length * arr.length){
                   break;
               }
                System.out.print(arr[topRow][i] + " ");
                elements++;
            }
            topRow++;
//        2) lCol -> topRow to bottomRow.
            for (int j = topRow; j <= bottomRow; j++) {
                if(elements > arr.length * arr.length){
                    break;
                }
                System.out.print(arr[j][rCol] + " ");
                elements++;
            }
            rCol--;
//        3) bottomRow -> rCol to lCol.
            for (int k = rCol; k >= lCol; k--) {
                if(elements > arr.length * arr.length){
                    break;
                }
                System.out.print(arr[bottomRow][k]+" ");
                elements++;
            }
            bottomRow--;
//        4) rCol -> bottomRow to topRow.
            for (int l = bottomRow; l >= topRow; l--) {
                if(elements > arr.length * arr.length){
                    break;
                }
                System.out.print(arr[l][lCol] + " ");
                elements++;
            }
            lCol++;
        }
    }

    
}

package practice;

import java.util.Scanner;

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

}

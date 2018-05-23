package com.test01;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //arrayDig(10,10);
        //arrayDig2(10,10);
        //arrayBalance();
        //arrayMinMax();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        stepArrey(arr, 3);
    }


    public static void arrayDig (int x, int y){
        //int x=10,y=10;int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <y ; j++) {
                if (i==j){
                    arr[i][j]=1;
                    arr[i][y-j-1]=1;
                }
            }
        }

        // =======print
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void arrayDig2(int x,int y){
            int[][] arr = new int[x][y];
            for (int i = 0; i < y ; i++) {
                arr[i][i]=1;
                arr[i][y-i-1]=1;
            }

            // =======print
            for (int i = 0; i < x ; i++) {
                for (int j = 0; j < y; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
    }

    public static void arrayBalance(){
            //int[] arr = new int[x];
        int lSide=0,rSide=0, goal=0;
        int[] arr = {1,2,4,2,2,1,1,1};
        for (int i = 0; i <arr.length ; i++) {
            lSide = lSide+arr[i];
            rSide = 0;
            for (int j = arr.length-1; j >i ; j--) {
                rSide = rSide+arr[j];
            }
            if (lSide==rSide) {
                System.out.println("Сумма двух сторон массива равны:" + lSide);
                System.out.println("Разделение по индексу:[" + i + "]");
                goal = 1;
            }
        }
        if (goal!=1){
            System.out.println("Сумма двух сторон массива не равны");
        }
    }

    public static void arrayMinMax(){
        int[] arr = {5,1,15,3,9,-4,0,7};
        int min =0, max=0, elmin=0, elmax=0;

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                min =arr[0];
                max =arr[0];
                elmin = 0;
                elmax = 0;
            }
            if(arr[i]>max){
                max=arr[i];
                elmax= i;
            }
            if(arr[i]<min){
                min=arr[i];
                elmin = i;
            }
        }
        System.out.println("Минимальное значение="+min+" Индекс массива:["+elmin+"]");
        System.out.println("Максимальное значение="+max+" Индекс массива:["+elmax+"]");
    }

    public  static void stepArrey(int[] arr,  int n){
            //List list= Arrays.asList(arr);
        int size = arr.length;
        if (n>0) {
            for (int i = 0; i < n; i++) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }
        if (n<0){
            n= n * -1;
            for (int i = size; i > n; i--) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

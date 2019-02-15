package com.company;

import com.sun.scenario.effect.Merge;

import java.util.Random;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {

        int n = 300;
        int [] rArray = new  int[n];

        System.out.println();
        System.out.println("----------Bubble Sort Tiempo ------------");
        System.out.println("");
        System.out.println("");

        while (n<50000){

            long TiempoInicio = System.nanoTime();
            BubbleSort(rArray);
            long TiempoFinal = System.nanoTime();
            long DeltaTiempo = TiempoFinal - TiempoInicio;

            System.out.println("El Tiempo de Bubble Sort para : "+ n + "numero es de :"+ DeltaTiempo);
            n+=n;
        }

        Random lr = new Random();
        LectorTeclado lt = new LectorTeclado();
        System.out.println("");
        System.out.println("Escoge el tamaño que desea el Arreglo (BS): ");
        int l = lt.leerEntero("","Tiene que ser un Entero Valido!");

        int [] mArray = new int[l];
        for (int i = 0; i <mArray.length ; i++) {
            mArray[i] =lr.nextInt(300);

        }

        BubbleSort(mArray);
        System.out.println("");
        System.out.println("");
        System.out.println("Tenemos Bubble Sort");
        System.out.println("");
        for (int i = 0; i <mArray.length ; i++) {
            System.out.println(""+mArray[i]);
        }

        System.out.println("");
        System.out.println("");


        System.out.println("----------Merge Sort Tiempo------------");
        System.out.println("");
        System.out.println("");

        int j = 300;
        int [] eArray = new int[j];

        while (j<50000){

            long TiempoInicial = System.nanoTime();
            sort(eArray);
            long TiempoFinal = System.nanoTime();
            long DeltaTiempo = TiempoFinal - TiempoInicial;

            System.out.println("El Tiempo de Merge Sort para : "+ j + "numero es de :"+ DeltaTiempo);
            j+=j;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(" Escoge el Tamaño que desea del Arreglo(MS)");
        int o = lt.leerEntero(""," Tiene que ser un Entero Valido!");

        int [] lArray = new int[o];
        for (int i = 0; i <lArray.length; i++) {
            lArray[i] = lr.nextInt(300);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Tenemos Merge Sort");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i <lArray.length ; i++) {
            System.out.println(""+lArray[i]);
            
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public static  int [] LlenarArreglo(int[]a){
        a = new int[15];
        Random r = new Random();
        for(int i = 0; i < a.length ; i++) {
            a[i] = r.nextInt();
        }
        return a;
    }

    public static int [] BubbleSort(int[]a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }

        return a;
    }

    public static void MergeSort(int[] n, int a , int b, int c, int d){

        d = Math.min(d,n.length-1);
        int merg [] = new int[d-a + 1];
        int idx = 0;
        int or = a;
        while (idx < merg.length)
            if ((a>b ?false: (c>d? true: n[a] <= n[c])))
                merg[idx++] = n[a++];
            else
                merg[idx++] = n[c++];

        for (int i = 0; i <merg.length ; i++) {

        }

    }

    public static int [] sort (int[] n){
        int i = 1;
        for (int i1 = 0; i <n.length ; i*=2) {
            for (int j = 0; j <n.length ; j+= i) {
                int p = i >> 1;
                MergeSort(n,j,j+p-1,j+p,j+p+p-1);

            }
        }
        MergeSort(n,0,i/2-1,n.length);
        return n;

    }

    private static void MergeSort(int[] n, int i, int i1, int length) {
    }


}

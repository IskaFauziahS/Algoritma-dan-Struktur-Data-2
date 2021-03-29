package Matrik3x3;

import java.util.Scanner;

public class Transposematriks {
     public static void main(String[] args) {
            int[][] a = new int[][]{
                  {2,1,-5},
                  {3,4,2}
            };
                 
            int[][] b = new int[][]{
                  {2,3},
                  {1,4},
                  {-5,2}
            };   
             int i, j, m, n;
             
          
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.println("======Matriks A=====");
        System.out.print("Masukan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom matriks: ");
        n = scan.nextInt();
         System.out.print("Masukan elemen matriks: ");
         for(i = 0; i < m; i++){
             for(j = 0; j < n; j++) {
             matriks[i][j] = scan.nextInt();
          }
        }
          System.out.println("======Matriks B =====");
        System.out.print("Masukan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.print("Masukan jumlah kolom matriks: ");
        n = scan.nextInt();
         System.out.print("Masukan elemen matriks: ");
         for(i = 0; i < m; i++){
             for(j = 0; j < n; j++) {
             matriks[i][j] = scan.nextInt();
          }
        }
         System.out.println("Hasil matriks: ");
         for(i = 0; i < m; i++){
             for(j = 0; j < n; j++) {
             System.out.print( matriks[i][j] + "\t");
         }
             System .out.println();
         }
         for(i = 0; i < m; i++){
             for(j = 0; j < n; j++) {
                 transpose[j][i] = matriks[i][j];
              }
            } 
          System.out.println("Hasil transpose matriks: ");
         for(i = 0; i < m; i++){
             for(j = 0; j < n; j++) {
             System.out.print( matriks[i][j] + "\t");
             }
             System .out.println();
             System.out.println("Iska Fauziah Setianingsih");  
         }
    }
}
           




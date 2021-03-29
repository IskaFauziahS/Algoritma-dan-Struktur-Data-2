package Matrik3x3;
public class Jawabanno2 {
    public static void main(String[] args) {
    System.out.println("Matriks ordo 3x2: ");
       int[][] a = new int[][]{
           {3,5},
           {7,3},
           {4,6} 
       };
       
       int[][] b = new int[][]{
           {2,1},
           {4,3},
           {5,6}
 };
       
        int pengurangan [][] = new int [3][2];
        
     System.out.println("Matriks A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] +" ");
                
            }
            System.out.println(" ");
            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }
        System.out.println("hasil pengurangan");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]-b[i][j]+ " ");
            }
            System.out.println(" ");  
            System.out.println("Iska Fauziah Setianingsih");  
        }
    }
}     



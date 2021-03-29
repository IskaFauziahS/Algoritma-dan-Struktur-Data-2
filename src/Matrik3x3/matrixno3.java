package Matrik3x3;
public class matrixno3 {
    public static void main(String[] args, String y) {
            int[][] a = new int[][]{
                  {5,9,2},
                  {7,8,4}
            };
                 
            int[][] b = new int[][]{
                  {1,6},
                  {5,7},
                  {2,3}};
            
        int baris_a = a.length;
        int kolom_a = a[0].length;
        int baris_b = b.length;
        int kolom_b = b[0].length;
        int[][] hasilKali = new int[baris_a][kolom_b];
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<kolom_a; k++){
                    hasilKali[i][j] = hasilKali[i][j] + (a[i][k]*b[k][j]);                                      
                }
            }
        }
        for (int[] x: hasilKali){
            for (int Y: x){
                System.out.print(y+" ");
            }
                System.out.println();
                System.out.println("Iska Fauziah Setianingsih");  
        }
    }
}
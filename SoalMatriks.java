import java.util.Scanner;

public class SoalMatriks {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Selamat datang ");
        System.out.println();

        System.out.print("Masukkan Jumlah Baris : ");
        int baris = value.nextInt();

        System.out.print("Masukkan Jumlah Kolom : ");
        int kolom = value.nextInt();

        int matrix[][] = new int[baris][kolom];
        
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Masukkan Matrix Baris " + (i+1) + " Kolom " + (j+1) + " : ");
                matrix[i][j] = value.nextInt();
            }
        }
        System.out.println();
        System.out.println("Hasil Matrix : \n ");
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        value.close();

       

        
    
    }
}

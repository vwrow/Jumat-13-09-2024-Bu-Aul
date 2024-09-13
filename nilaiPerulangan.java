package perulanganBuAul;
import java.util.Scanner;

public class nilaiPerulangan {
    public static void main(String[] args) {
        
        int jumSis;
        double rata,nilai, totNilai = 0;
        Scanner a = new Scanner(System.in);

    System.out.print("Jumlah Siswa: ");
    jumSis = a.nextInt();

    for (int i = 1; i <= jumSis; i++) {
        System.out.print("Nilai Siswa " +i +": ");
        nilai = a.nextDouble();
        totNilai = totNilai + nilai;
        }
    
    rata = totNilai/jumSis;
    System.out.println("Total Nilai: " +totNilai);
    System.out.println("Rata - Rata Nilai: " +rata);

    a.close();
    }
    
}

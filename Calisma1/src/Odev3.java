import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int n=0,i=0,j=0;
        int[][] dizi=new int[n][n];
        System.out.println("lütfen dizinin boyutunu giriniz");
        n=klavye.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }





    }
}

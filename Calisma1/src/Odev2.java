import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //Dizideki elemanları küçükten büyüğe doğru sıralayan ve ekrana yazdıran program.
        int[] dizi = {7, 3, 125, 9, 1, 0, 17, 88, 22, 4};
        int i, j;
        for (i = 0; i < dizi.length-1; i++) {
            int sayi=dizi[i];
            int indeks=i;
            for (j = i+1; j < dizi.length; j++) {
                if(dizi[j]<sayi){
                    sayi = dizi[j];
                    indeks = j;
                }
            }
            if(indeks != i){
                dizi[indeks] = dizi[i];
                dizi[i] = sayi;
            }

        }

        for (int sayi:dizi) {
            System.out.println(sayi);





                }
            }


    }







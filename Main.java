import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] dizi = new int[10000];
        Random rand = new Random();

        // Diziyi rastgele sayılarla doldur
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rand.nextInt(10000);
        }

        // Dizideki en büyük sayıyı bul (hızlı yol ile)
        int max = bulMax(dizi);

        // En büyük sayıyı ekrana yazdır
        System.out.println("En büyük sayı: " + max +"(Oluşturduğum algoritmaya göre)");



    }

    public static int bulMax(int[] dizi) {
        int max = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > max) {
                max = dizi[i];
            }
        }
        return max;
    }
}
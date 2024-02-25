import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
//Kullanıcıdan Alınacak Değer
        System.out.print("Basamak Sayısı Giriniz: ");
        int basamak = input.nextInt();
//İlk döngü ile i ve basamak değeri algoritmaya sokuluyor
        for (int i=basamak; i>0; i--){
//Yıldılar için gerekli döngü i'nin değerlemesi ile ekleniyor
            for (int k=1; k<=2*i - 1;k++){
                System.out.print("*");
            }
            for (int j=1; j<basamak -i; j++){
                System.out.print(" ");
//Satır atlanmasıu için eklenen print kısmı
            }
            System.out.println();
        }
    }
}
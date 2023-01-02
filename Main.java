import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz : ");

        select= inp.nextInt();

        if(select==1){
            System.out.println("Toplama : " +(n1+n2));
        } else if (select==2) {
            System.out.println("Çıkarma : "+(n1-n2));
        } else if (select==3) {
            System.out.println("Çarpma : "+(n1*n2));
        } else if (select==4) {
            if (n2!=0){
                System.out.println("Bölme : "+(n1/n2));
            }else{
                System.out.println("Bir sayı 0'a bölünmez.");
            }

        }else {
            System.out.println("Yalnış seçim yaptınız.Tekrar deneyiniz.");
        }


    }
}
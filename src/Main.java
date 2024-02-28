import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int intNumber ,intDonusum ;
        double doubleNumber, doubleDonusum;
        Scanner userInp = new Scanner(System.in);
        System.out.print("Double yapmak istediğiniz sayı: ");

        intNumber = userInp.nextInt();

        System.out.print("İnteger yapmak istediğiniz sayı:  ");

        doubleNumber= userInp.nextDouble();


        System.out.println("Tam sayıya dönüştürmek istediğiniz sayı: " + (double)intNumber);
        System.out.println("Double sayıya dönüştürmek istediğiniz sayı: " + (int)doubleNumber);




    }
}
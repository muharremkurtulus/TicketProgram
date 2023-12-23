import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
         int age, km, tripType;
         double amount, amountDiscount,  finalAmount , ageDiscount;
         double ageDiscount1 = 0.5 , ageDiscount2 = 0.1 , ageDiscount3 = 0.3, tripTypeDiscount = 0.2;
         // ageDiscount1 => Yaşın 12'den küçük olması durumunda uygulanacak indirim
         // ageDiscount2 => Yaşın 11'den büyük ve 25 den küçük olması durumunda uygulanacak indirim
         // ageDiscount3 => Yaşın 65'den büyük olması durumunda uygulanacak indirim
         // tripTypeDiscount => Çift yön yolculuk tipi seçildiği takdirde uygulanacak indirim

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = inp.nextInt();

        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();


        System.out.print("Lütfen yolculuk tipini giriniz (1 => Tek Yön 2= > Çift Yön): ");
        tripType = inp.nextInt();
        if (km > 0 ) {
        switch (tripType) {


            case 1:
                if (age < 12) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount1;
                    finalAmount = amount - amountDiscount;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");

                } else if (age > 13 && age <= 24) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount2;
                    finalAmount = amount - amountDiscount;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                } else if (age > 65) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount3;
                    finalAmount = amount - amountDiscount;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                } else {
                    finalAmount = km * 0.10;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                }
                break;

            case 2:
                if (age < 12) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount1;
                    ageDiscount = amount - amountDiscount;
                    finalAmount = (ageDiscount - (ageDiscount * tripTypeDiscount)) * 2;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                } else if (age > 13 && age <= 24) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount2;
                    ageDiscount = amount - amountDiscount;
                    finalAmount = (ageDiscount - (ageDiscount * tripTypeDiscount)) * 2;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                } else if (age > 65) {

                    amount = km * 0.10;
                    amountDiscount = amount * ageDiscount3;
                    ageDiscount = amount - amountDiscount;
                    finalAmount = (ageDiscount - (ageDiscount * tripTypeDiscount)) * 2;
                    System.out.println("Ödemeniz: " + finalAmount + " TL");


                } else {
                    amount = km * 0.10;
                    finalAmount = amount - (amount * tripTypeDiscount);
                    System.out.println("Ödemeniz: " + finalAmount + " TL");

                }
                break;

            default:
                System.out.println("Geçersiz Bir Değer Girdiniz !");
        }

        } else {
            System.out.println("Hatalı Bir Giriş Yaptınız !");
        }

    }
}
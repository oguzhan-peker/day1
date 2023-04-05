public class Main {
    public static void main(String[] args) {
 /*
        System.out.println("Merhaba Java");
        System.out.println("Merhaba Java 2 ");
        // ders
        int ogrenciSayisi = 13;
        String mesaj = "Öğrenci sayisi : ";
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
        // ders degisti
        int sayi = 12;
        double sayii = 12.5;
        char karakter = 'A';
        boolean dogruMu = false;
        // ders gecisi
        int sayi = 21;
        if(sayi<20){
            System.out.println("Sayı 20 den küçüktür");
        }
        else if(sayi==20){
            System.out.println("Sayı 20'ye eşittir");
        }
        else{
            System.out.println("Sayı 20 den büyüktür");

  */
 /*
        int sayi1=20;
        int sayi2 =25;
        int sayi3 =2;
        int enBuyuk = sayi1;
        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if(enBuyuk<sayi3) {
            enBuyuk= sayi3;
        }
        System.out.println("En büyük = "+ " "+ enBuyuk);

  */
/*
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel! : geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel! : geçtiniz");
                break;
            case 'C':
                System.out.println("İyi! : geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil! : geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girildi");
        }
 */
        /*
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.print("for döngüsü bitti!");

        int i=1;
        while(i<10){
            System.out.print(i);
            i+=2;
        }
        System.out.print("while döngüsü bitti!");
        int j=1;
        do{
           System.out.print(j);
           j+=2;
        }while(j<10);
        System.out.print("do-while döngüsü bitti!");

         */
/*
        String [] ogrenciler = new String[3];
        ogrenciler[0] = "Oguz";
        ogrenciler[1]="Engin";
        ogrenciler[2]="Alper";
        for(int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
 */
        /*
        double total=0;
        double[] myList= {1.2,1.3,5.6,4.3};
        double max=myList[0];
        for(double number:myList){
            if(max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println(total);
        System.out.println(max);
         */
        /*
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Kayseri";
        sehirler[2][0]="Diyarbakır";
        sehirler[2][1]="Şanlıurfa";
        sehirler[2][2]="Gaziantep";
        for(int i=0;i<=2;i++){
            System.out.println("-------------------");
            for (int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
         */
        /*
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
         */
        /*
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2,5));
        //mesaj.toLowerCase küçük harf yapar - mesaj.toUpperCase büyük harf yapar.
         */
        /*
        int number =25;
        int remainder = number%2;
        System.out.println(remainder);
        boolean isPrime = true;
        for(int i=2; i<number;i++){
            if(number%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değil");
        }
         */
        /*
        char harf= 'I';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Kalın sesli harf");
            break;
            default:
                System.out.println("İnce sesli harf");
        }

         */
/*
        int number = 28;
        int total = 0;
        for(int i=1;i<number;i++){
            if(number%i ==0){
                total=total+i;
            }
        }
        if(total== number){
        System.out.println("mükemmel sayıdır");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }
 */
        /*
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak= 5;
        boolean varMi =false;
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("sayı mevcut");
        }else{
            System.out.println("Sayı mevcut değil");
        }
         */
        /*
        String mesaj ="Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(11,3);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2) {
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }

    public static String sehirVer(){
        return "Bursa";

         */
    }
}
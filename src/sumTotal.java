public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın
        String d = "";
        String e = "";
        double sayi = 0;
        double toplam = 0;
        double carpim = 1;
        String[][] dizi = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (dizi[i][j].contains("$")) {d = dizi[i][j].replace("$", "");
                    sayi = Double.parseDouble(d);
                    carpim = sayi * 3.2;
                    toplam = toplam + carpim;}

                if (dizi[i][j].contains("€")) {e = dizi[i][j].replace("€", "");
                    sayi = Double.parseDouble(e);
                    carpim = sayi * 4.2;
                    toplam = toplam + carpim; }
            }
        }System.out.println("toplam = " + (toplam-18.6));
    }
}





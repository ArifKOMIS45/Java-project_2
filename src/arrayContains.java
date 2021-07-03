import java.util.Arrays;
import java.util.Scanner;

public class arrayContains {

    /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
         ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
         İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
         gönderiniz.

         1 2 3 2 3 → 1.dizi :  1,2,3  2.Dizi : 2,3  => true
         10 20 3 1 2 → 1.dizi :  10 20 3  2.Dizi : 1,2  => false
         1 2 3 1 2 → 1.dizi :  1 2 3  2.Dizi : 1 2  => true

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }

        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }

//        Code start here
//        Use the array name UseThisArray1 and UseThisArray2

//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan

        for (int i=0;i<UseThisArray2.length;i++)
        {
            for (int j=0; j<UseThisArray1.length;j++)

                if (UseThisArray1[j]==UseThisArray2[i])
                {
                    System.out.println("true");
                }
                else System.out.println("false");


        }





    }
}

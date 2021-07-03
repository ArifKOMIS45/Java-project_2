import java.util.Arrays;
import java.util.Scanner;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

         int 2D arrayini  olustur

        2D arrayinden min number print et

     */




    public static void main(String[] args) {

        int [][] array= {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min= array [0][0];
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<3; j++)
            {
                if (array[i][j]<min)
                    min=array[i][j];
            }
        }
        System.out.println(min);






}

}

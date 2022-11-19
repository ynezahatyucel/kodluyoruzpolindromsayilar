package Giris;

import java.util.Scanner;

public class polindromSayi {
    static boolean ispolindram(int sayi) {
        int number = sayi, yenisayi, terssayi = 0;

        while (number != 0) {
            yenisayi = number % 10;
            System.out.println(yenisayi);
            terssayi = (terssayi * 10) + yenisayi;
            System.out.println(terssayi);
            number /= 10;
            System.out.println();
        }

        if (sayi==terssayi) {
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        System.out.println( ispolindram(201));
        
    }
}

// 12S24006 - Margareth Bungaran Sitompul
// 12S24012 - Choqy Pananda Sirait

import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddy = new String[4];
        int i;

        i = 0;
        inisialisasi(buddy);
        func_input(i, buddy);
        roomBuddies(i, buddy);
    }
    
    public static void inisialisasi(String[] buddy) {
        int i;

        for (i = 0; i <= 3; i++) {
            buddy[i] = "";
        }
    }
    
    public static void func_input(int i, String[] buddy) {
        boolean bud;

        do {
            if (i < 4) {
                buddy[i] = input.nextLine();
                if (buddy[i].equals("---")) {
                    bud = false;
                } else {
                    bud = true;
                }
                i = i + 1;
            } else {
                bud = false;
            }
        } while (bud == true);
    }
    
    public static void roomBuddies(int i, String[] buddy) {
        while (i < 4) {
            if (!buddy[i].equals("---")) {
                System.out.println(buddy[i]);
                i = i + 1;
            } else {
                i = i + 3;
            }
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kartez_16;

import java.util.Scanner;

/**
 *
 * @author stepan.moc
 */
public class Kartez_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IN
        Scanner sc = new Scanner(System.in);
        double x, y, r, fi;
        System.out.println("Zadejte souřadnice x a y ve formátu: 20 5");
        x = sc.nextInt();
        y = sc.nextInt();
        //COM
        r = Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
        fi = Math.atan(y/x);
        x = r * Math.cos(fi);
        y = r * Math.sin(fi);
        //OUT
        System.out.println("r: " + r + "\nfi: " + fi + "\nx: " + x + "\ny: " + y);
    }
    
}

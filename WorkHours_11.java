/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workhours_11;

import java.util.Scanner;


public class WorkHours_11 {

    
    public static void main(String[] args) {
        //IN
        Scanner sc = new Scanner(System.in);
        double odvody, dan, zamSoc, zamZdra, cistaMzda;
        int hours, plat, hrubaMzda;
        System.out.println("Zadejte počet odpracovaných hodin v měsíci");
        hours = sc.nextInt();
        System.out.println("Zadejte hrubou hodinovou mzdu");
        plat = sc.nextInt();
        //COM
        hrubaMzda = hours*plat;
        odvody = hrubaMzda * 0.11 ;
        dan = hrubaMzda * 0.15;
        zamSoc = hrubaMzda * 0.248;
        zamZdra = hrubaMzda * 0.09;
        cistaMzda = hrubaMzda - odvody - dan;
        //OUT
        System.out.println("Hrubá mzda: " + hrubaMzda + "Kč\nOdvody: " + odvody + "Kč \nSociální: " + hrubaMzda*0.065 + "Kč, Zdrav.: " + hrubaMzda*0.045 + "Kč");
        System.out.println("Daň: " + dan + "Kč\nČistá mzda: " + cistaMzda + "Kč");
        System.out.println("Zaměstnavatel odvádní za sociální pojíštění: " + zamSoc +"Kč a za zdravotní:" + zamZdra + "Kč" );
        
        
    }
    
}

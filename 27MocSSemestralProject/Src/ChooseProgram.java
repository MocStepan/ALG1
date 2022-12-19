/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scalarmultiplication;

import static scalarmultiplication.ScalarMultiplication.sc;

/** 
 * 1. Program se snaží najít dva vektory s největší skalární součin ze zadané sady vektorů
 * @author Štěpán Moc 
 * @version 0.3 19/12/2022 
 */  

public class ChooseProgram {
    
    /*Toto je hlavní menu, kde si uživatel vybere, co chce spustit */
    public static void main(String[] args) {
        
        /*Vytvoříme odkazy na externí classy*/
        ScalarMultiplication class1 = new ScalarMultiplication();
        Vanoce class2 = new Vanoce();
        
        int x = 0;    
        while(x!=3) {
            System.out.println("Jaký program chcete spustit");
            System.out.println("1) Spustí program na zjištění skalárního součinu");
            System.out.println("2) Spustí vánoční hodinu");
            System.out.println("3) Ukončí program");
            x = sc.nextInt();
            
            /*Podle inputu vyvolá classu, kterou si vybral, pokud zadá 3, tak se program ukončí,
              pokud zadá něco jiného, než určené čísla, tak program bude pokračovat dále*/
            if (x == 1) {
                class1.main(null);
            }
            else if(x == 2){
                class2.main(null);
            }
        }    
    }
}

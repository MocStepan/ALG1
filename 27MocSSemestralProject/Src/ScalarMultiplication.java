/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scalarmultiplication;
import java.util.Scanner;

/** 
 * 1. Program se snaží najít dva vektory s největší skalární součin ze zadané sady vektorů
 * @author Štěpán Moc 
 * @version 0.3 19/12/2022 
 */  


public class ScalarMultiplication {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ChooseProgram class1 = new ChooseProgram();
        int amountOfVectors, sizeOfVectors;

        /*Nahrání počtu vektorů a zkontroluje, jestli je >0 */
        System.out.println("Počet vektorů");
        amountOfVectors = sc.nextInt();

        while (amountOfVectors > 0) {

            /*Nahrání délky vektorů */
            System.out.println("Délka vektorů");
            sizeOfVectors = sc.nextInt();
            if (sizeOfVectors <= 0) {
                System.out.println("Délka vektoru nemůže být záporné číslo nebo nula");
                System.exit(0);
            }

            /*Vytvoří dvourozměrné pole, která má počet řádků jako počet vektorů
              a má počet sloupců jako délku vektorů a uživatel nahraje jednotlivé vektory*/
            double[][] inputArray = new double[amountOfVectors][sizeOfVectors];
            System.out.println("Zadej vektory");
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    inputArray[i][j] = sc.nextDouble();
                }
            }

            /*Vytvoří pole o třech místech, kam uloží na [0-1] číslo řady prvnío a druhého vektoru
              , kteří mají největší skalární součin a na [2] vloží výsledek jejich skalárního součinu*/
            double[] arrayOfTwoVectors = new double[3];
            
            /*Vyvolá metodu, kde najde dva vektory s největším skalárním součinem a jejich skalární součin */
            arrayOfTwoVectors = findTwoVectors(inputArray);
            
            /*Vypíše jednotlivé vektory a jejich skalární součin */
            printVectorsAndScalarMultiplication(arrayOfTwoVectors, inputArray);

            /*Načte počet vektorů do proměnné */
            System.out.println("Počet vektorů");
            amountOfVectors = sc.nextInt();
        }   
        /*Vrátí se zpátky do menu */
        class1.main(null);
    }

    /*Metoda zjistí dva vektory a jejich maximální skalární součin */
    public static double[] findTwoVectors(double[][] inputArray) {
        double result;
        double[] resultArray = new double[3];
        resultArray[2] = Double.MIN_VALUE;

        /*Vezme vektor na [0][0-n] a zjišťuje skalární součin s dalšími vektory [1-n][1-n],
          pak vezme další vektor a zjišťuje skalární součin s dalšími vektory*/
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                result = 0;
                for (int k = 0; k < inputArray[i].length; k++) {
                    if ((i != j) || (inputArray.length == 1)) {
                        result = inputArray[i][k] * inputArray[j][k] + result;
                    } else {
                        break;
                    }
                }
                /*Pokud je aktuální skalární součin větší než předšlí, tak nahraje nový maximální součin do pole[2] a 
                  nahraje řádky vektorů do pole. Např.: i = [0] a j = [3]*/
                if (result > resultArray[2]) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    resultArray[2] = result;
                }
            }
        }
        /*Vrátí pole s [0-1] číslo řady prvnío a druhého vektoru, kteří mají největší skalární součin
          a na [2] vloží výsledek jejich skalárního součinu*/
        return resultArray;
    }

    /*Metoda, která vypíše vektory a jejich skalární součin*/
    public static void printVectorsAndScalarMultiplication(double[] arrayOfTwoVectors, double[][] inputArray) {
        
        /*For cyklus proběhne dvakrát, poprvé aby vypsal první vektor a podruhé, aby vypsal druhý vektor */
        System.out.println("Vektory s maximálním skalárním součinem");
        for (int i = 0; i < 2; i++) {
            System.out.print("(");
            for (int j = 0; j < inputArray[0].length; j++) {
                /*Protože pole s výslednými vektory je typu double, tak ho musíme convertovat na typ int, 
                  aby jsme ho mohli použít v inputArray */
                int line = (int) arrayOfTwoVectors[i];
                System.out.print(inputArray[line][j] + " ");
            }
            System.out.print(")");
            System.out.println("");
        }
        System.out.println("Skalární součin těchto vektorů " + arrayOfTwoVectors[2]);
    }
}

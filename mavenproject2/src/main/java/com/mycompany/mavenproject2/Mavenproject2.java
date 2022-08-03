/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Gian
 */
public class Mavenproject2 {

    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        double res=0;
        String operacion;
        boolean comprobar = false;
        String number_1;
        // Comprobacion de caracteres,signos y numeros en el primer numero
           do{
              System.out.println("Numero 1 por favor");
              number_1=input.nextLine();
              // Ingreso de datos en caracteres para convertirlo numeros
           }while(!number_1.matches("[+-]?[qwertyuiolpsadhfgjkñxczvnbm]*[.]?[0123456789]+"));
           double nume1=Double.parseDouble(number_1);
           double n1=new Double(nume1);
           // Se selecciona la operacion
           do{
               System.out.println("n ¿Que operacion quiere hacer? Solo coloque un Signo");
               System.out.println("Teniendo en cuenta que:n +(Suma) n -(resta) n x(multiplicacion) n /(division) n *=elevar primer numero al"
                       + "segundo numero n %(residuo)");
               operacion = input.nextLine();
               // verificacion de signos
               if(operacion.equals("+") || operacion.equals("-")||operacion.equals("x") || operacion.equals("*")||operacion.equals("/") || operacion.equals("X")|| operacion.equals("%")){
                   comprobar=true;
               }else{
                   comprobar=false;
               }
           }while(comprobar!=true);
           // finaliza comprobacion en el primer numero
           
           // Comprobacion de caracteres,signos y numeros en el segundo numero 
           String number_2;
               do{
               System.out.println("numero 2 por favor");
               number_2=input.nextLine();
               }while(!number_2.matches("[+-]?[eqwryuiopsdafghjklñxczvnbm]*[.]?[01234567891]+"));
            double nume2=Double.parseDouble(number_2);
            double n2=new Double(nume2);
            // finaliza comprobacion en el primer numero
            
            // ejecucion de las operacion
            do{
                comprobar=true;
                switch(operacion){
                    case "+":
                        res=n1+n2;
                        System.out.println(res+" Respuesta Suma");
                        break;
                    case "-":
                        res=n1-n2;
                        System.out.println(res+" Respuesta resta");
                        break;
                    case "x":
                        case"X":
                            res=n1*n2;
                            System.out.println(res+" Respuesta multiplicacion");
                            break;
                    case "/":
                        // validacion del denominador si es igual a 0 se le pedira que lo cambie
                            while(n2==0){
                            do{
                                System.err.println("En el denominador se encontro un 0 cambielo por otro numero");
                                number_2=input.nextLine();
                            }while(!number_2.matches("[+-]?[qwertyuiolpsadhfgjkñxczvnbm]*[.]?[0123456789]+"));
                            nume2=Double.parseDouble(number_2);
                            n2= new Double(number_2);
                            }
                            res=n1/n2;
                            System.out.println(res+" Respuesta division");
                            break;
                    case "*":
                        // eleveacion o potencia como lo entienda mejor
                            res= Math.pow(n1,n2);
                            System.out.println(res+" Respuesta elevacion");
                            break;
                    case"%":// validacion del denominador si es igual a 0 se le pedira que lo cambie
                            while(n2==0){
                            do{
                                System.err.println("En el denominador se encontro un 0 cambielo por otro numero");
                                number_2=input.nextLine();
                            }while(!number_2.matches("[+-]?[qwertyuiolpsadhfgjkñxczvnbm]*[.]?[0123456789]+"));
                            nume2=Double.parseDouble(number_2);
                            n2= new Double(number_2);
                            }
                            res=n1%n2;
                            System.out.println(res + " Respuesta Porcentaje");
                            break;
                }
            }while(comprobar!=true);
           

   }
}
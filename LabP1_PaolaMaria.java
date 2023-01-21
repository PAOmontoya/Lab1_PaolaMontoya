/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.labp1_paolamaria;
import java.util.Scanner;
/**
 *
 * @author telip
 */
public class LabP1_PaolaMaria {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int opcion =0;
       
       while(opcion != 4){
           System.out.println("~~~~~~MENU~~~~~~");
           System.out.println("1 Socios");
           System.out.println("2 Determinar mayor");
           System.out.println("3 Triangulo o no");
           System.out.println("4 Cerrar Menu");
           
           opcion= leer.nextInt();
           
           if(opcion==1){  //SOCIOS
               
               int grado, repetir=1;
        float descuento = 0;
        
        while(repetir==1){
            
            System.out.println("Ingrese el grado del socio:");
            grado=leer.nextByte();
            
            System.out.println("Ingrese el total de su compra:");
            float total=leer.nextFloat();
            
            if (grado==1){
                descuento=total*0.10f;
            }else if(grado==2){
                descuento=total*0.15f;
            }else if(grado==3){
                descuento=total*0.25f;
            }else if(grado==0){
                
            }else{
                System.out.println("Esa opcion no es valida");
            }
            
            total=total-descuento;
            
            System.out.println("Total a pagar por el cliente: "+total);
            System.out.println("Desea calcular el total a pagar de otro cliente? [1:s / 0:n]");
            repetir=leer.nextByte();
            
        }
                      
               
           }else if(opcion==2){   //DETERMINAR MAYOR
               /*
               Por alguna razon no funsiona con numeros de tres dijitos :,)
               */
               
                int otra=1, num, numMayor=0;
        
        while(otra==1){
            System.out.println("Ingrese un numero: ");
        num=leer.nextByte();
        if(num>numMayor){
            numMayor=num;
        }
        
        System.out.println("Desea ingresar otro? [1:s / 0:n]");
        otra=leer.nextByte();
        
        }
        
        System.out.println("El mayor numero ingresado fue el: "+numMayor);
               
               
               
               
           }else if(opcion==3){
               //TRIANGULO O NO
               
               int again=1;
        
       double ladoA, ladoB, ladoC;
       
       while (again==1){
           System.out.println("Ingrese lado A:");
       ladoA=leer.nextByte();
       
       System.out.println("Ingrese lado B:");
       ladoB= leer.nextByte();
       
       System.out.println("Ingrese lado C:");
       ladoC= leer.nextByte();
       
       if((ladoA+ladoB)>ladoC){
           System.out.println("Los lados ingresados SI forman un triangulo.");
       }else{
           System.out.println("Los lados ingresados NO forman un triangulo.");
       }
       
       System.out.println("Desea ingresar otras longitudas?");
       again= leer.nextByte();
       }
               
               
               
           }else if(opcion==4){
               
               System.out.println("Bye");
           }else {
               System.out.println("la opcion ingresada no es valida");
           }
           
           
           
           
       }
        
    }
}

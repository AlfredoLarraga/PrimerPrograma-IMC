/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spplarraga;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPLarraga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        // Paso 1. Declaración de variables (Identificadores)
        double w, l, imc;
        String eIMC;
        //En la siguiente línea, le digo a Java que utilizaré
        //un teclado
        Scanner teclado = new Scanner (System.in);
        //Paso 2. Asignar valores a las variables.
        System.out.println("Introduce el peso");
        w=teclado.nextDouble();
        System.out.println("Introduce la estatura");
        l=teclado.nextDouble();
        //Paso 3. Resolver el problema.
        imc= w / Math.pow (l,2);
        //Paso 3.1 Evaluamos IMC.
        if (imc>25){
            eIMC="sobrepeso";
        }else if(imc<19){
            eIMC="Desnutrición";
        }else{
            eIMC="Normal";
        }
        //Paso4. Mostrar el resultado.
        System.out.println("Peso="+w);
        System.out.println ("Estatura="+l);
        System.out.println("IMC="+imc);
        System.out.println(eIMC);
    }
    
}

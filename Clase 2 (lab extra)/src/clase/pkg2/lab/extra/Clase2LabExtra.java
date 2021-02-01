package clase.pkg2.lab.extra;

import java.util.Scanner;

public class Clase2LabExtra {

   
    public static void main(String[] args) { 
        //UN ESCANER PARA CADENAS
        Scanner scanner=new Scanner(System.in);
        //UN ESCANER PARA MAS DATOS
        Scanner numeros=new Scanner(System.in);
        boolean finish = false;
        while(!finish) {
                 saludar();
                 System.out.print("¿Repetir? (y/n): ");
                 String op;
                 op=scanner.nextLine();
                 if(op=="Y") {   // Si el usuario no pide repetir
                           finish = false;
                 }
        }
      
    }
    //DECLARAR METODO
    public static void saludar(){
        System.out.println("Hola Alumnos");
        System.out.println("Bienvenidos al Laboratorio extra");
        System.out.println("¿Estan entendiendo?");
        System.out.println("-------------------------------");
    }
}

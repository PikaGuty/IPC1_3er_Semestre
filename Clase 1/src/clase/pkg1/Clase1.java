package clase.pkg1;

//IMPORTAR LIBRERIAS
import java.util.Scanner;

public class Clase1 {
 
    public static void main(String[] args) {
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);

    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);

    //DECLARACIÓN DE VARIABLES
       boolean valor;
       int entero;
       double decimal;
       char caracter;
       String cadenas;
       
       //VARIABLES BOOLEAN
       valor=true;
       valor=false;
       
       //VARIABLES CHAR
       caracter='A';
       caracter=65;
       
       //VARIABLES INT
       entero=1000;
       entero=-1000;
       
       //VARIABLES DOUBLE
       decimal=100.25;
       decimal=-100.25;
       
       //VARIABLE STRING
       cadenas="HOLA MUNDO:>";
       
       //MOSTRAR EN CONSOLA sout + tab
       //System.out.println(cadenas);
       
       //CONCATENAR VARIABLES
        /*System.out.println(cadenas+" "+entero);
        System.out.println(decimal+entero);*/
        
        //OBTENER TEXTO DEL TECLADO
        /*System.out.println("BIENVENIDO AL LABORATORIO DE IPC1 ");
        System.out.println("INGRESE SU NOMBRE ");
        cadenas=texto.nextLine();
        System.out.println("Ingrese su edad");
        enetero=numeros.nextLine();
        System.out.println("¿Cual es su nota de laboratorio? - ");
        decimal=numeros.nextLine();
        
         System.out.println("--RESUMEN DE LOS DATOS --");
        System.out.println("Nombre: "+cadenas);
        System.out.println("Edad: "+entero);
        System.out.println("Nota: "+decimal);
        System.out.println("------------------------------");
        
        //SENTENCIA IF
        if(decimal>=60){
            System.out.println("Felicidades ganaste laboratorio");
        }else if(decimal>57){
            System.out.println("Te quedaste por poquito");
        }else{
            System.out.println("F, echale ganas");
        }
        */
        
        //SENTENCIA SWITCH
       /* System.out.println("INGRESE UN NUMERO DE 1 AL 7");
        entero=numeros.nextInt();
        
        switch(entero){
            case 1:
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miercoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sábado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
            default:
                System.out.println("No es ningun dia de la semana");
                break;
            
        }
       */
        //SENTENCIA BUCLE WHILE
        /*int limite=10;
        while(limite>0){
            System.out.println(limite+"Dentro del while");
            limite-=1;
        }
        System.out.println("Fuera del while");
       */
        
        //Sentencia Bucle do while
        /*int opcion;
        do{
            System.out.println("---Menú---");
            System.out.println("1. Mensaje 1");
            System.out.println("2. Mensaje 2");
            System.out.println("3. Mensaje 3");
            System.out.println("4. Mensaje 4");
            System.out.println("Escoger una opción");
            opcion=numeros.nextInt();
        }while(opcion!=4);
        */
            System.out.println("TABLAS DE MULTIPLICAR");
            int numero;
            System.out.print("Ingrese el numero base: ");
            numero=numeros.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+"x"+i+"="+(numero*i));
            
        }
    }
    
}

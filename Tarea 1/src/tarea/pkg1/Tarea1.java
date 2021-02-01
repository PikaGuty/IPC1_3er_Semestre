package tarea.pkg1;
import java.awt.HeadlessException;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);
    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);
//*****************************************************MENÚ************************************************************
    int opcion=0,bool,a=0;
    boolean bo=false;
    do{
        System.out.println("************MENÚ************");
        System.out.println("1. Verificación de número");
        System.out.println("2. Potenciación");
        System.out.println("3. Numeros Primos");
        System.out.println("4. Calculadora Básica");
        System.out.println("5. Salir");
       
        do{
            try{
                System.out.println("Escoge una opción");
                opcion=numeros.nextInt();
                bo=true;
            }catch(Exception e){
                System.out.println("***************************************");
                System.out.println("**** DEBE INGRESAR NÚMEROS DEL MENÚ****");
                System.out.println("***************************************");
                //System.out.println("Escoge una opción");
                //opcion=numeros.nextInt();
                numeros.nextLine();
                bo=false;            
            }
        }while(bo==false);
         
        
        
        
//*************************************************SELECCIÓN DE OPCIONES***********************************************
        switch (opcion) {
            case 1:
                op1();
                break;
            case 2:
                op2();
                break;
            case 3:
                op3();
                break;
            case 4:
                op4();
                break;
            case 5:
               
                System.out.println("────────────██████████──████────");
                System.out.println("────────████▒▒░░░░░░░░██▒▒░░██──                                        ██");
                System.out.println("──────██▒▒░░░░██░░██░░░░██░░░░██                                      █    ");
                System.out.println("────██▒▒░░░░░░██░░██░░░░░░▒▒░░██    ░█████╗░██████╗░██╗░█████╗░░██████╗");
                System.out.println("────██░░░░░░░░██░░██░░░░░░▒▒▒▒██    ██╔══██╗██╔══██╗██║██╔══██╗██╔════╝");
                System.out.println("──██░░░░░░▒▒▒▒░░░░░░▒▒▒▒░░░░▒▒██    ███████║██║░░██║██║██║░░██║╚█████╗░");
                System.out.println("██▒▒░░░░░░░░░░░░██░░░░░░░░░░░░██    ██╔══██║██║░░██║██║██║░░██║░╚═══██╗");
                System.out.println("██░░░░▒▒░░░░░░░░██░░░░░░░░░░▒▒██    ██╔══██║██║░░██║██║██║░░██║░╚═══██╗");
                System.out.println("██░░░░▒▒░░░░░░░░░░░░░░░░░░░░██──    ██║░░██║██████╔╝██║╚█████╔╝██████╔");
                System.out.println("──██████░░░░░░░░░░░░░░░░░░▒▒██──");
                System.out.println("██▒▒▒▒▒▒██░░░░░░░░░░░░░░░░▒▒██──");
                System.out.println("██▒▒▒▒▒▒▒▒██░░░░░░░░░░░░▒▒██────");
                System.out.println("██▒▒▒▒▒▒▒▒██░░░░░░░░░░▒▒████────");
                System.out.println("──██▒▒▒▒▒▒▒▒██▒▒▒▒▒▒████▒▒▒▒██──");
                System.out.println("────██▒▒▒▒██████████▒▒▒▒▒▒▒▒▒▒██");
                System.out.println("──────██████──────████████████──﻿");
                
                break;
            default:
                System.out.println("");
                int limite=200;
                //limpiar
                while(limite>0){
                    System.out.println("");
                    limite-=1;
                }   
                System.out.println("*************************************************");
                System.out.println("* Número incorrecto, ingrese un número del menú *");
                System.out.println("*************************************************");
                break;
        }      
    }while(opcion!=5);
            
    }
//***************************************************SUBPROGRAMAS*********************************************************
//
//***************************************************PROGRAMA #1**********************************************************
    public static void op1(){
        //UN ESCANER PARA CADENAS
        Scanner texto=new Scanner(System.in);
        //UN ESCANER PARA MAS DATOS
        Scanner numeros=new Scanner(System.in);
        
        //PROGRAMA
        int bool=0, limite=200;
        double num=0;
        boolean bo=false;
        do{
            //LIMPIAR
            while(limite>0){
                System.out.println("");
                limite-=1;
            }
            System.out.println("********************************");
            System.out.println("**** VERIFICACIÓN DE NÚMERO ****");
            System.out.println("********************************");
            System.out.println("");
            
            do{
                try{
                    System.out.println("Ingrese el número a evaluar: ");
                    num=numeros.nextDouble();
                    bo=true;
                }catch(Exception e){
                    System.out.println("*****************************************");
                    System.out.println("**** DEBE INGRESAR NÚMEROS NO LETRAS ****");
                    System.out.println("*****************************************");
                    numeros.nextLine();
                    bo=false;            
                }
            }while(bo==false);
            
            
            double res=num%2;
            if(res==0){
                System.out.println("El número evaluado "+num+" es par");
            }else{
                System.out.println("El número evaluado "+num+" es impar");
            }
            //******todo bien
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//****************************************************************************************************************************************************
        }while(bool==0);
        //LIMPIAR
        limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    }
    
//
//***************************************************PROGRAMA #2**********************************************************
    public static void op2(){
        //UN ESCANER PARA CADENAS
        Scanner texto=new Scanner(System.in);
        //UN ESCANER PARA MAS DATOS
        Scanner numeros=new Scanner(System.in);
        
        
        //PROGRAMA
        int base=0,exp=0,res=1,lim=1,limite,bool=0;
        boolean bo=false;
        do{
             //LIMPIAR
            limite=200;
            while(limite>0){
                System.out.println("");
                limite-=1;
                        
            }
            System.out.println("********************************");
            System.out.println("********* POTENCIACIÓN *********");
            System.out.println("********************************");
            System.out.println("");
            
            do{
                try{
                    System.out.println("Ingrese la base: ");
                    base=numeros.nextInt();
                    bo=true;
                }catch(Exception e){
                    System.out.println("******************************************");
                    System.out.println("**** DEBE INGRESAR UN NUMERO POSITIVO ****");
                    System.out.println("******************************************");
                    numeros.nextLine();
                    bo=false;            
                }
            }while(bo==false);
            
           // ********************************POR SI INGRESA BASE NEGATIVA **************************************
           bo=false; 
           while (base<0){
                limite=150;
                while(limite>0){
                    System.out.println("");
                    limite-=1;       
                }
                System.out.println("*************************************************");
                System.out.println("* Número incorrecto, ingrese un numero positivo *");
                System.out.println("*************************************************");
                System.out.println("");
                do{
                try{
                    System.out.println("Ingrese la base: ");
                    base=numeros.nextInt();
                    bo=true;
                }catch(Exception e){
                    System.out.println("******************************************");
                    System.out.println("**** DEBE INGRESAR UN NUMERO POSITIVO ****");
                    System.out.println("******************************************");
                    numeros.nextLine();
                    bo=false;            
                }
                }while(bo==false);
            }
            //***************************************************************************************************
            
            do{
                try{
                    System.out.println("Ingrese el exponente: ");
                    exp=numeros.nextInt();
                    bo=true;
                }catch(Exception e){
                    System.out.println("******************************************");
                    System.out.println("**** DEBE INGRESAR UN NUMERO POSITIVO ****");
                    System.out.println("******************************************");
                    numeros.nextLine();
                    bo=false;            
                }
             }while(bo==false);
            
            // ********************************POR SI INGRESA EXPONENTE NEGATIVO **************************************
            while (exp<0){
                limite=150;
                while(limite>0){
                    System.out.println("");
                    limite-=1;       
                }
                System.out.println("*************************************************");
                System.out.println("* Número incorrecto, ingrese un numero positivo *");
                System.out.println("*************************************************");
                System.out.println("");
                                
                do{
                try{
                    System.out.println("Ingrese el exponente: ");
                    exp=numeros.nextInt();
                    bo=true;
                }catch(Exception e){
                    System.out.println("******************************************");
                    System.out.println("**** DEBE INGRESAR UN NUMERO POSITIVO ****");
                    System.out.println("******************************************");
                    numeros.nextLine();
                    bo=false;            
                    }
                }while(bo==false);
            }
            //***************************************************************************************************
            
            System.out.println("******* TABLA DE POTENCIACIÓN *******");
            while(lim<=exp){
                res=res*base;
                System.out.println(base+"^"+lim+"="+res);
                lim=++lim;
            }
            res=1;
            lim=1;
            
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//****************************************************************************************************************************************************

        }while(bool==0);
        
        //LIMPIAR
        limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    }
//
//***************************************************PROGRAMA #3**********************************************************
    public static void op3(){
        //UN ESCANER PARA CADENAS
        Scanner texto=new Scanner(System.in);
        //UN ESCANER PARA MAS DATOS
        Scanner numeros=new Scanner(System.in);
        
        //PROGRAMA
        int num1,num2,bool=0, limite=200,n;
        boolean bo;
        do{
            //LIMPIAR
            while(limite>0){
                System.out.println("");
                limite-=1;
            }
            System.out.println("************************");
            System.out.println("**** NÚMEROS PRIMOS ****");
            System.out.println("************************");
            System.out.println("");
            System.out.println("Ingrese el inicio del rango a evaluar: ");
            num1=numeros.nextInt();
            System.out.println("Ingrese el fin del rango a evaluar: ");
            num2=numeros.nextInt();
            n=num1;
            int contador = 1,r,c=0;
            int primos=0;
            while(num1<=num2){
                if (num1==1) {
                    primos--;
                }
                while(contador<=num1){
                    r=num1%contador;
                    if (r==0) {
                        c++;
                    }
                    contador++;
                } 
                if (c<=2) {
                    primos++;
                }
                num1++;
                contador=1;
                c=0;
            }
            System.out.println("Números primos entre "+n+" y "+num2+" son: "+primos+" números");
            
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//**************************************************************************************************************************************               
        }while(bool==0);
        
        //LIMPIAR
        limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    }
//
//***************************************************PROGRAMA #4**********************************************************
    public static void op4(){
         //UN ESCANER PARA CADENAS
        Scanner texto=new Scanner(System.in);
        //UN ESCANER PARA MAS DATOS
        Scanner numeros=new Scanner(System.in);
        
        //PROGRAMA
        int num1,num2,bool=0, limite=200,opcion;
        do{
            //LIMPIAR
            while(limite>0){
                System.out.println("");
                limite-=1;
            }

            
            
            do{
                System.out.println("****************************");
                System.out.println("**** CALCULADORA BÁSICA ****");
                System.out.println("****************************");
                System.out.println("************MENÚ************");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Regresar al menú principal");
                System.out.println("Escoge una opción");
                opcion=numeros.nextInt();
//*************************************************SELECCIÓN DE OPCIONES***********************************************
                switch (opcion) {
                    case 1:
                        sum();
                        break;
                    case 2:
                        res();
                        break;
                    case 3:
                        mul();
                        break;
                    case 4:
                        div();
                        break;
                    case 5:
                        System.out.println("Regresando al menú");
                        break;
                    default:
                        System.out.println("");
                        limite=200;
                        //limpiar
                        while(limite>0){
                            System.out.println("");
                            limite-=1;
                        }   
                        System.out.println("*************************************************");
                        System.out.println("* Número incorrecto, ingrese un número del menú *");
                        System.out.println("*************************************************");
                        break;
                }
                }while(opcion!=5);
         
        }while(bool==5);
        
        //LIMPIAR
        limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    }
//******************************************************************SUMA************************************************************************    
public static void sum(){
    double num1, num2,bool=0;
    boolean bo;
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);
    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);
    
    //LIMPIAR
        int limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    
    //PROGRAMA
    System.out.println("Ingrese el primer dígito para sumar: ");
    num1=numeros.nextDouble();
    System.out.println("Ingrese el segundo dígito para sumar: ");
    num2=numeros.nextDouble();
    
    System.out.println("La suma: "+num1+"+"+num2+"="+(num1+num2));
    System.out.println("");
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//***********************************************************************************************************************************************************
}
//********************************************************************RESTA************************************************************************
public static void res(){
    double num1, num2,bool=0;
    boolean bo= false;
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);
    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);
    
    //LIMPIAR
        int limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    
    //PROGRAMA
    System.out.println("Ingrese el primer dígito para resta: ");
    num1=numeros.nextDouble();
    System.out.println("Ingrese el segundo dígito para resta: ");
    num2=numeros.nextDouble();
    
    System.out.println("La resta: "+num1+"-"+num2+"="+(num1-num2));
    System.out.println("");
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//*****************************************************************************************************************************************************
}
//******************************************************************MULTIPLICACIÓN************************************************************************
public static void mul(){
    double num1,num2,bool=0;
    boolean bo=false;
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);
    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);
    
    //LIMPIAR
        int limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    
    //PROGRAMA
    System.out.println("Ingrese el primer dígito para multiplicar: ");
    num1=numeros.nextDouble();
    System.out.println("Ingrese el segundo dígito para multiplicar: ");
    num2=numeros.nextDouble();
    
    System.out.println("La multiplicación: "+num1+"*"+num2+"="+(num1*num2));
    System.out.println("");
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//*****************************************************************************************************************************************************
}
//******************************************************************DIVISIÓN************************************************************************
public static void div(){
    double num1, num2,bool=0;
    boolean bo=false;
    //UN ESCANER PARA CADENAS
    Scanner texto=new Scanner(System.in);
    //UN ESCANER PARA MAS DATOS
    Scanner numeros=new Scanner(System.in);
    
    //LIMPIAR
        int limite=200;
        while(limite>0){
            System.out.println("");
            limite-=1;
        }
    
    //PROGRAMA
    System.out.println("Ingrese el divisor: ");
    num1=numeros.nextDouble();
    System.out.println("Ingrese el dividendo: ");
    num2=numeros.nextDouble();
    while (num2==0){
        limite=150;
        while(limite>0){
            System.out.println("");
            limite-=1;       
        }
        System.out.println("**********************************************************");
        System.out.println("* Número incorrecto, ingrese un dividendo diferente de 0 *");
        System.out.println("**********************************************************");
        System.out.println("");
        System.out.println("Ingrese el dividendo: ");
        num2=numeros.nextDouble();    
    }
    
    
    System.out.println("La división: "+num1+"/"+num2+"="+(num1/num2));
    System.out.println("");
//*******************************************************CODIGO PARA VER SI SE REGRESA AL MENÚ**********************************************************
            boolean boo=false; 
            bo=false;
                do{
                    try{
                        System.out.println("¿Desea regresar al menú?");
                        System.out.println("SI=1     NO=0");
                        bool=numeros.nextInt();
                        bo=true;
                    }catch(Exception e){
                        System.out.println("*****************************");
                        System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                        System.out.println("*****************************");
                        numeros.nextLine();
                        bo=false;            
                    }
                }while(bo==false);
                
                bo=false;
                if(bool==0||bool==1){
                    
                }else{
                   while (bo==false){
                    //LIMPIAR
                    limite=200;
                    while(limite>0){
                        System.out.println("");
                        limite-=1;
                    }
                    System.out.println("*************************************************");
                    System.out.println("* Número incorrecto, ingrese un número del menú *");
                    System.out.println("*************************************************");
                   
                    do{
                        try{
                            System.out.println("¿Desea regresar al menú?");
                            System.out.println("SI=1     NO=0");
                            bool=numeros.nextInt();
                            bo=true;
                        }catch(Exception e){
                            System.out.println("*****************************");
                            System.out.println("**** DEBE INGRESAR 0 O 1 ****");
                            System.out.println("*****************************");
                            numeros.nextLine();
                            bo=false;            
                        }
                    }while(bo==false);
                    
                    
                    System.out.println(bool);
                    if(bool==0||bool==1){
                        boo=true;
                    }else{
                        boo=false;
                    }
                   } 
                }
//***********************************************************************************************************************************************************
}
    
}

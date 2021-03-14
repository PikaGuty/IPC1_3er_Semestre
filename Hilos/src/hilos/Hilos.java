package hilos;
public class Hilos {
    public static void main(String[] args) {
        //Forma de declararlo al herdar de la clase Thread
        Proceso1 hilo1 = new Proceso1();
        
        //Forma de declararlo al implemantar la Interfaz Runnable
        Thread hilo2 = new Thread(new Proceso2());
        
        /*Se deben iniciar los hilos de lo contrario no arrancaran y colocarlos 
        despues de haber declarado los hilos a utilizar de lo contrario no 
        servira utilizar hilos ya que se ejecutaria como un procedimiento normal
        (de forma lineal)*/
        hilo1.start();
        hilo2.start();
    }
    
}

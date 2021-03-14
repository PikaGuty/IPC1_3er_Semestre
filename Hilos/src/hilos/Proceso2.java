package hilos;
//UTILIZANDO EL SEGUNDO MÉTODO
/*Se implementa Interfaz Runnable*/
public class Proceso2 implements Runnable{
    //Se sobreescribe el metodo run que herdó
    @Override
    //Se coloca el proceso que queremos ejecutar
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Proceso 2");
        }
    }
}

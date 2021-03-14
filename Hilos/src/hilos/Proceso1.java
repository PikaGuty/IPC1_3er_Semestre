package hilos;
//UTILIZANDO EL PRIMER MÉTODO
/*Se hereda de la clase Thread la cual ya viene implementada*/
public class Proceso1 extends Thread{
    //Se sobreescribe el metodo run que herdó
    @Override
    //Se coloca el proceso que queremos ejecutar
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Proceso 1");
        }
    }
}

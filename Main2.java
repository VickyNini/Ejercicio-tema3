public class Main2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche ();
        miCoche.sumaPuertas();
        System.out.print(miCoche.puertas);
    }

}
class Coche {
    public int puertas = 0;
    public void sumaPuertas(){
        this.puertas++;
    }
}
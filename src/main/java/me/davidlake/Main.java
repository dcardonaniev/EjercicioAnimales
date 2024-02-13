package me.davidlake;

public class Main {
    public static void main(String[] args) {
        Perro pruebaPerro = new Perro("Perrito");
        Vaca pruebaVaca = new Vaca("Baki");
        Gato pruebaGato = new Gato("Sparkle");

        System.out.println("====================== SONIDOS ======================");
        pruebaPerro.emitirSonido();
        pruebaVaca.emitirSonido();
        pruebaGato.emitirSonido();

        System.out.println("====================== COMIDA ======================");
        pruebaVaca.comerHierba();
        pruebaGato.comerCarne();
        pruebaPerro.comerCarne();
        pruebaGato.comerAnimal(pruebaPerro);
    }
}
package me.davidlake;

public class Gato extends Animal implements ICarnivoros {
    public Gato(String nombre) {
        super(nombre);
        this.tipo = "carnivoro";
    }

    @Override
    public void emitirSonido() {
        System.out.println("*Sonido de gato maullando*");
    }

    @Override
    public void comerCarne() {
        System.out.println("*Sonido de gato comiendo carne*");
    }

    public void comerAnimal(Animal animal){
        System.out.printf("*Sonido de gato comiendo un %s*\n", animal.nombre);
    }
}
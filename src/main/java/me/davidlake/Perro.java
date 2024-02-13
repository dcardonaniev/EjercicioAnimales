package me.davidlake;

public class Perro extends Animal implements ICarnivoros {
    public Perro(String nombre) {
        super(nombre);
        this.tipo = "carnivoro";
    }

    @Override
    public void emitirSonido() {
        System.out.println("*Sonido de perro ladrando*");
    }

    @Override
    public void comerCarne() {
        System.out.println("*Sonido de perro comiendo carne*");
    }
}
package me.davidlake;

public class Vaca extends Animal implements IHervivoros {
    public Vaca(String nombre) {
        super(nombre);
        this.tipo = "hervivoro";
    }

    @Override
    public void emitirSonido() {
        System.out.println("*Sonido de vaca haciendo muu*");
    }

    @Override
    public void comerHierba() {
        System.out.println("*Sonido de vaca comiendo hierva*");
    }
}


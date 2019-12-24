package Patos;

public class patoSilvestre extends Pato implements Cuackable, Swimable, Flyable{
    @Override
    public void doCuack() {
        System.out.println("GRAZNIDO PATO SILVESTRE");
    }

    @Override
    public void doFly() {
        System.out.println("VOLANDO DESDE EL PATO SILVESTRE");
    }

    @Override
    public void doSwim() {
        System.out.println("NADANDO DESDE EL PATO SILVESTRE");
    }


}

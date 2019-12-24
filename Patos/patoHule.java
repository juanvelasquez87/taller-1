package Patos;

public class patoHule extends Pato implements Cuackable, Swimable {
    @Override
    public void doCuack() {
        System.out.println("GRAZNIDO DEL PATO DE HULE");
    }

    @Override
    public void doSwim() {
        System.out.println("NADADNDO DESDE UN PATO DE HULE");
    }
}

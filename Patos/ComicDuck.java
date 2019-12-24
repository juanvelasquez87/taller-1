package Patos;

public abstract class ComicDuck extends Pato implements Flyable {

    public abstract void doPow();
    public void doZap(){
        System.out.println("Zaaaap!!!");
    }
}

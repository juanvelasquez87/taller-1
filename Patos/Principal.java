package Patos;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        patoSilvestre lucas = new patoSilvestre();
        patoSilvestre donald = new patoSilvestre();
        patoSilvestre patula = new patoSilvestre();
        patoHierro silverDuck = new patoHierro();
        patoHierro greyDuck = new patoHierro();
        patoHierro ironDuck = new patoHierro();
        patoHule duckGoom = new patoHule();
        patoHule yellowDuck = new patoHule();
        patoHule ducky = new patoHule();
        patoMadera duckHood = new patoMadera();
        patoMadera treeDuck = new patoMadera();
        patoMadera forestDuck = new patoMadera();
        WarnerDuck duffyDuck = new WarnerDuck();

        ComicDuck DuffyDuck = new WarnerDuck();

        DuffyDuck.doFly();
        DuffyDuck.doPow();

        ArrayList<Pato> allDuck = new ArrayList<>();
        allDuck.add(ironDuck);
        allDuck.add(lucas);
        allDuck.add(donald);
        allDuck.add(patula);
        allDuck.add(silverDuck);
        allDuck.add(greyDuck);
        allDuck.add(duckGoom);
        allDuck.add(yellowDuck);
        allDuck.add(ducky);
        allDuck.add(duckHood);
        allDuck.add(treeDuck);
        allDuck.add(forestDuck);
        allDuck.add(duffyDuck);

        for (Pato pato:allDuck
             ) {
            System.out.println(pato);

        }
        ArrayList<Swimable> swimDuck = new ArrayList<>();
        swimDuck.add(lucas);
        swimDuck.add(donald);
        swimDuck.add(patula);
        swimDuck.add(duckGoom);
        swimDuck.add(ducky);
        swimDuck.add(yellowDuck);
        swimDuck.add(duckHood);
        swimDuck.add(treeDuck);
        swimDuck.add(forestDuck);

        for (Swimable pato: swimDuck
             ) {
            pato.doSwim();

        }

        ArrayList<Cuackable> CuackDuck = new ArrayList<>();
        CuackDuck.add(lucas);
        CuackDuck.add(donald);
        CuackDuck.add(patula);
        CuackDuck.add(duckGoom);
        CuackDuck.add(yellowDuck);
        CuackDuck.add(ducky);

        for (Cuackable pato: CuackDuck
             ) {
            pato.doCuack();
        }

        ArrayList<Flyable> flyDuck = new ArrayList<>();
        flyDuck.add(lucas);
        flyDuck.add(donald);
        flyDuck.add(patula);
        flyDuck.add(duffyDuck);

        for (Flyable pato: flyDuck
             ) {
            pato.doFly();
        }

    }
}

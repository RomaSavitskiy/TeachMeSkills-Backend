package com.mycompany.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        TreeDecorator firstTree = new ChristmasTree();
        System.out.println(firstTree.decorate());

        TreeDecorator secondTree = new StarTreeDecorator(new ChristmasTree());
        System.out.println(secondTree.decorate());

        TreeDecorator thirdTree = new StarTreeDecorator(new ToysTreeDecorator(new ChristmasTree()));
        System.out.println(thirdTree.decorate());

        TreeDecorator firstCactus = new StarTreeDecorator(new Cactus());
        System.out.println(firstCactus.decorate());

        TreeDecorator secondCactus = new CactusBestTreeDecorator(new Cactus());
        System.out.println(secondCactus.decorate());
    }
}

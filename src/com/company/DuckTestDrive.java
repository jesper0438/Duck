package com.company;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        ModelDuck duck1 = new ModelDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Duck says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck Says...");
        testDuck(duck);
        testDuck(duck1);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

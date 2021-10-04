public class Homework {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Cat fil = new Cat("Fil");
        Dog bobik = new Dog("Bobik");
        Dog tuzik = new Dog("Tuzik");
        Dog sharik = new Dog("Sharik");
        Animal Vasy = new Animal("Vasy");


        barsik.run(200);
        barsik.swim(100);
        fil.run(250);
        fil.swim(50);

        bobik.run(200);
        bobik.swim(10);
        tuzik.run(600);
        sharik.swim(500);


        Vasy.run(100);
        Vasy.swim(100);
        System.out.println();

        System.out.println("Всего животных: "+Animal.animalCount);
        System.out.println("Собак: "+Dog.dogCount);
        System.out.println("Котов: "+Cat.catCount);

    }
}

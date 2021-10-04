public class Cat extends Animal {
    static int catCount;

    {
        catCount+=1;
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            System.out.println("Кот " + name + " пробежал " + distance + " м");
        } else {
            System.out.println("Кот " + name + " столько не сможет пробежать ");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать ");
    }
}

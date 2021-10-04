public class Dog extends Animal {
    static int dogCount;

    {
        dogCount+=1;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            System.out.println("Собака " + name + " пробежала " + distance + " м");
        } else {
            System.out.println("Собака " + name + " столько не сможет пробежать ");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            System.out.println("Собака " + name + " проплыла " + distance + " м");
        } else {
            System.out.println("Собака " + name + " столько не проплывёт ");
        }
    }
}

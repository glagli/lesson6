public class Animal {
    String name;
    int distance;
    static int animalCount;

    {
        animalCount+=1;
    }

    public Animal(String name){
        this.name = name;

    }

    public void run(int distance){
        this.distance = distance;
        System.out.println("Животное "+name+" пробежало " + distance+" м");
    }
    public void swim(int distance){
        this.distance = distance;
        System.out.println("Животное "+name+" проплыло " + distance+" м");
    }



}

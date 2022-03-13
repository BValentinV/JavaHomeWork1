package Lesson6;

public abstract class Animal {


    private int runMaxDistance;
    private int swimMaxDistance;

    public Animal(int runMaxDistance, int swimMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
    }

    public void run(int runDistance) {
        System.out.println("run: " + (runDistance >= runMaxDistance));
    }
    public void swim(int swimDistance) {
        System.out.println("swim: " + (swimDistance >= swimMaxDistance));
    }

}

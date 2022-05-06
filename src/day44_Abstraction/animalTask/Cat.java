package day44_Abstraction.animalTask;

import day44_Abstraction.animalTask.Animal;

public final class Cat extends Animal implements Playable {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    public void meaw(){
        System.out.println(getName()+" is meawing");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}

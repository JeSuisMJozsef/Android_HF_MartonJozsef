package com.example.myrecycleviewcardview;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animal implements Serializable {
    private String name;
    private String info;
    private int age;
    private int mThumbnailDrawable;


    public Animal(String name, String info, int age, int mThumbnailDrawable) {
        this.name = name;
        this.info = info;
        this.age = age;
        this.mThumbnailDrawable = mThumbnailDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public int getAge() {
        return age;
    }

    public int getmThumbnailDrawable() {
        return mThumbnailDrawable;
    }
    public static List<Animal> getAnimals(){
        List<Animal> animals= new ArrayList<>();
        animals.add(new Animal("Cat","Great for jumpers",3,R.drawable.cat));
        animals.add(new Animal("Pig","Delicious in rolls",1,R.drawable.pig));
        animals.add(new Animal("Dog","Man`s best friend",5,R.drawable.dog));
        animals.add(new Animal("Giraffe","Has a long neck",12,R.drawable.giraffe));
        animals.add(new Animal("Horse","Adapted to run",8,R.drawable.horse));
        animals.add(new Animal("Lion","King of the wild",14,R.drawable.lion));
        animals.add(new Animal("Octopus","8 tentacled monster",16,R.drawable.octopus));
        animals.add(new Animal("Rabbit","Great for shoes",2,R.drawable.rabbit));
        animals.add(new Animal("Sheep","Nice in a stew",4,R.drawable.sheep));
        return animals;

    }
}

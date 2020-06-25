package ru.pamishenko.homework1;
import java.util.ArrayList;
import java.util.List;   //kkk

public class  Box<T extends Fruit> {
    List<T> box;
    float weightBox;

    public Box() {
        box = new ArrayList<T>();
        weightBox = 0;
    }

    public void addFruit(T someFruit){
        box.add(someFruit);
        weightBox += someFruit.getWeight();
    }

    public float getWeightBox() {
        return weightBox;
    }

    public boolean compare(Box otherBox){
        if (box.get(0).getClass() == otherBox.box.get(0).getClass()) return this.getWeightBox() == otherBox.getWeightBox();
        else {
            System.out.println("В коробках разные фрукты");
            return false;
        }
    }

    public void swapBox(Box<T> newBox){
        newBox.box.addAll(this.box);
        this.box.removeAll(box);
        newBox.weightBox = this.weightBox;
        this.weightBox = 0;
    }


}

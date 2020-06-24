package ru.pamishenko.homework1;

public class Apple implements WeightReturning{
    float weight = 1.0f;

    public Apple() {
        this.weight = weight;
    }


    @Override
    public float getWeight() {
        return weight;
    }
}

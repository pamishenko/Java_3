package ru.pamishenko.homework1;

public class Solution3 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> someFruit = new Box<>();

        for (int i = 0; i < 5; i++) {
            appleBox.addFruit(new Apple());
        }

        for (int i = 0; i < 14; i++) {
            orangeBox.addFruit(new Orange());
        }

        System.out.println("AppleBox: " + appleBox.getWeightBox());
        System.out.println("OrangeBox: " + orangeBox.getWeightBox());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.swapBox(someFruit);
        System.out.println(appleBox.getWeightBox());
        System.out.println(someFruit.getWeightBox());

    }
}

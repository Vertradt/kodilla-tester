package com.kodilla.collections.interfaces.homework;

public class Ford  implements Car {

    public int speed;

//    public Ford(int speed){
//        this.speed = speed;
//    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }
}

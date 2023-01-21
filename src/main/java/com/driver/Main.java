package com.driver;

public class Main {
    public static void main(String[] args) {

        F1 f1 = new F1("BMW", false);

        assert f1.getName() == "BMW";

        assert !f1.isManual();
        System.out.println(f1.getName());
        System.out.println(f1.isManual());
        f1.accelerate(0);

        assert f1.getCurrentSpeed() == 0;

        assert f1.getCurrentGear() == 1;

        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(50);

        assert f1.getCurrentSpeed() == 50;

        assert f1.getCurrentGear() == 1;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(25);

        assert f1.getCurrentSpeed() == 75;

        assert f1.getCurrentGear() == 2;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(50);

        assert f1.getCurrentSpeed() == 125;

        assert f1.getCurrentGear() == 3;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(26);

        assert f1.getCurrentSpeed() == 151;

        assert f1.getCurrentGear() == 4;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(99);

        assert f1.getCurrentSpeed() == 250;

        assert f1.getCurrentGear() == 5;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        f1.accelerate(1);

        assert f1.getCurrentSpeed() == 251;

        assert f1.getCurrentGear() == 6;
        System.out.println(f1.getCurrentGear());
        System.out.println(f1.getCurrentSpeed());

        assert f1.getCurrentDirection() == 0;
    }
}
package com.syntax.class25;

public interface Healthy {
    void healthy();

}
interface Portable{
    void canCarry();
}
interface Eatable{
    void eat();
}
class Orange implements Healthy,Portable,Eatable{

    @Override
    public void healthy() {
        System.out.println("Orange is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.println("We can carry orange easily");
    }

    @Override
    public void eat() {
        System.out.println("We can eat orange");
    }
}
class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("we can carry a laptop easily");
    }
}

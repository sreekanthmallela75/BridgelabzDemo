package com.annotations;

class Animal{
    public void print(){
        System.out.println("This is Animal");
    }
}//annotations are meta data for our source code.
class Dog extends Animal{
    @Override
    public void print(){
        System.out.println("This is Dog");
    }
}
public class AnnotationsDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.print();

    }
}

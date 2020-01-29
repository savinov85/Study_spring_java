package ru.savinov.springcourse;

public class ClassicalMusic implements Music{
    public void doMyInit() {
        System.out.println("Doing my initialization");// перед
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction!!");
    }
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
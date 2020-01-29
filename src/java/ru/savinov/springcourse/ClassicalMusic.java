package ru.savinov.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){} //конструктор должен быть приватным для запрета создания объектов через new

    public static ClassicalMusic getClassicalMusic(){  //фабричный метод по созданию объектов
        return new ClassicalMusic(); //eсли у бина scope = "singleton" (по умолчанию) то объект по прежнему создастся один раз
    }
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
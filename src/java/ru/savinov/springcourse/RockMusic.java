package ru.savinov.springcourse;

import org.springframework.stereotype.Component;

@Component //по умолчанию Id бина совпадает с названием класса с маленькой буквы, но в скобках можно присвоить любой Id для бина
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
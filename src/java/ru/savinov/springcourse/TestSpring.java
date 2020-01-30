package ru.savinov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("rockMusic", Music.class);
        System.out.println(music.getSong());
        Music music2 = context.getBean("classicalMusic", Music.class);
        System.out.println(music2.getSong());
        context.close();
    }


}
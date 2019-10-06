package ru.savinov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
    );

    Music music = context.getBean("musicBean", Music.class); // Первый аргумент Id того бина который хотим получить, Второй аргумент название того класса бин которого получаем.
    MusicPlayer musicPlayer = new MusicPlayer(music);
    musicPlayer.playMusic();
    context.close();
}


}
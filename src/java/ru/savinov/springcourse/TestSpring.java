package ru.savinov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( );

        Music music = context.getBean("musicBean", Music.class); // Первый аргумент Id того бина который хотим получить, Второй аргумент название того класса бин которого получаем.
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        //  MusicPlayer musicPlayer = new MusicPlayer(music);
        //  musicPlayer.playMusic();
        System.out.println("Name " + musicPlayer.getName());
        System.out.println("Volume " + musicPlayer.getVolume());
        context.close();
    }


}
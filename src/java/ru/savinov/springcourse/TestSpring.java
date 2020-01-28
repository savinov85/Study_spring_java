package ru.savinov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class); // Первый аргумент Id того бина который хотим получить, Второй аргумент название того класса бин которого получаем.
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer); //хешкод объектов не совпадает следовательно ссылки указывают на
        System.out.println(secondMusicPlayer);  // разные участки
        System.out.println("звук проигрывателя 1: " + firstMusicPlayer.getVolume()); // значение из файла
        System.out.println("звук проигрывателя 2: " + secondMusicPlayer.getVolume()); // значение из файла

        firstMusicPlayer.setVolume("10"); // меняем звук у одной ссылки

        System.out.println("звук проигрывателя 1: " + firstMusicPlayer.getVolume());
        System.out.println("звук проигрывателя 2: " + secondMusicPlayer.getVolume());
        // звук меняется у объекта полученного по одной из ссылок следовательно объектов несколько
        // так работает scope = "prototype"
        context.close();
    }


}
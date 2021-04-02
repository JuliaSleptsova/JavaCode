package net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");
        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());
        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма: " + hp.toExternalForm());

        URLConnection url = hp.openConnection();
        long date = url.getDate();
        if (date == 0) {
            System.out.println("Сведения о дате отсутствуют");
        } else {
            System.out.println("Дата: " + new Date(date));
        }
    }
}

package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Савченко
        Document doc = Jsoup.connect("https://www.hse.ru/education/magister/").get();
        Elements magisterPrograms = doc.select(".edu-programm__magister .b-row.edu-programm__item");

        for (Element elem : magisterPrograms) {
            String text = elem.select(".link").first().ownText();
            System.out.println(text);
        }
    }
}
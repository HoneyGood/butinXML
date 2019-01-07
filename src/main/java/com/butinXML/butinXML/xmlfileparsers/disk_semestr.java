package com.butinXML.butinXML.xmlfileparsers;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class disk_semestr {
    public static void main(String[] args) {
        File xmlFile = new File("09.03.01 Информатика и ВТ набор 2017 года.plm.xml");
        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(xmlFile);
            List<Element> listKurse = document.getRootElement().getChild("План").getChild("СтрокиПлана").getChildren("Строка");
            for (Element elementStroka : listKurse) {
                List<Element> listSem = elementStroka.getChildren("Сем");
                for (Element elementSem : listSem) {
                    System.out.println("name: " + elementStroka.getAttributeValue("Дис") + " || " +
                            "Семестр: " + elementSem.getAttributeValue("Ном") + " || " +
                            "lect: " + elementSem.getAttributeValue("Лек") + " || " +
                            "pract: " + elementSem.getAttributeValue("Пр") + " || " +
                            "Лаб: " + elementSem.getAttributeValue("Лаб") + " || " +
                            "СРС: " + elementSem.getAttributeValue("СРС") + " || "+
                            "ЗЕТ: " + elementSem.getAttributeValue("ЗЕТ") + " || " );
                }

            }
        } catch (IOException | JDOMException e) {
            System.out.println(e.getMessage());
        }
    }
}

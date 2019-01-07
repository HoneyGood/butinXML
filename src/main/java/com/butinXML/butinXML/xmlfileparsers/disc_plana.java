package com.butinXML.butinXML.xmlfileparsers;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class disc_plana {
    public static void main(String[] args) {
        File xmlFile = new File("09.03.01 Информатика и ВТ набор 2017 года.plm.xml");
        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(xmlFile);
            List<Element> listPlan = document.getRootElement().getChild("План").getChild("СтрокиПлана").getChildren("Строка");
            for (Element elementStroka : listPlan) {

                System.out.println("name: " + elementStroka.getAttributeValue("Дис") + " || " +
                        "НовИдДисциплины: " + elementStroka.getAttributeValue("НовИдДисциплины") + " || " +
                        "СР: " + elementStroka.getAttributeValue("СР") + " || " +
                        "Кафедра: " + elementStroka.getAttributeValue("Кафедра") + " || " +
                        "КредитовНаДисциплину: " + elementStroka.getAttributeValue("КредитовНаДисциплину") + " || " +
                        "Контроль: " + elementStroka.getAttributeValue("ЧасовВЗЕТ") + " || ");
            }
        } catch (IOException | JDOMException e) {
            System.out.println(e.getMessage());
        }
    }
}

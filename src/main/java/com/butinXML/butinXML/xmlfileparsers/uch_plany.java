package com.butinXML.butinXML.xmlfileparsers;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class uch_plany {
    public static void main(String[] args) {
        File xmlFile = new File("09.03.01 Информатика и ВТ набор 2017 года.plm.xml");
        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(xmlFile);
            Element element = document.getRootElement().getChild("План");
            System.out.println("Форма обучения: " + element.getAttributeValue("ФормаОбучения"));
            System.out.println("Имя вуза: " + element.getChild("Титул").getAttributeValue("ИмяВуза2"));
            System.out.println("ГодНачалаПодготовки: " + element.getChild("Титул").getAttributeValue("ГодНачалаПодготовки"));

            List<Element> listSpecialitys = element.getChild("Титул").getChild("Специальности").getChildren("Специальность");
            for (Element listSpeciality : listSpecialitys) {
                System.out.println("fgos_id: " + listSpeciality.getAttributeValue("Ном") + " |||| " + "Название: " + listSpeciality.getAttributeValue("Название"));
            }
        } catch (IOException | JDOMException e) {
            System.out.println(e.getMessage());
        }

    }
}

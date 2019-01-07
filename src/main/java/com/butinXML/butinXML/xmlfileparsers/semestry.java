package com.butinXML.butinXML.xmlfileparsers;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class semestry {
    public static void main(String[] args) {
        File xmlFile = new File("09.03.01 Информатика и ВТ набор 2017 года.plm.xml");
        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(xmlFile);
            List<Element> listKurse = document.getRootElement().getChild("План").getChild("Титул").getChild("ГрафикУчПроцесса").getChildren("Курс");
            for (Element elementKurs : listKurse) {
                if (elementKurs.getAttributeValue("ООПет") != null) {
                    List<Element> listSemestr = elementKurs.getChildren("Семестр");
                    for (Element elementSemestr : listSemestr) {
                        System.out.println("Недель: " + elementSemestr.getAttributeValue("СтрНедТО")
                                + " || " + "Номер семестра:" + ((Integer.valueOf(elementKurs.getAttributeValue("Ном")) - 1) * 2 +
                                Integer.valueOf(elementSemestr.getAttributeValue("Ном"))));
                    }
                }
            }
        } catch (IOException | JDOMException e) {
            System.out.println(e.getMessage());
        }
    }
}

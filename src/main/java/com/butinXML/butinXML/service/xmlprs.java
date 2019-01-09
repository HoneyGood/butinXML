package com.butinXML.butinXML.service;

import org.jdom2.Document;
import org.jdom2.Element;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class xmlprs {
    void disc_plana(Document document) {
        List<Element> listPlan = document.getRootElement().getChild("План").getChild("СтрокиПлана").getChildren("Строка");
        for (Element elementStroka : listPlan) {
            System.out.println("name: " + elementStroka.getAttributeValue("Дис") + " || " +
                    "НовИдДисциплины: " + elementStroka.getAttributeValue("НовИдДисциплины") + " || " +
                    "СР: " + elementStroka.getAttributeValue("СР") + " || " +
                    "Кафедра: " + elementStroka.getAttributeValue("Кафедра") + " || " +
                    "КредитовНаДисциплину: " + elementStroka.getAttributeValue("КредитовНаДисциплину") + " || " +
                    "Контроль: " + elementStroka.getAttributeValue("ЧасовВЗЕТ") + " || ");
        }
        System.out.println("=================================================================================== \n");

    }
    void disk_semestr(Document document) {
        List<Element> listKurse = document.getRootElement().getChild("План").getChild("СтрокиПлана").getChildren("Строка");
        for (Element elementStroka : listKurse) {
            List<Element> listSem = elementStroka.getChildren("Сем");
            for (Element elementSem : listSem) {
                System.out.println("name: " + elementStroka.getAttributeValue("Дис") + " || " +
                        "Семестр: " + elementSem.getAttributeValue("Ном") + " || " +
                        "lect: " + elementSem.getAttributeValue("Лек") + " || " +
                        "pract: " + elementSem.getAttributeValue("Пр") + " || " +
                        "Лаб: " + elementSem.getAttributeValue("Лаб") + " || " +
                        "СРС: " + elementSem.getAttributeValue("СРС") + " || " +
                        "ЗЕТ: " + elementSem.getAttributeValue("ЗЕТ") + " || ");
            }
        }
        System.out.println("=================================================================================== \n");

    }
    void semestry(Document document) {
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
        System.out.println("=================================================================================== \n");
    }

    void uch_plany(Document document) {
        Element element = document.getRootElement().getChild("План");
        System.out.println("Форма обучения: " + element.getAttributeValue("ФормаОбучения"));
        System.out.println("Имя вуза: " + element.getChild("Титул").getAttributeValue("ИмяВуза2"));
        System.out.println("ГодНачалаПодготовки: " + element.getChild("Титул").getAttributeValue("ГодНачалаПодготовки"));

        List<Element> listSpecialitys = element.getChild("Титул").getChild("Специальности").getChildren("Специальность");
        for (Element listSpeciality : listSpecialitys) {
            System.out.println("fgos_id: " + listSpeciality.getAttributeValue("Ном") + " |||| " + "Название: " + listSpeciality.getAttributeValue("Название"));
        }
        System.out.println("=================================================================================== \n");

    }
}

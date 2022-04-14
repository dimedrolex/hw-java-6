package com.skillsup;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Library a1 = new Library();
        a1.TakeBook(LocalDate.of(2001, 10, 12), "Rig");
        a1.TakeBook(LocalDate.of(2005, 11, 23), "Hig");
        a1.TakeBook(LocalDate.of(1998, 12, 15), "Lig");
        a1.TakeBook(LocalDate.of(2015, 11, 10), "Uru");
        a1.TakeBook(LocalDate.of(2020, 10, 21), "Kar");
        System.out.println(a1.GetRegistryItem(LocalDate.of(2001, 10, 12)));
        System.out.println(a1.GetRegistryItem(LocalDate.of(2005, 11, 23)));
    }
}

class Library {

    HashMap<LocalDate, String> RegisteryBook = new HashMap<>();

    public void TakeBookInCurrentDate(String name) {
        this.RegisteryBook.put(LocalDate.now(), name);
    }

    public void TakeBook(LocalDate date, String name) {
        this.RegisteryBook.put(date, name);
    }

    public String GetRegistryItem(LocalDate date) {
        if (this.RegisteryBook.containsKey(date)) {
            return this.RegisteryBook.get(date);
        } else {
            return new String("На эту дату нет книг");
        }
    }
}

//// Каждый раз, когда вы берете книгу, она также должна быть добавлена ​​в отчет библиотеки.
//// Отчет состоит из даты (когда вы взяли книгу), названия книги. Для дат используйте LocalDate
//// Реализуйте эту структуру, используя Map.
//// Добавить функциональность для поиска на карте по датам.
//// F.E. за 20-10-19 вернет название книги. Если на эту дату нет книг - верните сообщение,
//// например, «На эту дату нет книг» (или что-то еще).
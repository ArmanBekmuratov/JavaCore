package com.ArmanBekmuratov.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phoneNum;
    String email;

    public NamePhoneEmail(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}

class  NamePhone {
    String name;
    String phoneNum;

    public NamePhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}

class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Larry","555-555", "dsad@faf.com"));
        list.add(new NamePhoneEmail("james","535-555", "dsad@faf.kz"));
        list.add(new NamePhoneEmail("Kate","5535-555", "dsad@faf.ru"));

        System.out.println("list: " );
        list.stream().forEach( (a) -> {
            System.out.println(a.name + " " + a.phoneNum + " " + a.email);
        });
        System.out.println();
        Stream<NamePhone> nameAndPhone = list.stream().map(
                (a) -> new NamePhone(a.name, a.phoneNum)
        );

        System.out.println("Список имен и номеров телефонов: " );
        nameAndPhone.forEach( (a) -> System.out.println(a.name + " " + a.phoneNum));
    }
}
package ru.netology;

import lombok.Data;


@Data
public class CardInfoForRegistration {
    private final String city;
    private final String name;
    private final String phone;

//    public CardInfoForRegistration(String city, String name, String phone) {
//        this.city = city;
//        this.name = name;
//        this.phone = phone;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }

}

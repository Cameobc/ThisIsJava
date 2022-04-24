package javaApi.toString;

import classes.Service;

import java.util.Date;

public class ToStringExample {

    /**
     * 객체의 문자 정보 리턴
     * 객체의 문자 정보
     */
    public static void main(String[] args) {
        Object obj1 = new Service();
        Date obj2 = new Date();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}

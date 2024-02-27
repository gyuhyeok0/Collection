package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application02 {

    public static void main(String[] args) {
        
        /* 수업목표. Properties 에 대해 이해하고 사용할 수 있다.
            필기.
                properties 란?
                HashMap 을 구혀야여 사용 용법이 거의 유사하지만 Key와 value 모두 문자열만
                사용할 수 있는 자료구조 이다.
                설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다. 
         */

        Properties prop = new Properties();
        
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost/menu");
        prop.setProperty("user", "ohgiraffers");
        prop.setProperty("password", "ohgiraffers");

        System.out.println("prop = " + prop);

        // try 구문 안에 내용이 실행 될때 예외가 발생하면 catch 구문으로 디동해서 예외를 발생시킴
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc dirver" );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Properties prop2 = new Properties();

        
        try {
            prop2.load(new FileInputStream("driver.dat"));
            // 필기. Properties 의 모든 키 목록 내보내기 한다.
            prop2.list(System.out);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

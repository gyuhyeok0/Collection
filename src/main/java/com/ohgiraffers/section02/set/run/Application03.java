package com.ohgiraffers.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application03 {
    public static void main(String[] args) {

    /*수업목표. TreeSet 에 대해 이해하고 사용 할 수 있다.
        필기.
            TreeSet 클래스
            데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
     */
    TreeSet<String> tset = new TreeSet<>();

    tset.add("java");
    tset.add("mysql");
    tset.add("jdbc");
    tset.add("html");
    tset.add("css");

        System.out.println("tset = " + tset);


        Set<Integer> lotoo = new TreeSet<>();

        while (lotoo.size() < 8) {

            lotoo.add((int) (Math.random() * 45)+1);
        }

        System.out.println("lotoo = " + lotoo);




    }



}

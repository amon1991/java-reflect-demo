package amon.java.demo.reflect;

import java.util.Scanner;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/7/10.
 */
public class ClassDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        // new 创建对象是静态加载类，在编译时刻就需要加载所有的可能使用到的类,否则编译报错
        if ("word".equals(input)){
            Word word = new Word();
            word.start();
        }else if ("excel".equals(input)){
            Excel excel = new Excel();
            excel.start();
        }else{
            System.out.println("wrong inputs...");
        }

    }

}


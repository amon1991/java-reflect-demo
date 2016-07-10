package com.amon.study.reflect;

import java.util.Scanner;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/7/10.
 */
public class ClassDemo2Better {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        // 动态加载类，在运行时加载
        Class c = Class.forName("com.amon.study.reflect."+input);
        OfficeAble officeAble = (OfficeAble) c.newInstance();
        officeAble.start();

    }

}


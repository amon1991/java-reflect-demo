package amon.java.demo.reflect;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/7/10.
 */
public class ClassDemo3 {

    public static void main(String[] args) {

        Class c1 = int.class;     //int的类类型
        Class c2 = String.class;  //String类的类类型

        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = Void.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

    }

}

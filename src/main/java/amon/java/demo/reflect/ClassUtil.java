package amon.java.demo.reflect;

import java.lang.reflect.Method;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/7/10.
 */
public class ClassUtil {

    /**
     * 打印类的信息，包括类的方法和成员变量
     * @param obj
     */
    public static  void printClassMessage(Object obj){

        // 先获取类类型
        Class c = obj.getClass();

        // 获取类的名称
        System.out.println("类名称："+c.getName());

        /**
         * Methods类，方法对象
         * 一个成员方法就是一个Method对象
         * getMethods()方法获取的是所有的public的函数，包括父类继承而来的
         * getDeclareMethods()获取的是所有该类自己声明的方法，不限访问权限
         */

        Method[] methods = c.getMethods();

        for (Method method : methods) {

            // 得到方法返回值类型的类类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + " ");

            // 得到方法的名称
            System.out.print(method.getName()+"(");

            // 得到的是参数列表的类型的类类型
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + ",");
            }

            System.out.print(")");
            System.out.println();

        }

    }

    public static void main(String[] args) {
        String s = "hello";
        printClassMessage(s);
    }

}

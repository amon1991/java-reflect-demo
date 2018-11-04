package amon.java.demo.reflect;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/7/10.
 */
public class ClassDemo1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        // Foo的实例如何表示
        Foo foo1 = new Foo();

        // Foo这个类 也是一个实例对象，Class类的实例对象，如何表示呢
        // 任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        // 第一种表示方式-->实际在告诉我们任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;

        // 第二种表示方式-->已经知道该类的对象可以通过getClass方法获取一个Class的实例
        Class c2 = foo1.getClass();

        // 第三种方式
        Class c3 = null;
        try {
            c3 = Class.forName("amon.java.demo.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * c1、c2表示了Foo类的类类型（Class type），他们都是Class类的一个实例，属于同一个
         */
        System.out.println(c1==c2);

        System.out.println(c2==c3);

        // 我们完全可以通过类的类类型创建该类的对象实例-->既可以通过c1、c2或c3创建Foo的实例
        Foo foo = (Foo) c1.newInstance();
        foo.print();

    }

}

class Foo{

    void print(){
        System.out.println("foo");
    }

}

package SeniorFunc.NiBianAndXieBian;

import java.util.LinkedList;

/**
 * Created by admin on 2019/9/11.
 */
public class JavaDemo {
    public static void main(String[] args) {
        /**
         * 因为协变和逆变会破坏类型安全。假设上面的代码是合法的，我们此时
         完全可以 s2.add(new Person(“xuzheng”)往集合中添加 Person 对象，但此时我们知道，
         s2 已经指向了 s1，而 s1 里面的元素类型是 String 类型，这时其类型安全就被破坏了，从这个角
         度来看，Java 不提供协变和逆变是有其合理性的
         */
//        java.util.List<String> s1 = new LinkedList<String>();
//        java.util.List<Object> s2 = new LinkedList<Object>();
//        s2 = s1;
//        s1 = s2;
//        String a1 = "haha";
//        Object a2 = a1;

//        System.out.println( a2 ); // haha


    }
}

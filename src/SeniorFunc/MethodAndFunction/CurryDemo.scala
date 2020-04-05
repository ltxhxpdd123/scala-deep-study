package SeniorFunc.MethodAndFunction

import java.io.FileInputStream

/**
  * 柯里化技术在提高适用性还是在延迟执行或者固定易变因素等方面有着重要重要的作用
  * curry化最大的意义在于把多个参数的function等价转化成多个单参数function的级联，这样所有的函数就都统一了
  */
object CurryDemo {
  def multiply(x: Int)(y: Int) = x * y

  def multiply2 = multiply(2) _ /** 这个偏函数表示的是第二个函数 */

  /** 一个普通的方法，接受两个 Int 类型参数做乘积 */
  def multiply3(x: Int) = (y: Int) => x * y

  def multiply4(x: Int, y: Int = 10) = x * y

  def multiply5(x: Int)(y: Int = 10) = x * y

  def main(args: Array[String]): Unit = {
    /** 柯里化（Currying）是把接受多个参数的函数变换成接受一个单一参数(最
      * 初函数的第一个参数)的函数，并且返回接受余下的参数且返回结果是一个新函数的技术。 */
    println(multiply(2)(4))
    println(multiply2(4))
    println(multiply5(4)())


    withIOStream(new FileInputStream("G:\\ScalaDeepLearn\\src\\SeniorFunc\\MethodAndFunction\\test.txt")) {
      println("Hello,Start to read")
      read
    }
    /**组装任意函数*/
    println(combine(1)(add)(3))
    println(combineCurray(1)(add)(3))
  }


  def read(stream: java.io.InputStream) = {
    println(stream.available())
  }

  def withIOStream(stream: java.io.InputStream)(func: java.io.InputStream => Unit) {
    try {
      func(stream)
    } finally {
      stream.close()
    }
  }

  def add(x: Int, y: Int) = x + y

  /**组装任意函数*/

  def combine(a: Int)(b: (Int, Int) => Int) = (x: Int) => b(a, x)

  def combineCurray(a: Int)(b: (Int, Int) => Int)(x: Int) = b(a, x)

}

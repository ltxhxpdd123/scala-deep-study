package Class.GeneralClass

/**
  * Created by admin on 2019/9/11.
  */
class Queue private(val name: String, prop: Array[String], private var age: Int = 18) {
  println(prop.size)

  /** prop 被下面的方法使用后，prop 就变成了不可变的对象私有字段，等同于 private[this] val prop */

  def description = name + " is " + age + " years old with " + prop.toBuffer

}

object Queue {
  def main(args: Array[String]): Unit = {
    /** 私有的构造器，只有在其伴生对象中使用 */
    val g = new Queue("高明青", Array("大神", "大神经"), 20)
    println(g.description) /** 高明青 is 20 years old with ArrayBuffer(大神, 大神经) */
  }
}

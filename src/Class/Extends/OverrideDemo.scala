package Class.Extends

/**
  * Created by admin on 2019/9/11.
  */
object OverrideDemo {

  def main(args: Array[String]): Unit = {
    val p2 = new Person22
    p2.eat()
  }

}

abstract class Person222 {
  def eat(): Unit
}

class Person22 extends Person222 {
  /** 因为父类是抽象类，所以 override 可以加可以不加 */
  def eat(): Unit = {
    println("我有吃的方法！！！")
  }
}

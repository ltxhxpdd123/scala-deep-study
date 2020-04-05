package Class.Abstract

/**
  * Created by admin on 2019/9/11.
  */
abstract class Animal {

  /** 抽象字段(域） */
  val height: Int

  /** 抽象方法 */
  def eat: Unit
}

class Person(val height/**1,继承抽象字段*/: Int) extends Animal {
  /**2,继承抽象方法 */
  override def eat: Unit = {
    println("每天都需要吃饭！！！因为我是人了，不是动物了！！！")
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val person = new Person(180)
    println(person.height) /** 180 */
    person.eat /** 每天都需要吃饭！！！因为我是人了，不是动物了！！！ */
  }
}

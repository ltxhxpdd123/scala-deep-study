package Trait

/**
  * Created by admin on 2019/9/8.
  */
object TraitDemo {

  /**
    * Scala 中： 1、 特质里面的方法既可以实现，也可以不实现,那么跟抽象类有什么区别，两点原因：
    * 1、优先使用特质。一个类扩展多个特质是很方便的，但却只能扩展一个抽象类。
    * 2、如果你需要构造函数参数，使用抽象类。因为抽象类可以定义带参数的构造函数，
    * 而特质不行。例如，你不能说 trait t(i: Int) {}，参数 i 是非法的。
    * 3、抽象类，我们用的是 extends，我们只能单继承，但是我们可以多实现
    * 4、实现特质，如果没有继承其它类，那么使用第一个特质使用 extends，后面的使用 with，
    * 所以如果有考题说实现特质只能使用 with，这是不对的。
    */
  trait MyLogger {
    def log(msg: String) {}
  }


  trait Logger_A extends MyLogger {
    override def log(msg: String): Unit = {
      println("AAAAAA : " + msg)
    }
  }

  trait Logger_B extends MyLogger {
    override def log(msg: String): Unit = {
      println("BBBBBB : " + msg)
    }
  }

  /**
    * 使用这种方式，就相当于在原来的代码实现上进行修改。
    *
    * 违背设计模式的原则的:对修改关闭，对扩展/增加开放
    */
  class Person123(val name: String) extends Logger_A {
    def sayHello(): Unit = {
      println("Hi ,i'm name")
      log("sayHello is invoked!")
    }
  }

  def main(args: Array[String]): Unit = {
    /**
      * 这种语法： 混入
      */
    val p1 = new Person123("liudehua") with Logger_B
    p1.sayHello()
  }

}

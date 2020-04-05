package Class.Trait.TraitSuperApplcation

/**
  * Created by admin on 2019/9/11.
  */
object Demo {
  def main(args: Array[String]): Unit = {
    val p = new Person123("gaomingqing")
    p.sayHello()
    val p2 = new Person123("lantian") with Logger_B
    p2.sayHello()
  }

}

trait MyLogger {
  def log(msg: String) {}
}

trait Logger_A extends MyLogger {
  override def log(msg: String): Unit = {
    println("Logger_A:" + msg)
  }
}

trait Logger_B extends MyLogger {
  override def log(msg: String): Unit = {
    println("Logger_B:" + msg)
  }
}

class Person123(val name:String) extends Logger_A{
  def sayHello(): Unit ={
    println("Hi ,i'm name")
    log("sayHello is invoked!")
  }
}
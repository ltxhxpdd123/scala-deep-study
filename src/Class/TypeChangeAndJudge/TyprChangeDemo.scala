package Class.TypeChangeAndJudge

/**
  * Created by admin on 2019/9/11.
  */
object TyprChangeDemo {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    val doudou = new DouDou

    println(doudou.isInstanceOf[Dog])
    println(classOf[Dog]) /**class Class.TypeChangeAndJudge.Dog*/
    println(doudou.asInstanceOf[Dog]) /**Class.TypeChangeAndJudge.DouDou@ea4a92b*/

  }

}
class Dog{}
class DouDou extends Dog{}

package SeniorFunc.MethodAndFunction

/**
  * Created by admin on 2019/9/11.
  */
object ClosureDemo {
  def main(args: Array[String]): Unit = {

    val result = BiBao

    result(2)
    result(2)
    result(2)
    result(2)
  }

  val BiBao = {
    var privateSum = 0
    val addSum = (x: Int) => {privateSum += x;println(s"现在privateSum的值是：$privateSum")}
    addSum
  }
}

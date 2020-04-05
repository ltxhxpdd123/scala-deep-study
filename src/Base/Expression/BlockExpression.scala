package Base.Expression

/**
  * Created by admin on 2019/9/10.
  */
object BlockExpression {
  def main(args: Array[String]): Unit = {
    //在scala中{}中课包含一系列表达式，块中最后一个表达式的值就是块的值
    var x = 0
    val resullt = {
      if (x < 0) {
        -1
      } else if (x >= 1) {
        1
      } else {
        "error"
      }
    }
    println(resullt)

    //返回块中的最后一个表达式的值

    val aa = {
      1 to 10;
      if (3 > 2) 3 else 2
      val cc = 2
      cc
    }

    println(aa) //()
  }
}

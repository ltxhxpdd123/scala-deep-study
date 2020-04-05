package Base.Expression

/**
  * Created by admin on 2019/9/11.
  */
object IfDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    //判断 x 的值，将结果赋给 y
    val y = if (x > 0) 1 else -1
    //打印 y 的值
    println(y)
    //支持混合类型表达式
    val z = if (x > 1) 1 else "error"
    //打印 z 的值
    println(z)
    //如果缺失 else，相当于 if (x > 2) 1 else ()
    val m = if (x > 2) 1
    print(m) //()
  }

}

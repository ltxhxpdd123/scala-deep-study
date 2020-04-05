package SeniorFunc.Implicit

/**
  * Created by admin on 2019/9/11.
  */
object ImplicitArgumentDemo {


  def main(args: Array[String]): Unit = {
    println(add(2, 3))
    println(add2(2)(3))
    println(add3(2)())

    /** *
      * 1、 隐式转换会首先从全局中寻找，寻找不到，才使用隐式参数
      * 2、 隐式转换只能定义在 object 中
      */
    println("==============================")
    println(rmb(100))
    println("==============================")
    import MyPredef._
    println(rmb(100))


  }

  // 正常的普通方法
  def add(x: Int, y: Int) = x + y

  // 柯里化的方法
  def add2(x: Int)(y: Int) = x + y

  def add3(x: Int)(y: Int = 10) = x + y

  // 如果变成下面这种形式：
  def add4(x: Int)(implicit y: Int = 10) = x + y


  object MyPredef {
    // 声明一个 Double 类型的隐式转换值
    implicit var current_rate: Double = 6.66
  }

  /** 第一个参数是要换算成美元的人民币数目;第二个参数是汇率 */
  def rmb(dollar: Double)(implicit rate: Double = 6) = dollar * rate
}

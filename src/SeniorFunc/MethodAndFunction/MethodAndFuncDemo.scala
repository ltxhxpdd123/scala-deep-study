package SeniorFunc.MethodAndFunction

/**
  * Created by admin on 2019/9/11.
  */
object MethodAndFuncDemo {
  def main(args: Array[String]): Unit = {
    /** 定义函数和方法 */
    DefineMethodAndFunc
    /** 高阶函数的使用 */
//    HighOderFunc
  }

  def DefineMethodAndFunc = {
    /** 1,匿名函数 */
    val array = Array(1, 2, 3, 4)
    val newArray = array.map((x: Int) => x + 1)
    println(newArray.mkString(","))
    /** 2,函数各种写法 */
    array.map((x) => x + 2)
    // 一个参数
    array.map(x => x + 2)
    // 参数在方法体只使用了一次
    array.map(_ + 2)

    // 1、函数可以作为参数传递给方法，也就是说函数可以作为方法的参数
    def m2(f: (Int, Int) => Int) = f(2, 6)

    val f2 = (x: Int, y: Int) => x - y
    println(m2(f2)) // -4
    // 2、函数可以作为方法的参数，但是也可以作为函数的参数，例如：
    val aa = (x: Int) => x + 1
    val bb = (f: Int => Int, x: Int) => f(x) + 1
    println(bb(aa, 5)) // 7
    // 3、在需要传入函数作为参数的位置上传入一个方法的话，那么这个方法会被自动的转换为函数作为参数，也可以通过“_”把方法转换为参数
    def mm(x: Int, y: Int): Int = x + y

    def mm1(f: (Int, Int) => Int, x: Int, y: Int) = f(x, y)

    println(mm1(mm, 2, 4)) // 6
    println(mm1(mm _, 2, 4)) //6
  }

  def HighOderFunc = {
    /**
      * 高阶函数主要有两种：
      * 1、一种是将一个函数当做另外一个函数的参数（即函数的参数是函数）
      * 2、另外一种是返回值是函数的函数（即函数的返回值是函数）
      **/

    /** 返回值是函数的函数 */
    def add(x: Int) = (y: Int) => x + y

    println(add(2)(6))

    def addArgument(a: Int, b: Int) = {
      a + b
    }

    /** 函数当做另外一个函数的参数 */
    def opt(f: (Int, Int) => Int) = f(3, 4)

    /** 下面的2种写法等价于 */
    println(opt(addArgument _))
    println(opt(addArgument))
  }
}

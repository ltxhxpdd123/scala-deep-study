package Base.Variable

/**
  * 我们的 scala 里面变量的修饰符一共有两个，一个是 var，一个是 val
  * 如果是 var 修饰的变量，那么这个变量的值是可以修改的
  * 如果是 val 修饰的变量，那么这个变量的值是不可以修改的
  */
object VariableDemo {
  def main(args: Array[String]): Unit = {
    //1,使用 val 定义的变量值是不可变的，相当于 java 里用 final 修饰的变量
    val i = 1
    //2,使用 var 定义的变量是可变得，在 Scala 中鼓励使用 val
    var s = "hello"
    //3,Scala 编译器会自动推断变量的类型，必要的时候可以指定类型
    val str: String = "spark"
  }

}

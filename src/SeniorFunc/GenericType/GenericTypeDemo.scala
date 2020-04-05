package SeniorFunc.GenericType

/**
  * Created by admin on 2019/9/11.
  */
object GenericTypeDemo {

  class Person[T](var name: T)

  class Student[T, S](name: T, var age: S) extends Person(name)

//  case class Student11[T, S <: Comparable[S]](var name: T, var height: S)

  case class Student11[T,S <% Comparable[S]](var name:T,var height:S)

  def main(args: Array[String]): Unit = {
    /** 1,普通泛型 */
    println(new Student[String, Int]("高明青", 33).name)
    /** 2,类型变量界定 */
    val ret = TypeBound
    println(ret)
    /**3,下面这条语句不合法，这是因为,Int 类型没有实现 Comparable 接口*/
    TypeViewBound
  }

  def TypeBound = {
    compare("a", "b")
  }

  def TypeViewBound = {

    val s = Student11("john", "170")
    /**Int 类型此时会隐式转换为 RichInt类，而RichInt 类属于 Comparable 继承层次结构*/
    val s2 = Student11("john", 170)

  }

  /** 代码为什么编译不通过，是因为：泛型 T 并不一定具备 compareTo 方法 */
//    def compare[T](first:T,second:T) = {
//      if (first.compareTo(second)>0)
//        first
//      else
//        second
//    }

  def compare[T <: Comparable[T]](first: T, second: T) = {
    if (first.compareTo(second) > 0)
      first
    else
      second
  }


}

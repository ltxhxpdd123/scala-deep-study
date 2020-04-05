package Class.GeneralClass

/**
  * Created by admin on 2019/9/11.
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Teacher("高明青")
    t1.describle
    val t2 = Teacher("高明青",18)
    t2.describle
  }
}

class Teacher(var name: String) {
  var age: Int = _
  println("在构建Teacher对象，调用了构造器")

  // 提供一个辅助构造器
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }

  def describle {
    println("我是：" + name + ",我永远" + age + "岁！！！")
  }
}

object Teacher {
  def apply(name: String): Teacher = {
    println("调用了apply1方法")
    val t = new Teacher(name)
    t.age = 18
    t
  }

  def apply(name: String, age: Int): Teacher = {
    println("调用了apply2方法")
    new Teacher(name, age)
  }
}

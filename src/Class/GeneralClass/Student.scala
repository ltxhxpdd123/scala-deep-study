package Class.GeneralClass

/**
  * Created by admin on 2019/9/11.
  */
class Student(val name: String, val age: Int) {
  println("Student类：执行了主构造器！！！")

  private var gender = "male"

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    println("Student类：执行辅助构造器！！！")
    this.gender = gender
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val gaomingqing = new Student("gaomingqing", 23, "男")
    /**
      * Student类：执行了主构造器！！！
      * Student类：执行辅助构造器！！！
      */
  }
}


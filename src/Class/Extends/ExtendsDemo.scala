package Class.Extends

/**
  * Created by admin on 2019/9/11.
  */
object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    val gaomingqing = new Student("gaomingqing",33,"1024")
    println(gaomingqing.studentNo)
  }

}

//Person 类
class Person(name: String, age: Int) {
  println("Person : " + name + "\t" + age)
}

//Student 继承 Person 类
class Student(name: String, age: Int, var studentNo: String) extends Person(name, age) {
  println("Student : "+ name + "\t" + age + "\t" + studentNo)
}

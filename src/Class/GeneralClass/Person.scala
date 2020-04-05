package Class.GeneralClass

/**
  * Created by admin on 2019/9/11.
  */
class Person {
  println("============")
  //用 val 修饰的变量是只读属性，有 getter 但没有 setter
  val id = "1001x"
  //用 var 修饰的变量既有 getter 又有 setter
  var age: Int = 33
  //类私有字段,只能在当前类的内部或伴生对象中使用
  private var name: String = "高明青"
  //对象私有字段,访问权限更加严格的，Person 类的方法只能访问到当前对象的字段
  /** 伴生对象都不能访问 */
  private[this] val nickName = "大数据布道者"

  def describle() = {
    println("下面是介绍：" + name + ":" + Person.NickNAME + "--->" + nickName)
  }

}

object Person {

  private var NickNAME: String = "GAO_MING_QING"

  def main(args: Array[String]): Unit = {
    val p = new Person

    println(p.id)
    /**
      * ============
      * 1001x
      **/
    p.describle()
  }
}

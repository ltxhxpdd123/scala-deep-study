package SeniorFunc.NiBianAndXieBian

/**
  * Created by admin on 2019/9/11.
  */
object ScalaDemo {

  class MyList[T](val head: T, val tail: MyList[T]) {}

  /** 指定协变 */
  class MyList2[+T](val head: T, val tail: MyList2[T]) {
    def prepend[U >: T](newHead: U): MyList2[U] = new MyList2(newHead, this)
  }

  def main(args: Array[String]): Unit = {
    val list1: MyList[String] = new MyList[String]("黄", null)
    val list2: MyList[String] = new MyList[String]("黄", new MyList[String]("黄 ", null))


    /** MyList[String]不是 MyList[Any]的子类 */
//        val list3: MyList[Any] = new MyList[String]("黄", null)
//        val list4: MyList[Any] = new MyList[String]("黄", new MyList[String]("黄 ", null))

    /** 下面编译就通过了 */
    val list3: MyList2[Any] = new MyList2[String]("黄", null)
    val list4: MyList2[Any] = new MyList2[String]("黄", new MyList2[String]("黄 ", null))
  }

}

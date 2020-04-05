package PatternMatch

import scala.util.Random

/**
  * Created by admin on 2019/9/11.
  */
object Demo1 {
  def main(args: Array[String]): Unit = {
//        matchString

    val strings = "1,3,2".split(",")
    println(strings(2))
//    matchType

//    matchSeq


  }

  def matchString = {
    val arr = Array("高明青", "兰天", "张校博")
    var name = arr(Random.nextInt(arr.length))
    name match {
      case "兰天" => println("我是兰天！")
      case "高明青" => println("我是高明青！")
      case _ => println("我是水水...")
    }
  }

  def matchType = {
    val arr = Array("hello", 1, 2.0, CaseDemo())
    val v = arr(Random.nextInt(4))
    println(v)

    v match {
      case x: Int => println("Int " + x)
      case y: Double if (y > 0) => println("Double " + y)
      case z: CaseDemo => println("CaseDemo " + CaseDemo)
      case _ => println("=====")
    }
  }

  def matchSeq = {
    val arr = Array(1, 3, 5)
    arr match {
      case Array(1, x, y) => println(x + " " + y)
      case Array(0) => println("only 0")
      case Array(0, _*) => println("0 ...")
      case _ => println("something else")
    }
    val lst = List(3, -1)
    lst match {
      case 0 :: Nil => println("only 0")
      case x :: y :: Nil => println(s"x: $x y: $y")
      case 0 :: tail => println("0 ...")
      case _ => println("something else")
    }
  }

  case class CaseDemo()

}

package Class.CaseClass

import scala.util.Random

/**
  * Created by admin on 2019/9/11.
  */
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(CheckTimeOutTask, HeartBeat(123), SubmitTask("0001", "task1"))
    val v = arr(Random.nextInt(arr.length))
    println(v)
    v match {
      case SubmitTask(id, name) => println(s"$id,$name")
      case HeartBeat(time) => println(time)
      case CheckTimeOutTask => println("check")
    }
  }

}

case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask
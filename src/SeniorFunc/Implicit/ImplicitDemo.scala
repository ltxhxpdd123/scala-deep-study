package SeniorFunc.Implicit

import java.io.File

import scala.io.Source

/**
  * Created by admin on 2019/9/11.
  */
object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    /** 1,时机一：当调用某个对象不存在的方法时,把这个对象（偷偷的）隐式转换为具有这个方法的那个对象 */
    val file = new File("G:\\ScalaDeepLearn\\src\\SeniorFunc\\Implicit\\test.txt")
    //val allText = file.readAll()
    import FileImplicit._
    val allText = file.readAll()
    println(allText)
    /** 2,时机二：当方法参数类型不匹配时,调用某个方法，确实这个方法也存在，要是传入的参数类型不匹配 */
    val young = new Young("Young")
    val older = new Older("Older")
    val worker = new Worker("Worker")
    val adult = new Worker("Adult")
    val special = new SpecialPerson("SpecialPerson")
    //buyTicket(worker)
    import PersonImplicit._
    buyTicket(young)
  }

  class RichFile(f: File) {
    def readAll(): String = {
      Source.fromFile(f).mkString
    }
  }

  object FileImplicit {
    implicit def file2RichFile(f: File): RichFile = new RichFile(f)
  }

  //特殊人群
  class SpecialPerson(var name: String)

  //特殊人群之一
  class Young(var name: String)

  //特殊人群之二
  class Older(var name: String)

  //正常人群之一
  class Worker(var name: String)

  //正常人群之二
  class Adult(var name: String)

  def buyTicket(p: SpecialPerson): Unit = {
    println(p.name + "票给你！！爽去吧！！");
  }

  object PersonImplicit {
    implicit def Person2Special(obj: AnyRef): SpecialPerson = {
      if (obj.getClass == classOf[Young]) {
        val young = obj.asInstanceOf[Young]
        new SpecialPerson(young.name)
      } else if (obj.getClass == classOf[Older]) {
        val older = obj.asInstanceOf[Older]
        new SpecialPerson(older.name)
      } else {
        new SpecialPerson("NULL")
      }
    }
  }

}

package Class.Trait

/**
  * Created by admin on 2019/9/11.
  */
trait DAO {
  val id:Int
  val name:String = "GAOMINGQING"
  def add(o:Any):Boolean
  def update(o:Any):Int
  def query(id:String):List[Any]
  def delete(id:Int) = {println("delete one record")}
}

package Class.Trait

/**
  * Created by admin on 2019/9/11.
  */
class DaoImpl extends DAO with Serializable {
  /** 给父类中的抽象字段赋值，必须的 */
  override val id: Int = 12

  /** 实现父类中的抽象方法，必须的 */
  override def add(o: Any): Boolean = true

  override def update(o: Any): Int = 1

  override def query(id: String): List[Any] = List(1, 2, 3)
}

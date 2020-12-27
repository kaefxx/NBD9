class Container[A] (val value: A){

  def getA: A = {
    value
  }

  def applyFunction[R](function: A => R): R = {
    function(value)
  }
}

object z1 {
  def main(args: Array[String]): Unit = {
    val container = new Container("NBD s16405");
    container.applyFunction(println)
  }

}

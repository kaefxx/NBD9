
trait Maybe[A] {
  def applyFunction[R, X](function: A => R): Maybe[A]

}

class No extends Maybe[Nothing] {
  override def applyFunction[R, X](function: Nothing => R): Maybe[Nothing] = this
}

class Yes[A] (val a: A) extends Maybe[A]  {
  override def applyFunction[R, X](function: A => R): Maybe[A] = ???
}


object z2_z3_z4 {
  def main(args: Array[String]): Unit = {
    val no = new No
    val yes = new Yes ("NBD s16405")

    //z2
    println(no.isInstanceOf[Maybe[_]])
    println(yes.isInstanceOf[Maybe[_]])

    //z3
    println(no.applyFunction(println))


  }
}

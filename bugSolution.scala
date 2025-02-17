```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): Unit = {
    println(value)
  }
}

object Main extends App {
  implicit val intOrdering: Ordering[Int] = Ordering.Int
  val myInt = new MyClass(10)
  myInt.myMethod

  implicit val stringOrdering: Ordering[String] = Ordering.String
  val myString = new MyClass("hello")
  myString.myMethod
}
```
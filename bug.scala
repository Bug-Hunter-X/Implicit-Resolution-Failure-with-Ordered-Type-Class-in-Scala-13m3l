```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Ordered[T]): Unit = {
    println(value)
  }
}

object Main extends App {
  implicit val intOrdering: Ordering[Int] = Ordering.Int
  val myInt = new MyClass(10)
  myInt.myMethod

  // Compiler error: could not find implicit value for parameter ev: String => Ordered[String]
  val myString = new MyClass("hello")
  myString.myMethod
}
```
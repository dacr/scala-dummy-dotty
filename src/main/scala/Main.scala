object Main {

  import BuilderPattern._

  val mt =
    table {
      row {
        cell { "truc" }
        cell { "muche" }
      }
    }

  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(msg)
    println(mt.toString)
    
    CompileNLoad.test()
  }

  def msg = "I was compiled by dotty :)"

}

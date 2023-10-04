package lecture1

object ValuesVariablesType {
  // Conventional method: Use object ValuesVariablesType extends App
  // Alternative method: Use def main (type main + ctrl + space to get function template
  // Extends App or Main are the common entrypoint to the scala app (Run triggers this snippets under this)
  def main(args: Array[String]): Unit = {
      // VAL
      // VAL is immune to side effects
      val x: Int = 2
      // x = variable
      // Int = type
      println(x)
      //x = 2 FAIL by Val assignments are immutable

      // ' represents Symbol or Char
      // " represents String
      // val aString: String = 'hello'
      // val aChar: Char = "h" These are type mismatch errors

      val aSInt: Short = -32768 // Accepts max -32768 to 32767
      val aFloat:Float  = 2.0f // Float without an f is a double
      val aDouble: Double = 2.0

      // VAR
      // Mutable variables
      // Changes = Side Effects in FP world
      // VAR introduce side effects

  }
}

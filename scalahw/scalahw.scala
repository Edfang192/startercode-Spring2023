case class Neumaier(sum: Double, c: Double)

object HW {

   def q1_countsorted(x: Int, y: Int, z:Int) = {
      //the types of the input parameters have been declared.
      //you must do the same for the output type (see scala slides)
      //do not use return statements.
        var count = 0
        if (x < y) count += 1
        if (y < z) count += 1
        if (x < z) count += 1
        count
      -1
   }

   def q2_interpolation(name: String, age: Int) = {
      //the types of the input parameters have been declared.
      //you must do the same for the output type (see scala slides)
      //do not use return statements.
      "${if (age >= 21) "hello" else "howdy"}, ${name.toLowerCase}"
   }

   def q3_polynomial(arr: Seq[Double]) = {
      //the types of the input parameters have been declared.
      //you must do the same for the output type (see scala slides)
      //do not use return statements.
      arr.zipWithIndex.foldLeft(0) { (acc, pair) =>
      val (elem, index) = pair
      acc + elem * (index + 1)
  }

   }

   def q4_application(x: Int, y: Int, z: Int)(f: (Int, Int) => Int) = {
      //the types of the input parameters have been declared.
      //you must do the same for the output type (see scala slides)
      //do not use return statements.
      f(f(x, y), z)
   }

   // create the rest of the functions yourself
   // in order for the code to compile, you need to (at the very least) create
   // blank versions of the remaining functions and have them return a value of 
   // the expected type, like the blank functions above.
   // remember, to compile, you don't specify any file names, you just use sbt compile
}

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
   def q5_stringy(start: Int, n: Int): Vector[String] = {
      //Creates a vector with n elements and the two arguments in tabulate maps the indices.
      
      Vector.tabulate(n)(i => (start + i).toString)
   }
   def q6_modab(a: Int, b: Int, c: Vector[Int]): Vector[Int] = {
      //Use filter to take elements from c and return a value if the elem is greater than or equal to a.
      c.filter(element => element >= a && elem % b != 0)
   }
   def q7_count(arr: Vector[Int], f: Int => Boolean): Int = {
      //check if array is empty
      if (arr.isEmpty) 0
      else {
         val countRest = q7_count(arr.tail, f)//recursively call itself to store results in count and adds 1 to the result of Count.
         //If it does not satisfy, return count
         if (f(arr.head)) count + 1
         else count
      }
   }
   def q9_neumaier(input: Seq[Double]): Double = {
      case class Neumaier(sum: Double, comp: Double)

      val res = input.foldLeft(Neumaier(0.0, 0.0)) { (state, x) =>
         val t = state.sum + x
         if (math.abs(state.sum) >= math.abs(x)) {
            Neumaier(t, state.comp + (state.sum - t) + x)
      } else {
         Neumaier(t, state.comp + (x - t) + state.sum)
      }
  }
  res.sum + res.comp
}
   // create the rest of the functions yourself
   // in order for the code to compile, you need to (at the very least) create
   // blank versions of the remaining functions and have them return a value of 
   // the expected type, like the blank functions above.
   // remember, to compile, you don't specify any file names, you just use sbt compile
}

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object SLab {

    def q1(sc:SparkContext) = {

    }


    def q2(sc:SparkContext) = {


    }


    def testRDD(sc:SparkContext):RDD[String] = {
       //before working on the larger datasets, your q1 and q2 functions can call this
       //one to get an rdd to work with and to test out your code.
       //modify the code below so that it is a good test rdd
       //
       val mylist = List(
            "InvoiceNo\tStockCode\tDescription\tQuantity\tInvoiceDate\tUnitPrice\tCustomerID\tCountry",
            "536365\t85123A\tWHITE HANGING HEART T-LIGHT HOLDER\t6.0\t12/1/2010 8:26\t2.55\t17850\tUnited Kingdom",
            "536365\t71053\tWHITE METAL LANTERN\t6.0\t12/1/2010 8:26\t3.39\t17850\tUnited Kingdom",
            "536365\t84406B\tCREAM CUPID HEARTS COAT HANGER\t8.0\t12/1/2010 8:26\t2.75\t17850\tUnited Kingdom",
            "536365\t84029G\tKNITTED UNION FLAG HOT WATER BOTTLE\t6.0\t12/1/2010 8:26\t3.39\t17850\tUnited Kingdom",
            "536365\t84029E\tRED WOOLLY HOTTIE WHITE HEART.\t6.0\t12/1/2010 8:26\t3.39\t17850\tUnited Kingdom",
            "536365\t22752\tSET 7 BABUSHKA NESTING BOXES\t2.0\t12/1/2010 8:26\t7.65\t17850\tUnited Kingdom",
            "536365\t21730\tGLASS STAR FROSTED T-LIGHT HOLDER\t6.0\t12/1/2010 8:26\t4.25\t17850\tUnited Kingdom",
            "536366\t22633\tHAND WARMER UNION JACK\t6.0\t12/1/2010 8:28\t1.85\t17850\tUnited Kingdom",
            "536366\t22632\tHAND WARMER RED POLKA DOT\t6.0\t12/1/2010 8:28\t1.85\t17850\tUnited Kingdom",
            "536367\t84879\tASSORTED COLOUR BIRD ORNAMENT\t32.0\t12/1/2010 8:34\t1.69\t13047\tUnited Kingdom"
          )
       sc.parallelize(mylist, 3)
       // you can examine an rdd (say it is called mytestrdd) by doing the following:
       // val localversion = mytestrdd.take(10)
       // localversion.foreach{x=>println(x)} //if the rdd entires are not arrays or lists
       // localversion.foreach{x => println(x.mkString("\t")) } // if the rdd entires are arrays (if x is an array).
       //                             x.mkString("\t") converts x into a tab-separated string that makes it easier to print
    }

}

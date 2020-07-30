package stueded.day04

/**
 * @author: lmx
 * @create: 2020/5/1
 **/
object test1 {

	def main(args: Array[String]): Unit = {
		import org.apache.spark.api.java.JavaSparkContext
		import org.apache.spark.sql.Dataset
		import org.apache.spark.sql.SparkSession

		val spark = SparkSession.builder.appName("demo_spark").enableHiveSupport.getOrCreate
		val vender_set = spark.sql("select pop_vender_id from app.app_sjzt_payout_apply_with_order where dt = '2019-08-05' and pop_vender_id is not null")
		System.out.println("数据读取 OK")

		val sc = new JavaSparkContext(spark.sparkContext)

		import java.util
		val list_temp = new util.ArrayList[String]

		import org.apache.spark.api.java.JavaRDD
		val venderRDD = sc.parallelize(list_temp)
	}


}

package stueded.day04

import java.sql.Date
import java.text.SimpleDateFormat



/**
 * @author: lmx
 * @create: 2020/5/19
 **/
object test2 {

	def main(args: Array[String]): Unit = {

//		val tm = 1502036122000L
////		val a = tranTimeToString(tm)
//		val fm : String = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tm)
//		val aa = "2017-08-01 16:44:32"
//		val timestamp = java.sql.Timestamp.valueOf(fm)
//		Integer
//		println(timestamp)
//		var a = 1;


	}

	def tranTimeToString(tm:String) :String={
		val fm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
		val tim = fm.format(new Date(tm.toLong))
		tim
	}

}

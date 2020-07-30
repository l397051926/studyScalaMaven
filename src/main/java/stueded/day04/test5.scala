package stueded.day04

import java.util.Date

import scala.collection.mutable.ArrayBuffer

/**
 * @author: lmx
 * @create: 2020/5/25
 **/
object test5 {

	def main(args: Array[String]): Unit = {
		var array = new ArrayBuffer[Any]()
		array += 7

		array += new Date()
		for(i<- 0 until array.length) println(array(i))



	}

}

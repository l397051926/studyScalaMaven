package stueded.day02

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author: lmx
 * @create: 2019/12/6
 **/
object test4 {

	def main(args: Array[String]): Unit = {
		var a = ArrayBuffer(1,2,3,4)
		a +=5
		a +=5
		for (i <- a) println(i)

		var map = new mutable.HashMap[String,Int]()
		map+="aaa" ->12
		map+="bbb" ->13
		map+="ccc" ->14

		println(map.get("aaa"))
		println(map("aaa"))
		println(map.getOrElse("aaa",0))

		for (v <- map.values) println(v)
	}
}

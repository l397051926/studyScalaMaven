package study.day04

import scala.collection.mutable

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test4 {

	def main(args: Array[String]): Unit = {
		//默认不可变
		val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
		// + 增加 - 减少 update 更新
		val map1 = map + ("d" -> 4)
		println(map1.mkString(","))
		//为了避免空指针 提供两个对象 some none 属于 Option
		//Option 提供默认值方法  如果的确没有值
		println(map.get("b").get)
		println(map.get("e").getOrElse())



//		val mMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
	}

}

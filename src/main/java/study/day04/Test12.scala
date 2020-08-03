package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test12 {

	def main(args: Array[String]): Unit = {
		//元组特殊操作
		val (name,age,addr) = ("zhangsan",10,"tianjin")
		println(s"$name - $age - $addr")

		val tuples = List( ("a",1) , ("b",2), ("c",3) )
		for ((k,v) <- tuples) {
			println(k + "=" + v)
		}

		//case class 样例类
		//sealed 密封类 要求所有样例类都放在这里
	}

}

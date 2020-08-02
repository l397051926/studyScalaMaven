package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test8 {

	def main(args: Array[String]): Unit = {
		//scala 所有表达式都有值
		val flag = false
		val unit = if (flag) {
			"abc"
		}

		println(unit)

		//scala 没有三元运算符
		val s = if(flag) "a" else "b"
		println(s)
	}

}

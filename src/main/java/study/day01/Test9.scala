package study.day01

/**
 *  _ == java *
 */

import scala.util.control.Breaks._

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test9 {

	def main(args: Array[String]): Unit = {
		// for 循环
		//使用 to 循环的范围 从1 到10 包含概念
		for (i <- 1 to 10) {
			println(s"i = $i")
		}

		// 从1 到10 不包含10
		for (i <- 1 until 10) {
			println(s"i = $i")
		}

		println(1.+(1))

		for (i <- Range(1, 10)) {
			println(s"i = $i")
		}
		println("-------------------")

		for (i <- Range(1, 10, 2)) {
			println(s"i = $i")
		}

		println("------九层妖塔---------")
		for (i <- Range(1, 18, 2)) {
			println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))
		}

		println("------九层妖塔  增加 条件 放在 循环语句里面---------")
		for (i <- Range(1, 18, 2); j = (18 - i) / 2) {
			println(" " * j + "*" * i + " " * j)
		}

		println("------九层妖塔  花括号 可以换行---------")
		for {i <- Range(1, 18, 2)
			 j = (18 - i) / 2} {
			println(" " * j + "*" * i + " " * j)
		}

		/**
		 * 如果满足条件就跳过
		 */
		println("-------循环首位--------")
		for (i <- 1 to 5 if i % 2 == 0) {
			println(s"i = $i")
		}

		println("----------for 返回值-- 默认是没有返回值的------")

		val unit = for (i <- 1 to 5) {
			"abc"
		}
		println(unit)

		println("----------------yield 可以返回值每次循环的结果-------------")

		val value = for (i <- 1 to 5) yield i
		println(s"value = $value")

		println("--------------break 怎么操作呢--------------")
		breakable {
			for (i <- 1 to 10) {
				if (i == 5) {
					break
				}
				println(s"i = $i")
			}
		}
		println("循环结束")

	}


}

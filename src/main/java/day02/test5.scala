package day02

/**
 * @author: lmx
 * @create: 2019/12/6
 **/
object test5 {

	def main(args: Array[String]): Unit = {
		var name = Array("zs","ls","ww")
		var age = Array(12,13,14)
		var map = name.zip(age)
		for (key <- map) println(key)

	}
}

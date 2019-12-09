package day03

/**
 * @author: lmx
 * @create: 2019/12/9
 **/
object test5 {

	def main(args: Array[String]): Unit = {
		(1 to 9).map("*" * _).foreach(println _)
		println("-------------------------")
		(1 to 9).filter(_ % 2 == 0).foreach(println _)
		println("__________________________")
		val a = (1 to 9).reduceLeft(_ + _)
		println(a)
	}

}

package day03
import scala.math._
/**
 * @author: lmx
 * @create: 2019/12/9
 **/
object test3 {

	def main(args: Array[String]): Unit = {
		val num = 3.14
		val fun = ceil _
		val aa = Array(3.14,2.13,1.43).map(fun)
		println(aa)


	}
}

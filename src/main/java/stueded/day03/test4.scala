package stueded.day03
import scala.math._
/**
 * @author: lmx
 * @create: 2019/12/9
 **/
object test4 {

	def main(args: Array[String]): Unit = {

		val a =valuefun1(ceil)

		println(a)

	}

	def valuefun1(f:(Double) => Double )  = f(0.25)
}

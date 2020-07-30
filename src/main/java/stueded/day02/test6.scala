package stueded.day02

/**
 * @author: lmx
 * @create: 2019/12/6
 **/
object test6 {

	def main(args: Array[String]): Unit = {
		var myCounter = new Counter
		myCounter.increment()
		println(myCounter.current)
	}
}

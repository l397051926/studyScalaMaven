package stueded.day01

/**
 * @author: lmx
 * @create: 2019/12/5
 **/
class test4 {
	def main(args: Array[String]): Unit = {
		print(" 3 + 5 = " + addValue(3,5) )
	}

	def addValue(a: Int, b: Int): Int = {
		var sum: Int = 0;
		sum = a + b;
		return sum;
	}
}

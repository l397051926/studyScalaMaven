package study.day02

/**
 * @author: lmx
 * @create: 2020/7/31
 **/
object Test4 {

	def main(args: Array[String]): Unit = {

		def test(f: (Int) => Unit) = {
			f(10)
		}

		def f1(i: Int) = {
			println(i)
		}

		test(f1)

		test(b => {
			println(b)
		})
		test(println(_))
		test(println)
		println(" ------------------------------- ")

		def f2(f: (Int, Int) => Int): Int = {
			f(10,10)
		}

		println(f2( (x:Int, y:Int) => x+y ))
		println(f2( (x, y) => {x+y} ))
		println(f2( (x, y) => x+y ))
		println(f2( _+_ ))


	}

}

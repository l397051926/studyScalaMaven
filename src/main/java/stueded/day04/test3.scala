package stueded.day04

/**
 * @author: lmx
 * @create: 2020/5/22
 **/
object test3 {

	def main(args: Array[String]): Unit = {
		var z = Array("Runoob", "Baidu", "Google")
		z(2)="@3"
		for ( x <- z ) {
			println( x )
		}
	}

}

package stueded.day02

/**
 * @author: lmx
 * @create: 2019/12/6
 **/
object test2 {

	def main(args: Array[String]): Unit = {
		for (i <- 1 to 10){
			print(i)
		}
		println()
		for (i <- 1 to 10) print(i + " ")
		println()
		for (i <- 1 to 3 ; j <- 1 to 3) print(i*10 + j + " ")
		println()
		for (i <- 1 to 3 ; j <- 1 to 3 if (i != j)) print(i*10 + j +" ")
		println()
		for (i <- 1 to 3 ; form = 4 -i ; j <- form to 3) print( i*10 + j + " " )

	}
}

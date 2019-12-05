package day01

/**
 * @author: lmx
 * @create: 2019/12/5
 **/
object test6 {
	def main(args: Array[String]): Unit = {
		for (i <- 1 to 10){
			println( i + " 的阶乘是: " + factorial(i) )
		}
	}

	def factorial( n:BigInt ): BigInt ={
		if( n < 1){
			1
		}else{
			n * factorial(n-1)
		}
	}
}

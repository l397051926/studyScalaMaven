package day02

/**
 * @author: lmx
 * @create: 2019/12/6
 **/
object test3 {

	def fun1(str:String,left:String = "[", right: String = "]") = left + str + right

	def fun2(args : Int*): Int ={
		var result = 0
		for (arg <- args) result+=arg
		result
	}

	def main(args: Array[String]): Unit = {
		println(fun1("Aaa"))
		println(fun2(1,3,4,34,5))
	}

}

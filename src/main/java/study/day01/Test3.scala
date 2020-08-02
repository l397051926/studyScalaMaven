package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 *         变量
 **/
object Test3 {
	// 如果在外部声明会增加 final
	val sex : String = "nan"

	def main(args: Array[String]): Unit = {
		// 声明变量必须赋值
		var name : String = "zhangsan"
		var age : Int = 10
//		var c : Char = "C"
		var b : Boolean = false

		age = 20
		//使用 var 变量 是真的变量
		//使用 val 变量 无法修改， 属于常量
		val valname : String = "lisi"


	}


}

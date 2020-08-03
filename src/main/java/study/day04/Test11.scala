package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test11 {

	//switch
	// _ 初始值
	// _ 导包*
	// _ 代替方法参数
	// _ matich default
	def main(args: Array[String]): Unit = {

		val oper = '#'
		val v1 = 20
		val v2 = 10
		var res = 0
		oper match {
			case '+' => res = v1 + v2
			case '-' => res = v1 - v2
			case _ => println(s"operator $oper")
		}

	}

	//apply 传值代替 构造方法
	//unapply  逆推传参数值
	//相反的两个方法 对象提取器


}

package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test8 {

	def main(args: Array[String]): Unit = {

		//隐士值
		implicit var name = "wangwu"

		//隐士参数
		def user(implicit name: String = "zhangsan"): Unit ={
			println(s"this is name is $name")
		}

		//隐士调用
		user
		//如果加 括号 就不能使用隐士值
		user()
	}

}

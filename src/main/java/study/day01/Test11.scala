package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test11 {

	def main(args: Array[String]): Unit = {
		//采用自动推断功能

		//明确标识无返回，就算有返回   --- 怎么简单怎么开发
		def test(): Unit = {
			"abcd"
		}
		println(test())

		println("---------------------")

		def test1() = {
			"zhangsan"
		}
		println(test1())
		//只有一个函数可以省略 大括号
		println("-----------------------")
		def test2() = "lisi"

		println(test2())

		// 没有参数可以省略 小括号
		println("------------------------")

		def test3 = "wangwu"

		println(test3)
		// 明确没有返回值 可以省略 =

		def test4() { "zhangsan"}
		def test5 {"zhangsan"}

		//匿名函数
		() -> {println("zhangsan")}


	}

}

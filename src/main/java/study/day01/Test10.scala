package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test10 {

	def main(args: Array[String]): Unit = {

		//函数式编程 函数入参 出参 函数功能  思想
		// 函数式编程， 声明函数  调用函数
		// method function 区别， method 是属于对象的 属于某个类不可以单独出现，而fuction 是可以独立存在 独立使用
		def test(s: String): Unit = {
			println(s)
		}
		test("zhangsan")
		//无参无返回
		def aaa(): Unit = {
			println("zhangsan")
		}
		// 有参 无返回值  没有重载的概念
		def bbb(s : String) :Unit = {
			println(s)
		}
		//有参 有返回值
		def ccc(s : String) : String = {
			return s
		}
		println(ccc("lisi"))
		//无参无返回
		def ddd() : String = {
			return "haha"
		}
		println(ddd())

		//scala 没有throws关键字 所有函数中如果有异常发送，也不需要在函数声明抛出异常



	}
}

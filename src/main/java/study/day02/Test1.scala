package study.day02

/**
 * @author: lmx
 * @create: 2020/7/31
 **/
object Test1 {

	def main(args: Array[String]): Unit = {

		//可变参数
		def test(name : String*): Unit ={
			println(name)
		}

		test("zhangsan", "lisi")

		//默认参数
		def test1(name :String ,age :Int = 20): Unit ={
			println(s"name=$name, age = $age")
		}
		test("zhangsan")
		//调用函数时 是从前到后 从左到又

		//带名参数
		def test2(name2 : String= "lisi" , name1 : String): Unit ={
			println(s"$name1 - $name2")
		}
		test2(name1 = "zhangsan")


	}

}

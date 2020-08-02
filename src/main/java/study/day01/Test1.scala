package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
/**
 * object 是伴生对象 ，伴生类型都可以通过类名访问，类似 静态属性
 */
object Test1 {

	def main(args: Array[String]): Unit = {
		println("hello world")
		hello("zhang san")
	}

	def hello(name: String): Unit = {
		println(name)
	}


}

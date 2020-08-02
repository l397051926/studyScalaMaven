package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
/**
 * scala 构造方法两种 一个主要构造方法 一个是辅助构造方法
 * scala  可以通过辅助构造方法 构造对象 但是辅助必须调用主要构造方法
 */
object Test4 {

	def main(args: Array[String]): Unit = {
//		val user = new User09("zhangsan")
		val user = new User09()
		println(s"user=$user")

	}

}

/**
 * 类后面的 括号就是构造方法 主要构造方法
 * 默认
 * @param s
 */
class User09(s: String){

	println(s"s = $s")

  	//辅助构造方法 --
	//构造方法调用其他构造方法 需要声明过， 有顺序
	def this(){
		this("wangwu")
	}

}

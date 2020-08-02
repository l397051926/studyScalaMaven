package study.day02

/**
 * 面向对象语言
 * @author: lmx
 * @create: 2020/7/31
 **/
object Test5 {

	def main(args: Array[String]): Unit = {
		val user = new User()
		user.userName = "zhangsan"
		println(user.userName)
		println(user.login())
	}

}

/**
 * scala 默认属性是私有的 提交了公共的set get 方法
 */
class User {
	var userName :String = _
	var age : Int = _

	def login()={
		true
	}

}

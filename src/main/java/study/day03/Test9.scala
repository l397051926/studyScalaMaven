package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test9 {

	def main(args: Array[String]): Unit = {

		var user = new User4
		user.select()
		user.delete()

	}

	//隐士类 方便扩展而已
	//也可以放在 伴生对象上
	implicit class Person(user4: User4){
		def delete(): Unit ={
			println("delete")
		}
	}

}


class User4{
	def select()={
		println("select")
	}
}

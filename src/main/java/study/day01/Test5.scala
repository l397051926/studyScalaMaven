package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test5 {

	def main(args: Array[String]): Unit = {
		val dog = new Dog
		dog.name = "aaa"
		println(dog.name)
	}

}

class Dog {
	var name = ""
}

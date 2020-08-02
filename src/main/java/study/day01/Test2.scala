package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test2 {

	def main(args: Array[String]): Unit = {
		println("test print")
		val name = "aaa"
		val age = 1
		val url = "www.baidu.com"
		println("name:" + name + "age:" + age + "url:" + url)
		print("name:" + name + "age:" + age + "url:" + url + "\n")
		//格式化方式
		printf("name: %s, age: %d, url: %s + \n", name, age, url)
		//插值字符串
		println(s"name=${name}, age=${age}, url=${url}")
		println(s"name=${name}, age=${age}, url=${url}")
		println(raw"name=${name}, age=${age}%.2f, url=${url}")

	}

}

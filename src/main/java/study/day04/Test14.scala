package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test14 {

	def main(args: Array[String]): Unit = {
		//协变  逆变

	}

}
class Person1{

}
class User1 extends Person1{

}
class Child1 extends User1{

}
//在类型上面 + User1 协变  -User1  逆变
class Test[User1]{

}

package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test13 {

	/**
	 * 泛型
	 * @param args
	 */
	def main(args: Array[String]): Unit = {

		test(new Person)
		test1(new User)
		test2(new Person)
	}

	def test[T](t: T): Unit ={
		println(t)
	}

	//上线
	def test1[T <: User](t: T)={
		println(t)
	}
	// 没有下线 - 所以什么都可以传
	def test2[T >: User](t: T) = {
		println(t)
	}

}

class Person{

}
class User extends Person {

}
class Student extends User {

}

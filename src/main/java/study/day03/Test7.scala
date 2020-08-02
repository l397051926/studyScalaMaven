package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test7 {

	def main(args: Array[String]): Unit = {

		implicit def transforOperator(mysql: Mysql): Operator ={
			new Operator
		}

		val mysql  = new Mysql
		mysql.select()
		mysql.delete()


	}

}

class Operator{
	def delete()={
		println("delect")
	}
}

class Mysql{
	def select(): Unit ={
		println("select")
	}
}

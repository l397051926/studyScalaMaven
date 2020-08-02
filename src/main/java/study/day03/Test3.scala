package study.day03

import scala.beans.BeanProperty

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test3 {

	def main(args: Array[String]): Unit = {
		var user = new User
		user.getName
	}
}

class User{

	@BeanProperty
	var name:String = _

}

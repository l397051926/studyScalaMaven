package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
class Test1 {

}

/**
 * scala 四种访问权限
 * public  缺省的
 * proceted  父子类访问
 * private 只能自己访问  半生类 伴生对象 是可以访问的
 * default private[package] 指定包可以访问
 * apply
 */
package p1{

	package p2{
		class UserP2{
			var userName = "zhangsan"
			protected var password = "123456"
			private var address = ""
			private[p2] var email = ""
		}
	}

	package p3{

		import study.day03.p1.p2.UserP2

		class Emp1{
			def test() = {
				var user = new UserP2()
				user.userName
			}
		}

	}

	package p4{

		import study.day03.p1.p2.UserP2

		class Emp2 extends UserP2 {
			def test() = {
				}
		}
	}


}

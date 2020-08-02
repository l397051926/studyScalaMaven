package study.day02

/**
 * @author: lmx
 * @create: 2020/7/31
 **/
object Test2 {

	def main(args: Array[String]): Unit = {
		//scala 是完全面向对象语言
		//函数可以赋值给变量
		// 函数可以作为参数使用
		// 函数 可以作为返回值

		def f(): Unit = {
			println("function f")
		}

		def f0() = {
			// 直接返回函数需要增加 _  这个特殊符号 才可以返回一个函数
			f _
		}

		f0()()

		println("------------------------------")

		def f1(i: Int) = {
			def f2(j: Int) = {
				i * j
			}

			f2 _
		}

		println(f1(1)(2))

		//闭包 ， 在函数1 使用完之后  函数1 中嵌套的函数2  ，会将 函数1 的值传到函数2中的数值，改变了函数1的属性生命周期
		println("-------柯里化------------")

		def f3(i: Int)(j: Int) = {
			i * j
		}

		println(f3(3)(2))
		println("-------参数传函数--------")

		//() =>Unit
		def f4(f: () => Int) = {
			f() + 10
		}

		def f5(): Int = {
			5
		}

		println(f4(f5))

		println("---------使用匿名函数--------")

		def f6(f: () => Unit) = {
			f()
		}

		f6(() => {
			println("xxxxxxxx")
		})
	}

}

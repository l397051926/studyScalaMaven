package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test6 {
	//隐士转换

	def main(args: Array[String]): Unit = {
		//隐士转换规则
		//在相同作用域中不能有相同转换规则
		 implicit def transform(d : Double): Int ={
			d.toInt
		}
		var i :Int = 5.0
		println(i)
	}
}

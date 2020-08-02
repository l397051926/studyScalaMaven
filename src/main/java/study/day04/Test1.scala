package study.day04

import scala.collection.mutable.ArrayBuffer

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test1 {

	/**
	 * scala 集合两种类型  1. 可变 mutable 2.不可变 iimmutable
	 * 数组 Array[String] 创造方法
	 *
	 */
	def main(args: Array[String]): Unit = {
		//创建数组
		val ints: Array[Int] = Array(1,2,3,4,5)
		println(ints(0))
		//数组的长度
		println(ints.length)
		//用逗号分隔 打印出来
		println(ints.mkString(","))
		//用 for 循环写
		for (elem <- ints) {
			println(elem)
		}
		//foreach 方式
		ints.foreach( (x:Int) => print(x))
		println("----------------")
		ints.foreach(println(_))
		//如果只有一个参数 _ 也可以省略
		ints.foreach(println)
		//改变参数
		ints.update(1,5)
		println(ints.mkString(","))

		//增加一个参数
		val ints1 = ints:+6
		val ints2 = 6+:ints
		println(ints1.mkString(","))
		println(ints2.mkString(","))


		//可变数组
		val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)
		arrayBuffer(0) = 9
		println(arrayBuffer.mkString(","))
		//修改  循环 都是差不多
		//增加数据
		arrayBuffer+=9
		println(arrayBuffer.mkString(","))
		//可变 和不可变相互专户
		val buffer1 = arrayBuffer.toArray
		val buffer = ints.toBuffer

	}

}

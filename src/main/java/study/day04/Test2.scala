package study.day04

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
object Test2 {

	def main(args: Array[String]): Unit = {

		//seq  序列
		//不可变
		val list = List(1,2,3,4)
		val list2 = List(5,6,7,8)
		//通过索引获取数据
		println(list(1))
		//增加数据
		val list1 :List[Int] = list:+1
		println(list1.mkString(","))
		val list3: List[Int] = list ++ list2
		// :: 运算 是从 右到左 等于增加操作
//		list :: 1 :: 2
		// ::: 三个冒号 是 可以 集合 和集合 相加

		//特殊集合
		List()
		Nil // 空集合

		//修改操作
		list.updated(1,4)
		//删除数据 丢弃数据 从0 开始 丢弃几个数据
//		list.drop()

		//可变集合
		val ints: ListBuffer[Int] = ListBuffer(1,2,3,4)
		//增删改查  功能类似
		list.head
		list.tail
		list.last
		list.init

		// queue 队列 一定是可变的
		val queue: mutable.Queue[Int] = mutable.Queue(1,2,3,4)
		queue.enqueue(5)
		queue.dequeue()
		println(queue.mkString(","))

	}




}

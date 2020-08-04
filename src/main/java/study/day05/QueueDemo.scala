package study.day05

import com.sun.jmx.remote.internal.ArrayQueue

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

/**
 * @author: lmx
 * @create: 2020/8/3
 * 队列
 * 队列是有序列表 分为 maxSize front 标识队列 头 rear 数据输入值
 * front 初始值为01 标识队列指向队首， 不包含头元素， 也就是说指向 队列头元素的前一个位置
 * rear 初始化为-1 指向队尾的 包含最后的元素
 * 常见数据结构 增加 addQueue  删除 deleteQueue 修改 updateQueue 展示getQueue
 * 辅助方法 是否满了isFull  是否空了isEmpty
 */
object QueueDemo {

	/**
	 * 数据结构分为两大类
	 * 	1. 线性结构 以为数组 队列 链表 栈 一一对应的关系
	 * 	2. 非线性结构 二位数组 多维数组 广义表 树 森林 图
	 * @param args
	 */

	def main(args: Array[String]): Unit = {
		val queue = new ArrayQueue(3)
		var key = ""
		while (true){
			println()
			println("请输入参数")
			println("show : 显示队列")
			println("add ：增加一条数据")
			println("get ： 获取一条数据")
			println("peek : 获取头元素" )
			println("exit : 退出")
			key = StdIn.readLine()
			key match {
				case "show" => queue.show()
				case "add" => {
					println("请输入一个数")
					val num = StdIn.readInt()
					queue.addArray(num)
				}
				case "get" =>{
					val res = queue.get()
					if(res.isInstanceOf[Exception]){
						println(res.asInstanceOf[Exception].getMessage)
					}else{
						println(s"取出的数据: $res")
					}
				}
				case "peek" =>{
					val res = queue.peek()
					if(res.isInstanceOf[Exception]){
						println(res.asInstanceOf[Exception].getMessage)
					}else{
						println(s"当前队首的元素为: $res")
					}
				}
			}
		}
	}

}

class ArrayQueue(val arrMaxSize : Int){
	val maxSize = arrMaxSize
	var front = -1
	var rear = -1
	private val values =new Array[Int](maxSize)

	//队列是否满了
	def isFull(): Boolean = {
		rear == maxSize -1
	}

	//队列是否空了
	def isEmpety: Boolean = {
		front == rear
	}

	//增加数据 考虑循环操作
	def addArray(value: Int): Unit ={
		if(isFull()){
			println("队列已经满了")
			return
		}
		rear +=1
		values( rear % maxSize ) = value
	}

	def show(): Unit ={
		if(isEmpety){
			println("队列是空的")
			return
		}
		for (i <- front+1 to rear){
			println(s"$i = ${values(i)}")
		}
	}

	//返回队首 peek
	def peek(): Any ={
		if(isEmpety){
			return new Exception("元素列表为空")
		}
		values((front + 1) % maxSize )
	}
	//获取数据
	def get(): Any = {
		if (isEmpety){
			return new Exception("元素列表为空")
		}
		front += 1
		values(front % maxSize)
	}
}

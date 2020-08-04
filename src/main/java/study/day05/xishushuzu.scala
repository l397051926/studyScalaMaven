package study.day05

import scala.collection.mutable.ArrayBuffer

/**
 * @author: lmx
 * @create: 2020/8/3
 *          稀疏数组
 **/
object xishushuzu {

	def main(args: Array[String]): Unit = {
		//先创作一个二维数组
		val rows = 11
		val cols = 11
		val chessMap1 = Array.ofDim[Int](rows, cols)

		chessMap1(1)(2) = 1
		chessMap1(2)(3) = 2
		for (row <- chessMap1) {
			for (item <- row) {
				print(s" $item ")
			}
			println()
		}
		//压缩
		//1. 创建 arrayBuffer 动态参加数据
		//2. 用node 表示一个数据节点
		val sparseArray = ArrayBuffer[Node]()


		//先放入第一行数据
		sparseArray.append(new Node(rows, cols, 0))
		//遍历棋盘， 如果是非0的值 添加node节点
		for (i <- 0 until chessMap1.length) {
			for (j <- 0 until chessMap1(1).length) {
				if (chessMap1(i)(j) != 0) {
					sparseArray.append(new Node(i, j, chessMap1(i)(j)))
				}
			}
		}
		for (elem <- sparseArray) {
			println(s"${elem.row} ${elem.col} ${elem.value}")
		}

		//将稀疏数组 恢复期盼
		val node = sparseArray(0)
		val chessMap2 = Array.ofDim[Int](node.row, node.col)
		for(i <- 1 until sparseArray.length){
			val n = sparseArray(i)
			chessMap2(n.row)(n.col) = n.value
		}
		// 恢复效果
		for (row <- chessMap2) {
			for (item <- row) {
				print(s" $item ")
			}
			println()
		}

		/**
		 * 稀疏数组 总结
		 * 1.
		 */

	}

}

class Node(val row: Int, val col: Int, val value: Int) {

}


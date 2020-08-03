package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test7 {

	def main(args: Array[String]): Unit = {
		val list = List(1, 2, 3, 4, 1, 3)
		//求和
		println(list.sum)
		//最大值
		println(list.max)
		//最小值
		println(list.min)
		//乘集
		println(list.product)
		//反转 无排序
		println(list.reverse)
		//分组 (通过指定返回值 分组)
		val goup = list.groupBy(x => x)
		goup.foreach(t => println(t._1 + ":" + t._2))
		//排序 按照指定规则
		list.sortBy(x => x)
		//排序 按照逻辑排序
		val listsort = list.sortWith((x, y) => x < y)
		println(listsort.mkString(","))

		//map  映射 每个元素转换另一个
		val tuples = list.map(x => (x, x))
		println(tuples.mkString(","))
		println(list.map(x => (x, 1)).groupBy(t => t._1).map(t => (t._1, t._2.size)).mkString(","))

		//word count
		val wordList = List("hello", "hello", "world", "world", "java", "scala", "scala", "kafka", "hbase")

//		println(wordList.map(x => (x, 1)).groupBy(t => t._1).map(t => (t._1, t._2.size)))

		//flatmap 扁平化
		//filter
		println(list.filter(x => x > 2).mkString(","))
		//zip 拉链
		val list1 = List(1,2,3)
		val list2 = List(4,5,6)

		val tuple: List[(Int,Int)] = list1.zip(list2)
		println(tuple.mkString(","))

		//并集合
		println(list1.union(list2))
  		//交际 interset
		// 差集 diff 保留谁 谁在前面
	}

}

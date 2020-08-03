package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test6 {

	/**
	 * 元组
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		//元素的组合
		//元组最多的数据是 22

		val tuple: (String, Int, String) = ("zhangsan", 111 , "lisi")
		println(tuple._1)
		println(tuple._2)
		println(tuple._3)

		//循环遍历
		for( element <- tuple.productIterator){
			println(element)
		}

		println("------------------------")
		//如果 元组数据只有两个 叫 对偶
		val tupleMap: Map[Int, String] = Map( (1,"a") )
		tupleMap.foreach( t => println(t._1) )

	}

}

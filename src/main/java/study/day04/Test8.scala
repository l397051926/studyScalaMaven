package study.day04

import scala.io.Source

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test8 {

	def main(args: Array[String]): Unit = {
		//word count
		val list = List( ("hello scala world", 4), ("hello world", 3), ("hello hadoop", 2), ("hello hbase", 1) )
		val value: List [(String, Int)] = list.flatMap(t=> t._1.split(" ").map(x=>(x, t._2)))
		println(value.groupBy(t => t._1).toList.map(t => (t._1, t._2.map(x=>x._2).sum))
		  .sortWith((l,r)=>l._2>r._2).mkString(","))

		//mapvalues 针对map 的values  进行处理

		//从文件获取 数据
		Source.fromFile("word.text").getLines().toList
	}

}

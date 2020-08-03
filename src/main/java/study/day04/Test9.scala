package study.day04

/**
 * @author: lmx
 * @create: 2020/8/2
 **/
object Test9 {

	def main(args: Array[String]): Unit = {

		//reduce 归约  化简
		val list = List(1,2,3,4)
		println(list.reduce(_ + _))
		println(list.reduceLeft(_ - _))
		println(list.reduceRight(_-_))

		//fold 折叠 对集合数据进行整理 最后返回一个结果,只不过会先提供一个值
		list.isInstanceOf[List[Int]]
		println(list.fold(10)(_+_))
		//保留过程结果
		list.scan(10)(_-_)


	}


}

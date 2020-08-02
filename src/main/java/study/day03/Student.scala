package study.day03

/**
 * @author: lmx
 * @create: 2020/8/1
 **/
class Student {
	var name:String = _
}

object Student{
	// scala 特有方法 提供自动生成伴生对象
	def apply (): Student = new Student()

}

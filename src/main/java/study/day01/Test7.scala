package study.day01

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
object Test7 {

	/**
	 * 流程控制
	 * @param args
	 */
	def main(args: Array[String]): Unit = {
		//顺序控制
		// 但分支

		val flag = true

		if(flag){
			println("true")
		}
		//双分支
		if(flag){
			println("true")
		}else{
			println(false)
		}

		val a = "a"

		if( "a".eq(a)){
			println("a")
		}else if( "bbb".eq(a)){
			println("bbb")
		}else{
			println("ccc")
		}


	}

}

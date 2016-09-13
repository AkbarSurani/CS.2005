object Q2{
	def Split(list: List[Int]):(List[Int], List[Int]) ={ 
		list match{
			case Nil => (Nil,Nil)
			case hd::tail if list.length == 1 => (List(hd),Nil)
			if list.length > 1 => (hd::Split(tail.init)._1, Split(tail.init)._2:::List(list.last))
		}
	}
	def main(args: Array[String]): Unit= 
		{
			println("The list (3,54,23,12,11,34) will give " + Split(List(3,54,23,12,11,34)))
		}
}
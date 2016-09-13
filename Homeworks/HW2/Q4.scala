object Q4 {

def sortInsert(list: List[Int], m: Int):List[Int]=
	list match {
		case Nil => m::list
		case hd::rest if m <= hd => m::list
		case hd::rest if hd < m => hd::sortInsert(rest,m)
	}

def InsertionSort(list:List[Int]):List[Int]=
{
	list match {
		case Nil => Nil
		case hd::rest => {
			sortInsert(InsertionSort(rest),hd)
			}
		case _ => list
	}
}

def main(args: Array[String]): Unit= 
	{
		println("Sorted list for (17, 1, 24, 35, 16, 29) is:" + InsertionSort(List(17, 1, 24, 35, 16, 29)))
}
}
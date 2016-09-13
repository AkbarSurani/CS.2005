object Q4 {
def InsertionSort(list:List[Int]):List[Int]=
{
	list match
	{
	case Nil => Nil
	case hd => hd
	case hd::rest => 	
		{sortInsert(InsertionSort(rest),hd)
		}
	}
}
}
def main(args: Array[String]): Unit= 
	{
}
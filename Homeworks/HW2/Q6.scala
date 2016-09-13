object Q6
{
def quickSort(list:List[Int]):List[Int]
list match {
	case Nil => Nil
	case hd::rest => pivotSort(list,hd) 
}	
}

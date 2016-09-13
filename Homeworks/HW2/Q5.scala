object Q5 {
var lst1=()
var lst2=()
def pivotSort(list:List[Int], x:Int):List[Int]=
{
list match 
{
case hd::rest => if (hd<x) 
					lst1=lst1::hd;
					pivotSort(rest,x)
				else 
				lst2=lst2::hd;
				pivotSort(rest,x)
case Nil => x	
}
var result=lst1::x::lst2
println(result)	
}
}

def main(args: Array[String]): Unit= 
	{
}
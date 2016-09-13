object Q7 {
	def fastPower(x:Int, n:Int):Int=
	{
		n match{
		case 0 => 1
		case n if (n%2==0) => fastPower(X,n/2)*fastPower(X,n/2)
		case _ => X*fastPower(X, n-1)
	}
}

def main (args: Array[String]) {
println (fastPower(2,3))
}
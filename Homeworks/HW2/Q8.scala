object Q8 {
	def permutationGen(list:List[Int]):List[List[Int]]=
	{
		if (list=Nil) Nil
		else {if (list==hd::rest) {hd::permutationGen(rest), permutationGen(rest)::hd}}
	}
}

def main(args:Array[String]):Unit=
{
	println("Permutations of [1,4,6,7] are:" + permutationGen([1,4,6,7]))
}
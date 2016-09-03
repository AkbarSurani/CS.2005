read -p ""[DInput a file name[C[D" v;
cat $fielname < $v | xargs -n1  | sort | uniq -c

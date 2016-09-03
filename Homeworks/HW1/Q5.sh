for i in *.txt;
do mv $i $(echo "$i" | awk '{print toupper($0)});
done

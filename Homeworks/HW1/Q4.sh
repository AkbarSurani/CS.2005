find . -name '*.txt' | xargs -I{} grep the {} >> 3.txt
wc 3.txt

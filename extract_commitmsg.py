


import os
import sys
file_path = sys.argv[1];

print ( file_path);

body_start=False
body_end=False
line_start=False
prev_line=""

with  open ( file_path, encoding='utf-8' ) as infile:
    for line in infile:
        
        if  "---" ==  line.splitlines()[0]   :
            body_end=True
        if body_start and  (not  body_end):        
            print ( line, end=""  ) 
        if "Subject"  in line:
            discard,subject = line.split("] ",1) 
            next_line= next(infile) 
            if next_line.splitlines()[0]  != "":
                print ( subject.splitlines()[0], end="")
                print ( next_line, end="")
            else: 
                print (next_line) 
            body_start=True
        if body_end:
            break

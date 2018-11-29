#!/usr/bin/env python3

import subprocess
import sys

if sys.hexversion < 50659328:
    print ('need version 3.5.x')
    sys.exit();

class TwoTee(object):
    def __init__(self,stdbufs,stdolog_file,stdelog_file):
        stdobuf= stdbufs [0]
        stdebuf= stdbufs [1]
        self.terminal = sys.stdout.buffer
        self.olog = open(stdolog_file, "wb")
        self.elog = open(stdelog_file, "wb")
        self.terminal.write(stdobuf)
        self.terminal.write(stdebuf)
        sys.stdout.buffer.flush()
        self.olog.write(stdobuf)
        self.elog.write(stdebuf)

mkcmd = subprocess.Popen( [sys.path[0]+ '/12.sh' ] ,stdout=subprocess.PIPE, stderr= subprocess.PIPE );

output = mkcmd.communicate (); 
  
TwoTee(output,'stdout.log','stderr.log')

sys.exit()
mkout = subprocess.Popen(['tee' ,'stdout.log'],  stdin=mkcmd.stdout);
mkerr = subprocess.Popen (['tee' ,'stderr.log'], stdin=mkcmd.stderr);
mkcmd.wait()
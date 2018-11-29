#!/usr/bin/env python3

import subprocess
import sys

if sys.hexversion < 50659328:
    print ('Need version 3.5.x')
    sys.exit();

class TwoTee(object):
    def __init__(self, cmpltd_cmd,stdolog_file,stdelog_file):
        stdobuf=cmpltd_cmd.stdout
        stdebuf= cmpltd_cmd.stderr
        self.terminal = sys.stdout.buffer
        self.olog = open(stdolog_file, "wb")
        self.elog = open(stdelog_file, "wb")
        self.terminal.write(stdobuf)
        self.terminal.write(stdebuf)
        self.olog.write(stdobuf)
        self.elog.write(stdebuf)

find_test_command = [ 'bash', '-c', './12.sh > >(tee stdout.log) 2> >(tee stderr.log >&2)'
]
testcmd=subprocess.run(find_test_command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=False)

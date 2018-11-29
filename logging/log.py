#

import os
import sys
from select import select
from subprocess import Popen, PIPE


with Popen(['stdbuf', '-oL', '-e0', './12.sh', 'www.google.com'],
    stdout=PIPE, stderr=PIPE) as p:
    readable = {
        p.stdout.fileno(): sys.stdout.buffer, # log separately
        p.stderr.fileno(): sys.stderr.buffer,
    }
    while readable:
        for fd in select(readable, [], [])[0]:
            data = os.read(fd, 1024) # read available
            if not data: # EOF
                del readable[fd]
            else: 
                readable[fd].write(data)
                readable[fd].flush()


olog = open('stdo.log', "wb")
elog = open('tdelog_file', "wb")
olog.write(p.stdout.fileno())

import random
import tempfile
from pathlib import Path

import os
import sys

def get_script_path():
    p = Path(sys.argv[0])
    return p.resolve().parent

tmpdir = tempfile.gettempdir()

workdir = f'file-demo. {random.randrange(100, 10000) }.txt'

wd = Path(tmpdir).joinpath(workdir)
cwd = Path.cwd()
sd = get_script_path()
print("cwd", cwd)
print ("script dir", sd)
print  ("workdir", wd  )# prints the current temporary directory

fpath = sd.joinpath('test-lines.txt',)

with open(fpath, 'r') as f:
    f_conts = f.readline()
    print(f_conts)
    size_bytes = 16

    f_conts = f.read(size_bytes)
    while len (f_conts ) > 0 :
        print(f_conts, end="**")
        f_conts = f.read(size_bytes)

with open(wd, 'w' ) as f:
    f.write('tesst-222.txt')
    f.seek(0)
    f.write('OWrite')

with open(fpath, 'rb' ) as rf:
    with open(wd, 'wb') as wf:
        chunk = 512
        rf_chunk = rf.read(chunk)
        while len(rf_chunk ) > 0 :
            wf.write(rf_chunk)
            rf_chunk = rf.read(chunk)





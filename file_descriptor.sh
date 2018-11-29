#!/bin/bash

# >&2 is standard error
# >&1 is standard output
for i in {1..3}
do
>&2 echo "$i error"
echo "$i info"
done

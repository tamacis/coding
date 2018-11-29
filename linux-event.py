 
from evdev import InputDevice
from select import select

dev = InputDevice('/dev/input/event9')

while True:
   r,w,x = select([dev], [], [])
   for event in dev.read():
       print(event)

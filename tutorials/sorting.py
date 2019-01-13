
from operator import attrgetter

list = [5, 2, 3, 1, 4]

print (sorted(list))

a = [5, 2, 3, 1, 4]
a.sort()

sorted({1: 'D', 2: 'B', 3: 'B', 4: 'E', 5: 'A'})

li = [n  for n in range(10)]
print(li)

print (sorted(li, reverse=True))

di = {'name' : 'test', 'age' : 10}
print ( sorted(di))

li = [n for n in range(-6,3)]
s_li = sorted(li, key=abs)
print(s_li)

class Employee:
    """A sample Employee class"""

    def __init__(self, first, last):
        self.first = first
        self.last = last

        print('Created Employee: {} - {}'.format(self.fullname, self.email))

    def __repr__(self):
        return self.first + self.last

    @property
    def email(self):
        return '{}.{}@email.com'.format(self.first, self.last)

    @property
    def fullname(self):
        return '{} {}'.format(self.first, self.last)


emp_1 = Employee('John', 'Smith')
emp_2 = Employee('Corey', 'Schafer')
emp_3 = Employee('Jane', 'Doe')

emps = [emp_1, emp_2, emp_3]

def e_sort(e):
    return e.last

s_emps = sorted(emps, key=e_sort)
l_emps = sorted(emps, key= lambda e: e.last, reverse=True)
a_emps = sorted(emps, key=attrgetter('first'))

print (s_emps)
print (l_emps)
print (a_emps)
import datetime

person = {
    'name' : 'Jsan',
    'age'  : 24
}

sentence = 'Name is {0[name]} and age is {0[age]},'.format(person)
print (sentence)

li = ("Pooas", 26)
sentence = 'Name is {0[0]} and age is {0[1]}r'.format(li)
print (sentence)

sentence = 'name is {name} and age is {age}'.format(name="test", age=225)
print (sentence)

sentence = 'name is {name} and age is {age}'.format(**person)
print (sentence)

for i in range(1,11):
    sentence = 'value is {:02}'.format(i)
    print (i,end='')

print
pi = 3.1324234234234
print ('pi apporx is {:.2f}'.format(pi))

sentence = '1 MB is equal to {:,} bytes'.format(1000**2)
print (sentence)

tdy = datetime.datetime.today

sentence = '{0:%B %d, %Y} fell on a {0:%A} and was the  err day of the year'.format(tdy)
print (sentence )
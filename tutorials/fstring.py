import datetime

p = {"name" : "Jane", "age" : "Someehwr"}

sentecne = f"Name is {p['name']} and age is {p['age']}"
print (sentecne)

tdy = datetime.datetime.now()

st = f"Today is {tdy:%B %d, %Y}"

print (st)
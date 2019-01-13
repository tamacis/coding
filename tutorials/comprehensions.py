
nums = [1,2,3,4,5,6,7,8,9,10]

# I want 'n' for each 'n' in nums
my_list = []
for n in nums:
  my_list.append(n)
print (my_list)

print ([n for n in nums])

my_list = map(lambda n: n*n, nums)
print (list(my_list))

my_list = filter(lambda n: n%2 == 0, nums)
print (list(my_list))

my_list = [(letter,num) for letter in 'abcd' for num in range (4)]
print(my_list)

# Dictionary Comprehensions
names = ('Bruce', 'Clark', 'Peter', 'Logan', 'Wade')
heroes = ('Batman', 'Superman', 'Spiderman', 'Wolverine', 'Deadpool')
print (list(zip(names, heroes)))

# I want a dict{'name': 'hero'} for each name,hero in zip(names, heros)
my_dict = { names:heroes for name,hero in  zip(names,heroes) }
# for name, hero in zip(names, heros):
#     my_dict[name] = hero
print (my_dict)

# If name not equal to Peter

# Set Comprehensions
pums = [1,1,2,1,3,4,3,4,5,5,6,7,8,7,9,9]
my_set = {n for n in nums}
print (my_set)


# Generator Expressions
# I want to yield 'n*n' for each 'n' in nums
nums = [1,2,3,4,5,6,7,8,9,10]


my_gen = (n*n for n in nums)

for i in my_gen:
    print (i)
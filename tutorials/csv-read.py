import csv

with open('names.csv', 'r') as csv_file:
    csv_reader = csv.DictReader(csv_file)
    fieldnames = ['first_name', 'last_name']
    for line in csv_reader:
            print(line)

with open('names.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file) 
    for line in csv_reader:
            print(line)
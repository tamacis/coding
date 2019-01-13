try:
    f = open('curruptfile.txt')
    var = bad_var
except FileNotFoundError as e:
    print('No file bro!')
except Exception as e:
    print('Error')
else:
    print(f.read())
    f.close()
finally:
    print("Executing Finally...")

print('End of program')
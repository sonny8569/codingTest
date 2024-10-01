def fiboNazi(value):
    global arr 
    if value == 0:
        return 0 
    elif value == 1 :
        return 1
    return fiboNazi(value -1) + fiboNazi(value -2)

arr = 0 
value = int(input())
print(fiboNazi(value))
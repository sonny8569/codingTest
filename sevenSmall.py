import random

def solution():
    list = [] 
    for i in range(9):
        value = int(input())
        list.append(value)
    list.sort()
    totalLength = sum(list)
    for i in range(9):
        for j in range(i+1 , 9):
            if totalLength -(list[i] + list[j]) == 100:
                one = list[i]
                two = list[j]
    list.remove(one)
    list.remove(two)
    list.sort()
    print(list)

solution()
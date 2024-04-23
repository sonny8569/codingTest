test_case = int(input())

for i in range(test_case):
    mount = int(input())
    stuffList =  list(map (int,input().split()))
    price = 0
    answer = 0  
    for value in stuffList[::-1]:
        if value >= price:
            price = value
        else :
            answer += price - value 
    print("#", i + 1, " ", answer)

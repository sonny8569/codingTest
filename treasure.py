def answer(arrayValue1, arrayValue2):
    answer = 0 
    arrayValue1 = sorted(arrayValue1)
    arrayValue2 = sorted(arrayValue2, reverse=True)
    
    for i, s in zip(arrayValue1, arrayValue2):
        answer += i * s
        
    return answer 

arrayLength = int(input())

arrayValue1 = list(map(int, input().split()))

arrayValue2 = list(map(int, input().split()))

print(answer(arrayValue1, arrayValue2))

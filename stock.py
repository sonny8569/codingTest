from collections import deque

def solution(prices):
    answer = []
    prices = deque(prices)
    for i in prices:
        count = 0 
        value = i 
        for j in range(i+1 , len(prices)-1):
            if value <= j:
                count +=1 
        answer.append(count)
    return answer

print(solution([1, 2, 3, 2, 3]))
print(solution([2, 2, 3, 1, 5]))

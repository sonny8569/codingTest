def solution(stick):
    answer = 1
    maxStick = stick[-1]
    for i in range(len(stick)-2,-1,-1):
        if stick[i] > maxStick:
            answer +=1 
    return answer

n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

print(solution(arr))
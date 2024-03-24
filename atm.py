def solution(people, dueTime):
    answer = 0 
    dueTime.sort()
    for i in range(1,people):
        dueTime[i] += dueTime[i-1]
    return sum(dueTime) 



print(solution(5,[3,1,4,3,2]))
def solution(arr):
    answer = []
    for item in arr : 
        if not answer:
            answer.append(item)
        elif answer[-1] != item :
            answer.append(item)
    return answer


print(solution([1,1,3,3,0,1,1]))
print(solution([4,4,4,3,3]))
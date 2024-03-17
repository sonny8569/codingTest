def solution(arr):
    answer = []
    for i in arr:
        if answer[-1:] == [i]: continue
        answer.append(i)
    print(answer)
    return answer

solution([1,1,3,3,0,1,1])
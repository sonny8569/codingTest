def solution(arr , divisor):
    answer = []
    arr.sort()
    for i in range(len(arr)):
        if arr[i] % divisor == 0:
            answer.append(arr[i])
    if len(answer) == 0:
        answer.append(-1)
    return answer

solution([5, 9, 7, 10] , 5)
solution([2, 36, 1, 3] , 1)
solution([3,2,6] , 10)
    
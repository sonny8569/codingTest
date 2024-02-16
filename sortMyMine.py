def solution(string ,n):
    answer = []
    answer =sorted(string , key = lambda x:(x[n],x))
    return answer

solution(["sun", "bed", "car"] , 1)
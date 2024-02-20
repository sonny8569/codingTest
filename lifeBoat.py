def solution(people, limt):
    answer = 0
    people.sort()
    start = 0
    end = len(people)-1
    while start <= end:
        if people[start] + people[end] <= 100:
            answer += 1
            start +=1
            end -= 1
        else :
            answer +=1
            end -= 1
    print(answer)    
    return answer

solution([70, 50, 80, 50] ,100)
# solution([70, 80, 50] ,100)
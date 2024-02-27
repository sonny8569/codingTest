def solution(s):
    newList = s.split(" ")
    newList = list(map(int, newList))
    newList.sort()
    answer = []
    answer.append(newList[0])
    answer.append(newList[-1])
    answer = list(map(str , answer))
    print(' '.join(answer))
    return (' '.join(answer))

solution("1 2 3 4")
solution("-1 -2 -3 -4")
solution("-1 -1")

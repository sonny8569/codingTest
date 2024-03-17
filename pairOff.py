def solution(s):
    answer = -1
    newStr = []
    for i in s:
        if len(newStr) == 0:
            newStr.append(i)
            continue
        if newStr[-1] == i:
            newStr.pop()
            continue
        newStr.append(i)
    if len(newStr) == 0:
        answer = 1 
    else :
        answer = 0
    return answer

solution("baabaa")
solution("cdcd")
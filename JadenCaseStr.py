def solution(s):
    answer = ''
    newList = s.split() 
    for i in range(0 , len(newList)):
        data = list(map(str,newList[i]))
        for j in range(0 , len(data)):
            if j == 0:
                answer += data[0].upper()
            else :
                answer += data[j].lower()
        if i == len(newList)-1 : 
            break
        answer += " "
    print(answer) 
    return answer

solution("3people unFollowed me")
solution("for the last week")
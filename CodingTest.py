def solution(stringData):
    answer = ""
    if(len(stringData) % 2 == 0):
        num = len(stringData) // 2 
        answer = stringData[num-1:num+1]
        return answer
    
    num = len(stringData)//2
    answer = stringData[num]
    return answer 

print(solution("qwer"))


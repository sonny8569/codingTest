def solution(s):
    answer = ''
    if len(s)%2==0:
        num = len(s) // 2 
        answer = s[num-1:num+1]
        print(answer)
        return answer 
    num = len(s)//2 
    answer = s[num]
    print(answer)
    return answer 

solution("qwer")
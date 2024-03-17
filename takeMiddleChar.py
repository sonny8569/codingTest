def solution(s):
    answer = ''
    if len(s)%2==0:
        num = len(s) // 2 
        answer = s[num-1:num+1]
        return answer 
    num = len(s)//2 
    answer = s[num]
    return answer 

solution("qwer")
solution("abcde")
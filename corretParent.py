def solution(s):
    answer = True
    list = [] 
    for i in s:
        if i =="(":
            list.append(1)
        else :
            if not list :
                return False 
            list.pop()
    if len(list) == 0:
        answer= True 
    else :
        answer = False 
    return answer 

# solution("()()")
# solution("(())()")
solution(")()(")
solution("(()(")
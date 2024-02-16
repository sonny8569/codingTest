def solution(absolutes,signs):
    answer = 0 
    for i in range(0 , len(absolutes)):
        if signs[i] == False:
            absolutes[i] *= -1
        answer += absolutes[i]
    
    print(answer)
    return answer 

# solution([4,7,12] ,[True,False,True] )
solution([1,2,3] ,[False,False,True] )
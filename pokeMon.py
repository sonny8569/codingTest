def solution(nums):
    answer = []
    limt = len(nums) // 2 
    mapData = {} 
    for i in nums:
        if i in mapData:
            mapData[i] +=1 
        else :
            mapData[i] = 1 

    for key , value in mapData.items():
        if len(answer) < limt :
            answer.append(key)
    return len(answer)
print(solution([3,1,2,3])) 
print(solution([3,3,3,2,2,4])) 
print(solution([3,3,3,2,2,2])) 

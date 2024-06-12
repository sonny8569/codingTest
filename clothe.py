from collections import defaultdict 

def solution(clothes):
    dic = {} 
    answer = 1 
    for item , cateogry in clothes :
        if cateogry not in dic :
            dic[cateogry] = 1 
        else :
            dic[cateogry] +=1

    for count in dic.values():
        answer *= (count + 1) 
    return answer - 1  


print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))
print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))
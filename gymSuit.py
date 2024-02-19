def solution(n , lost , reserve):
    new_lost = set(lost) - set(reserve)
    new_reserve = set(reserve) - set(lost)

    for i in new_lost :
        if i + 1 in new_reserve :
            new_reserve.remove(i+1)
        elif i -1 in new_reserve:
            new_reserve.remove(i-1)
        else :
          n-=1
    print(n)
    return n 
solution(5 , [2,4] ,[1,3,5])
solution(5 , [2,4] ,[3])
solution(3 , [3] ,[1])
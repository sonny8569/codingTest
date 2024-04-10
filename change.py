def solution(money):
    change = 0 
    while money > 0:
        if money % 5 == 0:
            change += money // 5  # money를 5로 나눈 몫을 더합니다.
            break
        else:
            money -= 2 
            change += 1  
        if money < 0:
            change = -1
            break 
    print(change) 

n = int(input())
solution(n) 
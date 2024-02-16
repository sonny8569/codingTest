def solution(x):
    a = []
    for i in str(x):
        a.append(int(i))
    value = sum(a)
    print(sum(a))
    if(x%value==0):
        print(True)
        return True
    print(False)
    return False

solution(10)
# solution(12)
# solution(11)
# solution(13)
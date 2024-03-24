def solution(dataList):
    answer =[]
    sortDataList = set(dataList)
    for i in sortDataList:
        if not i.isdecimal():
            answer.append(i)
    answer.sort()    
    answer.sort(key= len)
    print(answer)    

    return answer


solution(["13","but","i","wont","hesitate","no","more","no","more","it","cannot","wait","im","yours"])



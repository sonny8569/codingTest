def solution(s):
    english = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    answer = ""
    stringData = ""
    num = makeHashData(english)
    for i in s:
        stringData += i
        if stringData in num.values() or stringData in num.keys():
            answer += findValue(stringData , num)
            stringData =""
    return int(answer)

def findValue(s,num):
    for key ,value in num.items():
        if value == s:
            return key
        elif key == s:
            return key
    
def makeHashData(value):
    num = {} 
    for i in range(len(value)):
        num[str(i)] = value[i]
    return num
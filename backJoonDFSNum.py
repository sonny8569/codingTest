
def dfs(x ,y):
    if x<= -1 or x >= n or y <= -1 or y >= m :
        return False
    if graph[x][y] == 1:
        global count 
        count += 1 
        graph[x][y] = 0 
        dfs(x-1,y)
        dfs(x , y-1)
        dfs(x+1 ,y)
        dfs(x , y+1)
        return True 
    return False

n = int(input())
graph = [] 
for i in range(n):
    graph.append(list(map(int , input())))
m = len(graph)

result =0 ## 총 단지 갯수 
num = [] ## 단지 안의 호수 갯수 리스트 
count = 0 ## 호수 

for i in range(n):
    for j in range(m):
        if dfs(i , j)== True:
            result +=1
            num.append(count)
            count = 0 

num.sort() 
print(result)
for i in num:
    print(i)

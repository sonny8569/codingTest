from collections import deque

def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in sorted(graph[v]):
        if not visited[i]:
            dfs(graph, i, visited)

def bfs(graph , start , visited):
    que = deque([start])
    visited[start] = True 
    while que:
        v = que.popleft() 
        print(v , end ='')
        for i in graph[v]:
            if not visited[i]:
                que.append(i)
                visited[i] = True
# 입력 받기
n, m, start = map(int, input().split())

# 그래프 초기화
graph = []
for i in range(n + 1):
    graph.append([])

for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v) 
    graph[v].append(u)

# graph 출력
print("Graph:", graph)

# DFS 출력
# visited = [False] * (n + 1)
# dfs(graph, start, visited)
visited = [False] * (n+1)
bfs(graph ,start , visited)

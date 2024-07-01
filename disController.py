import heapq
import math
from collections import deque

def solution(jobs):
    answer = 0
    jobs = stordData(jobs)
    jobs = deque(jobs)
    answer = calculateData(jobs)
    return answer

def stordData(data): 
    data = sorted(data, key=lambda x: x[0])  # 요청 시간 기준으로 정렬
    return data 

def calculateData(data):
    currentTime = 0
    totalWaitTime = 0
    count = []
    jobHeap = []
    
    while data or jobHeap:
        # 현재 시간 이전에 요청된 모든 작업을 힙에 추가
        while data and data[0][0] <= currentTime:
            process = data.popleft()
            heapq.heappush(jobHeap, (process[1], process[0]))  # 작업 시간 기준으로 힙에 추가
        
        if jobHeap:
            workTime, startTime = heapq.heappop(jobHeap)
            currentTime += workTime
            totalWaitTime += (currentTime - startTime)
            count.append(totalWaitTime)
        else:
            # 힙이 비어있다면 다음 작업의 요청 시간으로 currentTime을 이동
            if data:
                currentTime = data[0][0]
    
    return math.floor(totalWaitTime / len(count))

print(solution([[[0, 3], [1, 9], [2, 6]]]))
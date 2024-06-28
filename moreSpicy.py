import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    
    while scoville[0] < K:
        if len(scoville) < 2:
            return -1
        answer += 1
        lowSpciy = heapq.heappop(scoville)
        middleLowSpciy = heapq.heappop(scoville)
        data = lowSpciy + (middleLowSpciy * 2)
        heapq.heappush(scoville, data)
    
    return answer

print(solution([1, 2, 3, 9, 10, 12] , 7))
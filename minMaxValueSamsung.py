T = int(input())

for test_case in range(1 , T+1) :
    number = list(map(int , input().split()))
    number.sort()
    min_value = number[0]
    max_value = number[-1]
    number.remove(min_value)
    number.remove(max_value) 
    # number.pop(0)
    # number.pop()
    data = int(sum(number) / len(number))
    print('#{} {}'.format(test_case, round(data)))


# #import sys
#sys.stdin = open("input.txt", "r")


# T = int(input())
# for tc in range(1, T+1):
#     nums = list(map(int, input().split()))
#     # [3, 17, 1, 39, 8, 41, 2, 32, 99, 2]

#     # 순서대로 정렬하고
#     nums.sort()
#     min_n = nums[0]
#     max_n = nums[-1]
#     nums.remove(min_n)
#     nums.remove(max_n)

#     avg = sum(nums)/len(nums)

#     # 최소 최대값 빼고
#     # 평균값구하고


#     print('#{} {}'.format(tc, round(avg)))
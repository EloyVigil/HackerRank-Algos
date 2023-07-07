def miniMaxSum(arr):
    min_sum = 0
    max_sum = 0
    length = len(arr)
    sorted_arr = sorted(arr)

    for i in range(length):
        if i < length - 1:
            min_sum += arr[i]
        if i > 0:
            max_sum += arr[i]

    print(min_sum, max_sum)

miniMaxSum([1, 2, 3, 4, 5])
def diagonalDifference(arr):
    difference = 0
    l = len(arr)
    primary = 0
    secondary = 0
    
    for i in range(l):
        primary += arr[i][i]
        secondary += arr[l - 1 - i][i]
    
    print("primary " + str(primary))
    print("secondary " + str(secondary))
    
    difference = secondary - primary
    
    return abs(difference)

print(diagonalDifference([[11, 2, 4], [4, 5, 6], [10, 8, -12]]))
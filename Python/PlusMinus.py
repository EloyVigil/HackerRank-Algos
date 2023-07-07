def plusMinus(arr):
    tempNumPositive = 0
    tempNumNegative = 0
    tempNumZero = 0
    length = len(arr)

    for i in range(length):
        if arr[i] < 0:
            tempNumNegative += 1
        elif arr[i] > 0:
            tempNumPositive += 1
        else:
            tempNumZero += 1

    positiveFraction = tempNumPositive / length
    print("Positive {:.6f}".format(positiveFraction))

    negativeFraction = tempNumNegative / length
    print("Negative {:.6f}".format(negativeFraction))

    zeroFraction = tempNumZero / length
    print("Zero {:.6f}".format(zeroFraction))


plusMinus([-4, 3, -9, 0, 4, 1])
plusMinus([1, 2, 3, -1, -2, -3, 0, 0])
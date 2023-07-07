def aVeryBigSum(ar):
    sum = 0
    for i in ar:
        sum = sum + i
    return sum

print(aVeryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]))
print(aVeryBigSum([1000000901, 1000090002, 1000000903, 1000090004, 1000090005]))
print(aVeryBigSum([1000, 10, 10000, 10999, 42]))
print(aVeryBigSum([2500, 2866, 0, 55837, 5067]))
print(aVeryBigSum([2000000001, 4000000002, 000000003, 14004, 10]))
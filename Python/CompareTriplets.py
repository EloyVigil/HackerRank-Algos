def compareTriplets(a, b):
    solution = [0, 0]
    for i in range(len(a)):
        if a[i] < b[i]:
            solution[1] += 1
        elif a[i] > b[i]:
            solution[0] += 1
        else:
            continue
    return solution

print(compareTriplets([1, 2, 3], [3, 2, 1]))
print(compareTriplets([1, 2, 3], [1, 2, 3]))
print(compareTriplets([19, 20, 30], [30, 22, 30]))
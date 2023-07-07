def breakingRecords(scores):
    best, worst = 0, 0
    best_score, worst_score = scores[0], scores[0]
    length = len(scores)
    for i in range(1, length):
        if scores[i] > best_score:
            best_score = scores[i]
            best += 1
        if scores[i] < worst_score:
            worst_score = scores[i]
            worst += 1
    return [best, worst]

print(breakingRecords([3, 4, 21, 36, 10, 28, 35, 5, 24, 42]))
print(breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1]))
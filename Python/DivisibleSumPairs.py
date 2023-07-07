def divisible_sum_pairs(n, k, ar):
    count = 0
    for i in range(n):
        for j in range(i+1, n):
            if (ar[i] + ar[j]) % k == 0:
                count += 1
    return count

# Example usage
ar = [1, 3, 2, 6, 1, 2]
k = 3
count = divisible_sum_pairs(len(ar), k, ar)
print(f"Number of pairs divisible by {k}: {count}")
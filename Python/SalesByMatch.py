def sock_merchant(n, ar):
    count = 0
    for i in range(n):
        if ar[i] is None:
            continue
        for j in range(i + 1, n):
            if ar[j] is None:
                continue
            if ar[i] == ar[j]:
                count += 1
                ar[i] = None
                ar[j] = None
                break
    return count

if __name__ == '__main__':
    ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
    pairs = sock_merchant(len(ar), ar)
    print(pairs) # output: 3
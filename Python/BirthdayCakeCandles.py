def birthdayCakeCandles(candles):
    maxAge = 0
    candleCount = 0
    length = len(candles)

    for i in range(length):
        if candles[i] < maxAge:
            continue
        if candles[i] > maxAge:
            maxAge = candles[i]
            candleCount = 1
        elif candles[i] == maxAge:
            candleCount += 1

    return candleCount

print(birthdayCakeCandles([3, 2, 1, 3]))
def countApplesAndOranges(s, t, a, b, apples, oranges):
    appleCount = sum(1 for x in apples if a + x >= s and a + x <= t)
    orangeCount = sum(1 for x in oranges if b + x <= t and b + x >= s)
    
    print(appleCount)
    print(orangeCount)
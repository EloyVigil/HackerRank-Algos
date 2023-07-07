def countingValleys(steps, path):
    valleys = 0
    elevation = 0
    
    for i in range(steps):
        if path[i] == "D":
            elevation -= 1
        else:
            if elevation == -1:
                valleys += 1
            elevation += 1
    
    return valleys

print(countingValleys(8, "UDDDUDUU"))
print(countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD"))
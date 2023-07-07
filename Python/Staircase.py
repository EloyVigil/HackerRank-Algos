def Staircase(n):
    for i in range(1, n+1):
        row = ""
        for j in range(n):
            if j < n-i:
                row += " "
            else:
                row += "#"
        print(row)

Staircase(6)
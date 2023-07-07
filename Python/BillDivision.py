def bonAppetit(bill, k, b):
    billTotal = sum(bill)
    annasBill = (billTotal - bill[k]) / 2
    annasChange = bill[k] / 2

    if annasBill == b:
        return "Bon Appetit"
    else:
        return int(annasChange)

print(bonAppetit([3, 10, 2, 9], 1, 12)) # should print 5
print(bonAppetit([3, 10, 2, 9], 1, 7))  # should print "Bon Appetit"
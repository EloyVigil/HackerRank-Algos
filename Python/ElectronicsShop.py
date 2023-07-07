def get_max_purchase(keyboards, drives, budget):
    max_total = -1

    for k in keyboards:
        for d in drives:
            total = k + d
            if total <= budget and total > max_total:
                max_total = total

    return max_total


def test_get_max_purchase():
    keyboards = [3, 1]
    drives = [5, 2, 8]
    budget = 10
    expected = 9

    result = get_max_purchase(keyboards, drives, budget)

    if result == expected:
        print("Test passed")
    else:
        print(f"Test failed. Expected {expected}, but got {result}.")


test_get_max_purchase()
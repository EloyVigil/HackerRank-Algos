def pickingNumbers(a):
    max_len = 0
    for i in range(len(a)):
        sub_arr = []
        for j in range(len(a)):
            if a[i] - a[j] == 0 or a[i] - a[j] == 1:
                sub_arr.append(a[j])
        if len(sub_arr) > max_len:
            max_len = len(sub_arr)
    return max_len


def test_picking_numbers():
    test_cases = [
        {"input": [1, 2, 2, 3, 1, 2], "expected": 5},
        {"input": [4, 6, 5, 3, 3, 1], "expected": 3},
        {"input": [1, 1, 2, 2, 4, 4, 5, 5, 5], "expected": 5},
        {"input": [1, 2, 3, 4, 5], "expected": 2}
    ]

    for i, test_case in enumerate(test_cases):
        result = pickingNumbers(test_case["input"])

        print(f"Test Case {i + 1}")
        print(f"Input: {test_case['input']}")
        print(f"Expected: {test_case['expected']}")
        print(f"Result: {result}")
        print(f"Pass: {'Yes' if result == test_case['expected'] else 'No'}")
        print("--------------------------------")


test_picking_numbers()

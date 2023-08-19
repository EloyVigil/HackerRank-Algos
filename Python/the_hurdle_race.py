def hurdle_race(k, height):
    potions = 0

    height.sort()

    if height[-1] >= k:
        potions = height[-1] - k
    
    return potions

class TestCase:
    def __init__(self, k, height, expected):
        self.k = k
        self.height = height
        self.expected = expected

def test_hurdle_race():
    test_cases = [
        TestCase(4, [1, 6, 3, 5, 2], 2),
        TestCase(7, [2, 5, 4, 8, 9], 2),
        TestCase(3, [4, 2, 7, 6, 5], 4),
        TestCase(10, [11, 12, 9, 8, 15], 5),
        TestCase(5, [7, 5, 5, 6, 8], 3)
    ]

    for test_case in test_cases:
        result = hurdle_race(test_case.k, test_case.height)
        pass_test = result == test_case.expected
        print(f"Test Case: k={test_case.k}, height={test_case.height}, Expected: {test_case.expected}, Result: {result}, Pass: {'Yes' if pass_test else 'No'}")

if __name__ == "__main__":
    test_hurdle_race()
def formingMagicSquare(s):
    possibleCases = [
        [[8, 1, 6], [3, 5, 7], [4, 9, 2]],
        [[4, 3, 8], [9, 5, 1], [2, 7, 6]],
        [[2, 9, 4], [7, 5, 3], [6, 1, 8]],
        [[6, 7, 2], [1, 5, 9], [8, 3, 4]],
        [[6, 1, 8], [7, 5, 3], [2, 9, 4]],
        [[8, 3, 4], [1, 5, 9], [6, 7, 2]],
        [[4, 9, 2], [3, 5, 7], [8, 1, 6]],
        [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
    ]

    min_sum = 45
    for square in possibleCases:
        curr_sum = 0
        for i in range(3):
            for j in range(3):
                curr_sum += abs(s[i][j] - square[i][j])
        if curr_sum < min_sum:
            min_sum = curr_sum
    return min_sum

def testFormingMagicSquare():
    testCases = [
        {
            'input': [
                [4, 9, 2],
                [3, 5, 7],
                [8, 1, 5]
            ],
            'expectedOutput': 1
        },
        {
            'input': [
                [4, 8, 2],
                [4, 5, 7],
                [6, 1, 6]
            ],
            'expectedOutput': 4
        },
    ]

    for i, testCase in enumerate(testCases):
        input_arr = testCase['input']
        expected_output = testCase['expectedOutput']
        output = formingMagicSquare(input_arr)

        print(f'Test Case {i+1}')
        print(f'Input: {input_arr}')
        print(f'Expected Output: {expected_output}')
        print(f'Actual Output: {output}')
        print('--------------------------------------------------')

testFormingMagicSquare()
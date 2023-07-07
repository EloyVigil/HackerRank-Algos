const formingMagicSquare = (s) => {
    const possibleCases = [
        [[8, 1, 6], [3, 5, 7], [4, 9, 2]],
        [[4, 3, 8], [9, 5, 1], [2, 7, 6]],
        [[2, 9, 4], [7, 5, 3], [6, 1, 8]],
        [[6, 7, 2], [1, 5, 9], [8, 3, 4]],
        [[6, 1, 8], [7, 5, 3], [2, 9, 4]],
        [[8, 3, 4], [1, 5, 9], [6, 7, 2]],
        [[4, 9, 2], [3, 5, 7], [8, 1, 6]],
        [[2, 7, 6], [9, 5, 1], [4, 3, 8]]
    ]
    
    let min = 45
    possibleCases.forEach((square) => {
        let sum = 0
        for (let i = 0; i < 3; i++) {
            for (let j = 0; j < 3; j++) {
                sum += Math.abs(s[i][j] - square[i][j])
            }
        }
        if (sum < min) min = sum
    })
    return min
}


const testFormingMagicSquare = () => {

    const testCases = [
        {
            input: [
                [4, 9, 2],
                [3, 5, 7],
                [8, 1, 5]
            ],
            expectedOutput: 1
        },
        {
            input: [
                [4, 8, 2],
                [4, 5, 7],
                [6, 1, 6]
            ],
            expectedOutput: 4
        },
    ];

    for (let i = 0; i < testCases.length; i++) {
        const { input, expectedOutput } = testCases[i];
        const output = formingMagicSquare(input);
        
        console.log(`Test Case ${i + 1}`);
        console.log(`Input: ${JSON.stringify(input)}`);
        console.log(`Expected Output: ${expectedOutput}`);
        console.log(`Actual Output: ${output}`);
        console.log("--------------------------------------------------");
    }
};

testFormingMagicSquare();

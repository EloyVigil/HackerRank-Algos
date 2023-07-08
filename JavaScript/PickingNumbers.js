const pickingNumbers = (a) => {
    let max = 0;
    for (let i = 0; i < a.length; i++) {
        let subArr = [];
        for (let j = 0; j < a.length; j++) {
            if (a[i] - a[j] === 0 || a[i] - a[j] === 1)
                subArr.push(a[j])
        }
        if (subArr.length > max)
            max = subArr.length;
    }
    return max;

}

function testPickingNumbers() {
    const testCases = [
        {
            input: [1, 2, 2, 3, 1, 2],
            expected: 5
        },
        {
            input: [4, 6, 5, 3, 3, 1],
            expected: 3
        },
        {
            input: [1, 1, 2, 2, 4, 4, 5, 5, 5],
            expected: 5
        },
        {
            input: [1, 2, 3, 4, 5],
            expected: 2
        }
    ];

    for (let i = 0; i < testCases.length; i++) {
        const { input, expected } = testCases[i];
        const result = pickingNumbers(input);

        console.log(`Test Case ${i + 1}`);
        console.log(`Input: ${JSON.stringify(input)}`);
        console.log(`Expected: ${expected}`);
        console.log(`Result: ${result}`);
        console.log(`Pass: ${result === expected ? 'Yes' : 'No'}`);
        console.log("--------------------------------");
    }
}

testPickingNumbers();
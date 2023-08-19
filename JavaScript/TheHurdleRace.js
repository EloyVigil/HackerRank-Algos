const hurdleRace = (k, height) => {
    let potions = 0;

    height.sort((a,b)=> a - b);

    if(height[height.length-1] >= k) potions = height[height.length-1] - k;
    
    return potions;
}

function testHurdleRace() {

    const testCases = [
        { k: 4, height: [1, 6, 3, 5, 2], expected: 2 },
        { k: 7, height: [2, 5, 4, 8, 9], expected: 2 },
        { k: 3, height: [4, 2, 7, 6, 5], expected: 4 },
        { k: 10, height: [11, 12, 9, 8, 15], expected: 5 },
        { k: 5, height: [7, 5, 5, 6, 8], expected: 3 }
    ];

    for (const testCase of testCases) {
        const result = hurdleRace(testCase.k, testCase.height);
        const pass = result === testCase.expected;
        console.log(`Test Case: k=${testCase.k}, height=[${testCase.height}], Expected: ${testCase.expected}, Result: ${result}, Pass: ${pass ? 'Yes' : 'No'}`);
    }
}

testHurdleRace();
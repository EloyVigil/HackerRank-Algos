function getMoneySpent(keyboards, drives, b) {
    let maxTotal = -1;

    for (let i = 0; i < keyboards.length; i++) {
        for (let j = 0; j < drives.length; j++) {
            let tempTotal = keyboards[i] + drives[j];
            if (tempTotal <= b && tempTotal > maxTotal) {
                maxTotal = tempTotal;
            }
        }
    }

    return maxTotal;
}

function testGetMoneySpent() {
    const keyboards = [3, 1];
    const drives = [5, 2, 8];
    const budget = 10;
    const expected = 9;

    const result = getMoneySpent(keyboards, drives, budget);

    if (result === expected) {
        console.log('Test passed');
    } else {
        console.log(`Test failed. Expected ${expected}, but got ${result}.`);
    }
}

testGetMoneySpent();
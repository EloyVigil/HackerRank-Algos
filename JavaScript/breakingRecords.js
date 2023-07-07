function breakingRecords(scores) {
    let best = 0;
    let worst = 0;
    let bestScore = scores[0];
    let worstScore = scores[0];
    const length = scores.length;
    for (let i = 1; i < length; i++) {
        if (scores[i] > bestScore) {
            bestScore = scores[i];
            best++;
        }
        if (scores[i] < worstScore) {
            worstScore = scores[i]
            worst++;
        }
    }
    return [best, worst];
}

console.log(breakingRecords([3, 4, 21, 36, 10, 28, 35, 5, 24, 42]))
console.log(breakingRecords([10, 5, 20, 20, 4, 5, 2, 25, 1]))
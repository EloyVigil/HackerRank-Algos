const climbingTheLeaderboard = (ranked, player) => {
    //remove duplicates, sort and return an array
    let cleanRanks = [...new Set(ranked)].sort((a, b) => a - b);
    let playerRank = [];
    let len = cleanRanks.length;

    for (let i = 0; i < player.length; i++) {
        let rank = len + 1;
        let j = 0;

        while (len > 0 && player[i] >= cleanRanks[j]) {
            //discovered that using while-loop optimizes execution over for-loop.
            rank--;
            j++;
        }

        playerRank.push(rank)
    }

    return playerRank;
}

function testClimbingTheLeaderboard() {
    const testCases = [
        {
            ranked: [100, 90, 90, 80, 75, 60],
            player: [50, 65, 77, 90, 102],
            expected: [6, 5, 4, 2, 1]
        },
        {
            ranked: [100, 100, 50, 40, 20, 10],
            player: [5, 15, 25, 50, 120],
            expected: [6, 5, 4, 2, 1]
        }
    ];

    for (let i = 0; i < testCases.length; i++) {
        const { ranked, player, expected } = testCases[i];
        const result = climbingTheLeaderboard(ranked, player);

        console.log(`Test Case ${i + 1}`);
        console.log(`Ranked: ${JSON.stringify(ranked)}`);
        console.log(`Player: ${JSON.stringify(player)}`);
        console.log(`Expected: ${JSON.stringify(expected)}`);
        console.log(`Result: ${JSON.stringify(result)}`);
        console.log(`Pass: ${JSON.stringify(result) === JSON.stringify(expected) ? 'Yes' : 'No'}`);
        console.log("--------------------------------");
    }
}

testClimbingTheLeaderboard();
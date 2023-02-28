function migratoryBirds(arr) {
    let birdsMap = {};
    for (let i = 0; i < arr.length; i++) {
        let birdType = arr[i];
        let count = birdsMap[birdType];
        if (count === undefined) {
            count = 0;
        }
        birdsMap[birdType] = count + 1;
    }

    let highestType = null;
    let highestCount = 0;
    for (let birdType in birdsMap) {
        if (birdsMap.hasOwnProperty(birdType)) {
            let count = birdsMap[birdType];
            if (count >= highestCount) {
                highestCount = count;
                highestType = birdType;
            }
        }
    }

    return highestType;
}

console.log(migratoryBirds([1, 2, 5, 8, 8, 2, 6, 5, 2, 9]))
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

    let lowestType = Number.MAX_SAFE_INTEGER;
    let highestCount = 0;
    for (let birdType in birdsMap) {
        if (birdsMap.hasOwnProperty(birdType)) {
            let count = birdsMap[birdType];
            if (count > highestCount || (count === highestCount && birdType < lowestType)) {
                highestCount = count;
                lowestType = birdType;
            }
        }
    }

    return lowestType;
}

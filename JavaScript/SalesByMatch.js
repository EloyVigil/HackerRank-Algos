function sockMerchant(n, ar) {
    let count = 0;

    for (let i = 0; i < n; i++) {
        const value = ar[i];
        if (value !== null) {
            let pairsNumber = 0;
            for (let j = i + 1; j < n; j++) {
                if (ar[j] === value) {
                    pairsNumber++;
                    ar[j] = null;
                    break;
                }
            }
            if (pairsNumber > 0) {
                count += Math.floor((pairsNumber + 1) / 2);
            }
        }
    }

    return count;
}

console.log(sockMerchant(9, [10, 20, 20, 10, 10, 30, 50, 10, 20]))
function miniMaxSum(arr) {
    let minSum = 0;
    let maxSum = 0;
    let length = arr.length;
    const sortedArray = arr.sort();

    for (let i = 0; i < length; i++) {
        if (i < length - 1) {
            minSum += arr[i]
        }
        if (i > 0) {
            maxSum += arr[i]
        }
    }
    console.log(minSum, maxSum)
}

console.log(miniMaxSum([1, 2, 3, 4, 5]))

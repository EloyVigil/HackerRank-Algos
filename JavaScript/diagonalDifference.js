function diagonalDifference(arr) {
    let difference = 0;
    let l = arr.length;
    let primary = 0, secondary = 0;
    
    for(let i = 0; i < l; i++){
        primary += arr[i][i];
        secondary += arr[l - 1 - i][i]
    }
    console.log("primary " + primary)
    console.log("secondary " + secondary)
    difference = secondary - primary;
    return Math.abs(difference);
}


console.log(diagonalDifference([[11, 2, 4], [4, 5, 6], [10, 8, -12]]))
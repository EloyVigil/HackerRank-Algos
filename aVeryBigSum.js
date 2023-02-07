function aVeryBigSum(ar) {
    let sum = 0;
    for(let i = 0; i < ar.length; i++){
        sum = sum + ar[i];
    }
    return sum;
}

console.log(aVeryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]));
console.log(aVeryBigSum([1000000901, 1000090002, 1000000903, 1000090004, 1000090005]));
console.log(aVeryBigSum([1000, 10, 10000, 10999, 42]));
console.log(aVeryBigSum([2500, 2866, 0, 55837, 5067]));
console.log(aVeryBigSum([2000000001, 4000000002, 000000003, 14004, 10]));
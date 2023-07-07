function compareTriplets(a, b) {
    let solution = [0, 0];
    for(let i = 0; i < a.length; i++){
        if(a[i] < b[i]){
            solution[1] += 1;
        }
        else if (a[i] > b[i]){
            solution[0] += 1;
        } else if (a[i] == b[i]) {
            continue;
        }
    }
    return solution;
}


console.log(compareTriplets([1, 2, 3], [3, 2, 1]));
console.log(compareTriplets([1, 2, 3], [1, 2, 3]));
console.log(compareTriplets([19, 20, 30], [30, 22, 30]));

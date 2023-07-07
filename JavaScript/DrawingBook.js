function pageCount(n, p) {
    var frontFlip = Math.floor(p / 2);
    var backFlip = Math.floor((n / 2) - frontFlip);

    let result = Math.min(frontFlip, backFlip);
    return result;

}

console.log(pageCount(5, 3))
console.log(pageCount(9, 5))
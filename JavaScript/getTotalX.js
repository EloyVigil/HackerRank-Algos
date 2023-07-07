function getTotalX(a, b) {
    // Find Least Common Multiple of all integers in array a
    let lcm = a.reduce((acc, val) => (acc * val) / gcd(acc, val));

    // Find Greatest Common Divisor of all integers in array b
    let gcdB = b.reduce(gcd);

    let result = 0;
    for (let i = lcm; i <= gcdB; i += lcm) {
        if (gcdB % i === 0) {
            result++;
        }
    }
    return result;
}

// Helper function to find Greatest Common Divisor of two numbers
function gcd(a, b) {
    if (b === 0) {
        return a;
    }
    return gcd(b, a % b);
}

console.log(getTotalX([2, 4], [16, 32, 96]));
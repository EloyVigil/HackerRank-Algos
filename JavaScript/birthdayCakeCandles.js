function birthdayCakeCandles(candles) {
    let maxAge = 0;
    let candleCount = 0;
    let length = candles.length;
    
    for(let i = 0; i < length; i++){
        if (candles[i] < maxAge){
            continue;
        }
        if (candles[i] > maxAge){
            maxAge = candles[i]
            candleCount = 1;
        }
        else if (candles[i] === maxAge){
            candleCount++;
        }
    }
    return candleCount;

}

console.log(birthdayCakeCandles([3, 2, 1, 3]))
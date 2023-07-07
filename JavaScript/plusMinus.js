function plusMinus(arr) {
    let tempNumPositive = 0;
    let tempNumNegative = 0;
    let tempNumZero = 0;
    let length = arr.length;
    
    for(let i = 0; i < length; i++){
        if(arr[i] < 0){
            tempNumNegative += 1;
        }
        else if(arr[i] > 0){
            tempNumPositive +=1;
        } else {
            tempNumZero +=1;
        }
    }
    
    // let positiveFraction = tempNumPositive / length;
    console.log("Positive " + positiveFraction)
    // let negativeFraction = tempNumNegative / length;
    console.log("Negative " + negativeFraction)
    // let zeroFraction = tempNumZero / length;
    console.log("Zero " + zeroFraction)
        
    console.log(positiveFraction);
    console.log(negativeFraction);
    console.log(zeroFraction);
        
}
console.log(plusMinus([-4, 3, -9, 0, 4, 1]))
console.log(plusMinus([1, 2, 3, -1, -2, -3, 0, 0]))
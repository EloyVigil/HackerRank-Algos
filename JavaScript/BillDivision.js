function bonAppetit(bill, k, b) {
    let billTotal = 0;
    let length = bill.length;
    
    for(let i = 0; i < length; i++){
        billTotal += bill[i]
    }
    
    let annasBill = (billTotal - bill[k]) / 2;
    let annasChange = bill[k] / 2;

    if(annasBill === b){
        console.log("Bon Appetit");
    } else {
        console.log(annasChange);
    }

}

console.log(bonAppetit([3, 10, 2, 9], 1, 12))
console.log(bonAppetit([3, 10, 2, 9], 1, 7))

function bonAppetit(bill, k, b) {
    let billTotal = 0;
    let length = bill.length;
    
    for(let i = 0; i < length; i++){
        billTotal += bill[i]
    }
    
    let annasBill = (billTotal - bill[k]) / 2;
    let annasChange = bill[k] / 2;

    if(annasBill === b){
        return "Bon Appetit";
    } else {
        return annasChange;
    }
}

console.log(bonAppetit([3, 10, 2, 9], 1, 12)); // should print 5
console.log(bonAppetit([3, 10, 2, 9], 1, 7));  // should print "Bon Appetit"
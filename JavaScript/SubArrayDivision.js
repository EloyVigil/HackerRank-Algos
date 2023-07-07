function birthday(s, d, m) {
    let count=0,sum=0
    for(let i=0; i<s.length; i++){
        for(let j=i; j<m+i; j++){ sum+=s[j] }
        if(sum === d){ count++ }
        sum=0;
    }
    return count;

}

console.log(birthday([2, 2, 1, 3, 2], 4, 2))
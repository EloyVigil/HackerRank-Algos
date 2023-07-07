function timeConversion(s) {
    let hour = s.substring(0, 2) * 1;
    let timeFormat = s.substring(2, 8);
    
    if (hour === 12 && s.indexOf("AM") !== -1){
        return ("00" + timeFormat);
    }
    if(hour === 12 && s.indexOf("PM") !== -1){
        return (hour + timeFormat);
    }
    if (hour < 12 && s.indexOf("PM") !== -1){
        return (12 + hour + timeFormat);
    } else {
        if (hour < 10){
            return ("0" + hour + timeFormat);
        } else {
            return (hour + timeFormat)
        } 
    } 

}

console.log(timeConversion("07:05:45PM"))

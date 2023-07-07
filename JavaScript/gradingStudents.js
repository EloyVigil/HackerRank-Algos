function gradingStudents(grades) {
    let length = grades.length;
    let finalGrade = [];

    for (let i = 0; i < length; i++) {
        let diff = Math.ceil(grades[i] / 5) * 5 - grades[i];
        if (diff < 3 && grades[i] >= 38) {
            finalGrade.push(Math.ceil(grades[i] / 5) * 5)
        } else {
            finalGrade.push(grades[i]);
        }
    }
    return finalGrade;


}


console.log(gradingStudents([73, 67, 38, 33]))
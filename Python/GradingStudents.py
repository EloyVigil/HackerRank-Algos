def GradingStudents(grades):
    finalGrade = []

    for grade in grades:
        diff = (5 * (grade // 5 + 1)) - grade
        if diff < 3 and grade >= 38:
            finalGrade.append(5 * (grade // 5 + 1))
        else:
            finalGrade.append(grade)
    return finalGrade

print(GradingStudents([73, 67, 38, 33]))
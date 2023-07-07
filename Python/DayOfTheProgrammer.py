import datetime

def dayOfProgrammer(year):
    if year == 1918:
        # Special case for 1918
        return "26.09.1918"
    elif year < 1918:
        # Julian calendar before 1918
        return "12.09.%d" % year if year % 4 == 0 else "13.09.%d" % year
    else:
        # Gregorian calendar from 1918 onwards
        return "12.09.%d" % year if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0) else "13.09.%d" % year

# Sample test case
year = 2021
expected_output = "13.09.2021"
actual_output = dayOfProgrammer(year)
print("Test passed" if actual_output == expected_output else "Test failed")
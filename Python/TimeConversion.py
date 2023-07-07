def timeConversion(s):
    hour = int(s[0:2])
    timeFormat = s[2:8]

    if hour == 12 and "AM" in s:
        return "00" + timeFormat
    elif hour == 12 and "PM" in s:
        return str(hour) + timeFormat
    elif hour < 12 and "PM" in s:
        return str(hour + 12) + timeFormat
    else:
        if hour < 10:
            return "0" + str(hour) + timeFormat
        else:
            return str(hour) + timeFormat

print(timeConversion("07:05:45PM"))  # Output: "19:05:45"
import math

def main():
    a = [2, 4]
    b = [16, 32, 96]
    result = get_total_x(a, b)
    print(result)

def get_total_x(a, b):
    # Find Least Common Multiple of all integers in array a
    lcm = math.lcm(*a)

    # Find Greatest Common Divisor of all integers in array b
    gcd_b = math.gcd(*b)

    result = 0
    for i in range(lcm, gcd_b + 1, lcm):
        if gcd_b % i == 0:
            result += 1

    return result

if __name__ == '__main__':
    main()
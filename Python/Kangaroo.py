def kangaroo(x1, v1, x2, v2):
    if v1 <= v2:
        return "NO"
    else:
        t = (x1 - x2) / (v2 - v1)
        return "YES" if t.is_integer() else "NO" 
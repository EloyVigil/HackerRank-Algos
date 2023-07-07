import math

def cat_and_mouse(x, y, z):
    catA = abs(z - x)
    catB = abs(z - y)

    if catA < catB:
        return "Cat A"
    elif catA > catB:
        return "Cat B"
    elif catA == catB:
        return "Mouse C"
    return None

def test_cat_and_mouse(cat_and_mouse_func):
    # Test case 1: Cat A is closer to the mouse
    result = cat_and_mouse_func(1, 4, 2.0)
    assert result == "Cat A", "Test case 1 failed"
    if result == "Cat A":
        print("Test 1 Passed")

    # Test case 2: Cat B is closer to the mouse
    result = cat_and_mouse_func(1, 4, 3.0)
    assert result == "Cat B", "Test case 2 failed"
    if result == "Cat B":
        print("Test 2 Passed")

    # Test case 3: Both cats are equidistant from the mouse
    result = cat_and_mouse_func(1, 4, 2.5)
    assert result == "Mouse C", "Test case 3 failed"
    if result == "Mouse C":
        print("Test 3 Passed")

    # Test case 4: Cat A and Cat B are equidistant from the mouse
    result = cat_and_mouse_func(1, 3, 2.0)
    assert result == "Mouse C", "Test case 4 failed"
    if result == "Mouse C":
        print("Test 4 Passed")

    # Test case 5: Cat A and Cat B are at the same position as the mouse
    result = cat_and_mouse_func(1, 1, 1.0)
    assert result == "Mouse C", "Test case 5 failed"
    if result == "Mouse C":
        print("Test 5 Passed")

if __name__ == "__main__":
    test_cat_and_mouse(cat_and_mouse)
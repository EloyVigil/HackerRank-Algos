function catAndMouse(x, y, z) {
    let catA = Math.abs(z - x);
    let catB = Math.abs(z - y);

    if (catA < catB) {
        return "Cat A";
    } else if (catA > catB) {
        return "Cat B";
    } else if (catA == catB) {
        return "Mouse C"
    }

}


function testCatAndMouse() {
    // Test case 1: Cat A is closer to the mouse
    let result = catAndMouse(1, 4, 2);
    console.assert(result === "Cat A", "Test case 1 failed");
    if(result === "Cat A"){
        console.log("Test 1 Passed")
    }
    // Test case 2: Cat B is closer to the mouse
    result = catAndMouse(1, 4, 3);
    console.assert(result === "Cat B", "Test case 2 failed");
    if(result === "Cat B"){
        console.log("Test 2 Passed")
    }
    // Test case 3: Both cats are equidistant from the mouse
    result = catAndMouse(1, 4, 2.5);
    console.assert(result === "Mouse C", "Test case 3 failed");
    if(result === "Mouse C"){
        console.log("Test 3 Passed")
    }
    // Test case 4: Cat A and Cat B are equidistant from the mouse
    result = catAndMouse(1, 3, 2);
    console.assert(result === "Mouse C", "Test case 4 failed");
    if(result === "Mouse C"){
        console.log("Test 4 Passed")
    }
    // Test case 5: Cat A and Cat B are at the same position as the mouse
    result = catAndMouse(1, 1, 1);
    console.assert(result === "Mouse C", "Test case 5 failed");
    if(result === "Mouse C"){
        console.log("Test 5 Passed")
    }
}

testCatAndMouse();





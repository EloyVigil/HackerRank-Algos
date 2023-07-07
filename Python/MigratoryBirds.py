def migratory_birds(arr):
    birds_map = {}
    for bird_type in arr:
        birds_map[bird_type] = birds_map.get(bird_type, 0) + 1

    lowest_type = float('inf')
    highest_count = 0
    for bird_type, count in birds_map.items():
        if count > highest_count or (count == highest_count and bird_type < lowest_type):
            highest_count = count
            lowest_type = bird_type

    return lowest_type


arr1 = [1, 2, 5, 8, 8, 2, 6, 5, 2, 9]
print(migratory_birds(arr1))  # output: 2

arr2 = [1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4]
print(migratory_birds(arr2))  # output: 1
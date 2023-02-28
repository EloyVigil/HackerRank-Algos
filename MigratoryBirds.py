def migratory_birds(arr):
    birds_map = {}
    for bird_type in arr:
        count = birds_map.get(bird_type, 0)
        birds_map[bird_type] = count + 1

    highest_type = None
    highest_count = 0
    for bird_type, count in birds_map.items():
        if count >= highest_count:
            highest_count = count
            highest_type = bird_type

    return highest_type
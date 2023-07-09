def climbingTheLeaderboard(ranked, player):
    clean_ranks = sorted(set(ranked))
    player_rank = []
    length = len(clean_ranks)

    for score in player:
        rank = length + 1
        j = 0

        while length > 0 and score >= clean_ranks[j]:
            rank -= 1
            j += 1

        player_rank.append(rank)

    return player_rank


def testClimbingTheLeaderboard():
    test_cases = [
        {"ranked": [100, 90, 90, 80, 75, 60], "player": [50, 65, 77, 90, 102], "expected": [6, 5, 4, 2, 1]},
        {"ranked": [100, 100, 50, 40, 20, 10], "player": [5, 15, 25, 50, 120], "expected": [6, 5, 4, 2, 1]}
    ]

    for i, test_case in enumerate(test_cases):
        ranked = test_case["ranked"]
        player = test_case["player"]
        expected = test_case["expected"]

        result = climbingTheLeaderboard(ranked, player)

        print(f"Test Case {i + 1}")
        print(f"Ranked: {ranked}")
        print(f"Player: {player}")
        print(f"Expected: {expected}")
        print(f"Result: {result}")
        print(f"Pass: {'Yes' if result == expected else 'No'}")
        print("--------------------------------")


testClimbingTheLeaderboard()
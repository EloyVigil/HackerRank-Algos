class DrawingBook:
    @staticmethod
    def page_count(n, p):
        front_flip = int(p / 2)
        back_flip = int((n / 2) - front_flip)

        result = min(front_flip, back_flip)
        return result
    
# Test Cases
print(DrawingBook.page_count(5, 3)) # expected output: 1
print(DrawingBook.page_count(9, 5)) # expected output: 2
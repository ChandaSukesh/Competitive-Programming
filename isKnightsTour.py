# IsKnightsTour [20 Pts]
# Background:  A "knight's tour in chess is a sequence of 
# legal knight moves such that the knight visits every square 
# exactly once. We can represent a (supposed) knight's tour
#  as an NxN list of the integers from 1 to N2 listing the 
# positions in order that the knight occupied on the tour.  
# If it is a legal knight's tour, then all the numbers from 1
#  to N2 will be included and each move from k to (k+1) will
#  be a legal knight's move. With this in mind, write the 
# function isKnightsTour(board) that takes such a 2d list of 
# integers and returns True if it represents a legal knight's 
# tour and False otherwise. Code for this problem should go in 
# hw5.py and will be autograded!

# To help you undertand how a knight's tour is represented,
# and so you can write your own test cases, here is one example 
# of a successful knight's tour:

# board = [
#           [  1, 60, 39, 34, 31, 18,  9, 64 ],
#           [ 38, 35, 32, 61, 10, 63, 30, 17 ],
#           [ 59,  2, 37, 40, 33, 28, 19,  8 ],
#           [ 36, 49, 42, 27, 62, 11, 16, 29 ],
#           [ 43, 58,  3, 50, 41, 24,  7, 20 ],
#           [ 48, 51, 46, 55, 26, 21, 12, 15 ],
#           [ 57, 44, 53,  4, 23, 14, 25,  6 ],
#           [ 52, 47, 56, 45, 54,  5, 22, 13 ],
#         ]
# assert(isKnightsTour(board)==True)


def isKnightsTour(board):
    # Your code goes here...
    if(len(board)==0):
        return None
    if(len(board[0])==0):
        return None

    for r in range(len(board)):
        for c in range(len(board[0])):
            if(board[r][c] == 0):
                return False
    i = 1
    while(i < ((len(board))*(len(board[0])))):
        r1, c1 = checkPosition(board, i)
        r2, c2 = checkPosition(board, (i+1))
        if(r1 == -8 or c1 == -8):
            return False
        i = i + 1
        if(checkFn(r1, c1, r2, c2) == False):
            return False
    return True
    
def checkPosition(L, i):
    for row in range(len(L)):
        for cow in range(len(L[0])):
            if(L[row][cow] == i):
                return(row, cow)
    return (-8, -8)

def checkFn(r1, c1, r2, c2):
    if(((abs(r1 - r2) == 1) and (abs(c1 - c2) == 2)) or ((abs(c1 - c2) == 1) and (abs(r1 - r2) == 2))):
        return True
    return False


board = [
            [  1, 60, 39, 34, 31, 18,  9, 64 ],
            [ 38, 35, 32, 61, 10, 63, 30, 17 ],
            [ 59,  2, 37, 40, 33, 28, 19,  8 ],
            [ 36, 49, 42, 27, 62, 11, 16, 29 ],
            [ 43, 58,  3, 50, 41, 24,  7, 20 ],
            [ 48, 51, 46, 55, 26, 21, 12, 15 ],
            [ 57, 44, 53,  4, 23, 14, 25,  6 ],
            [ 52, 47, 56, 45, 54,  5, 22, 13 ],
        ]
assert(isKnightsTour(board)==True)

# You can write your own test cases here...
print("All test cases passed....")
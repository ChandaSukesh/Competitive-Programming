# Background:  in Chess, a King can move from any square to
# any adjacent square.  A King’s Tour is a series of legal King
# moves so that every square is visited exactly once. 
# We can represent a Kings Tour in a 2d list where the 
# numbers represent the order the squares are visited, going 
# from 1 to N2.  For example, consider these 2d lists:

#    [ [  3, 2, 1 ],    	[ [  1, 2, 3 ],  	[ [ 3, 2, 1 ],
#  	[  6, 4, 9 ],      	[  7, 4, 8 ],    	[ 6, 4, 0 ],
#  	[  5, 7, 8 ] ]     	[  6, 5, 9 ] ]   	[ 5, 7, 8 ] ]

# The first is a legal Kings Tour but the second is not, 
# because there is no way to legally move from the 7 to the 8, 
# and the third is not, because it contains a 0 which is out
#  of range.  With this in mind, write the function 
# isKingsTour(board) that takes a 2d list of integers, 
# which you may assume is NxN for some N>0, and 
# returns True if it represents a legal Kings Tour 
# and False otherwise.

def isKingsTour(board):
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
    if(((abs(r1 - r2) <= 1) and (abs(c1 - c2) <= 1))):
        return True
    return False

board=[ [  3, 2, 1 ],    	
	[  6, 4, 9 ],   
 	[  5, 7, 8 ] ] 
assert(isKingsTour(board)==True)

# You can write your own test cases here...
print("All test cases passed....")
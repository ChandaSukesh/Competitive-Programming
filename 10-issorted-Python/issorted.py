# isSorted(a) (10 Pts)
# Write the function isSorted(a) that takes a list of numbers and returns True if the list 
# is sorted (either smallest-first or largest-first) and False otherwise. Your function 
# must only consider each value in the list once (so, in terms of big-oh, which we will 
# learn soon, it runs in O(n) time, where n=len(a)), and so in particular you may not sort 
# the list.

def issorted(a):
	# your code goes here
	if(len(a)==0 or len(a)==1):
		return True
	asc=0
	
	if(a[1]>a[0]):
		asc=1
	else:
		asc=0
	
	
	for i in range(1,len(a)):
		print(i)
		if(asc==1):
			if(a[i]<a[i-1]):
				return False
		else:
			if(a[i]>a[i-1]):
				return False
	# for i in range(0,len(a)): 
	# 	if(a[i]>a[i-1]):
	# 		return False
	return True
# Without using iteration and without using strings, 
# write the recursive function onlyEvenDigits(L), 
# that takes a list L of non-negative integers 
# (you may assume that), and returns a new list of 
# the same numbers only without their odd digits 
# (if that leaves no digits, then replace the number with 0). 
# So: onlyEvenDigits([43, 23265, 17, 58344]) returns [4, 226, 0, 844]. 
# Also the function returns the empty list if the original list is empty. 
# Remember to not use strings. You may not use loops/iteration in this problem.

def fun_recursion_onlyevendigits(l):
	if len(l) == 0:
		return []
	else:
		index=0
		return evenNumbersFn(l,index)

def evenNumbersFn(l,index):
	length=len(l)
	if length == index:
		return l
	else:
		a = l[index]
		l[index] = checkFn(evenFn(a))
		index=index+1
		return evenNumbersFn(l, index)

def checkFn(n, val=0):
	if n == 0:
		return val
	else:
		m=n//10
		ans= val * 10 + n % 10
		return checkFn(m, ans)

def evenFn(n, val=0):
	if n == 0:
		return val
	else:
		if (n % 10) % 2 == 0:
			m=n//10
			ans=(val * 10) + (n % 10)
			return evenFn(m,ans)
		else:
			m=n//10
			return evenFn(m, val)


		
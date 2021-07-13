"""Time to play with Python dictionaries!
You're going to work on a dictionary that
stores cities by country and continent.
One is done for you - the city of Mountain 
View is in the USA, which is in North America.

You need to add the cities listed below by
modifying the structure.
Then, you should print out the values specified
by looking them up in the structure.

Cities to add:
Bangalore (India, Asia)
Atlanta (USA, North America)
Cairo (Egypt, Africa)
Shanghai (China, Asia)"""


"""Print the following (using "print").
1. A list of all cities in the USA in
alphabetic order. Make it function with name as sortUSA(), return list of cities
2. All cities in Asia, in alphabetic
order, next to the name of the country.
In your output, label each answer with a number
so it looks like this: (Make it function with name as alphaAsia(), return list of cities)
1
American City
American City
2
Asian City - Country
Asian City - Country"""

def sortUSA():
    '''Return all the cities in the USA in alphabetical order'''
    lst=[]
    for i,j in location.items():
        for k in j:
            if(k=="USA"):
                a=j[k]
    return (sorted(a))

def alphaAsia():
    '''Return all the cities in Asia continent in alphabetical order'''
    arr=[]
    for i,j in location.items():
        if(i=="Asia"):
            for k in j:
                state=''.join(map(str,j[k]))
                country=''.join(map(str,k))
                txt="{state} - {country}".format(state=state,country=country)
                arr.append(txt)
    return arr

location = {'North America': {'USA': ['Mountain View','Atlanta']}, 'Asia': {'India': ['Bangalore'], 'China': ['Shanghai'] } ,  'Africa': {'Egypt': ['Cairo']}}

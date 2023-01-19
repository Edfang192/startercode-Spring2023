# use spaces. Do NOT use tabs.
'''
mystring = "Spring\tSemester\t2023 began this\tweek"
mystring = "a\tthe\t the \tthe\tthen"
myarray = [("A",2), ("B",5), ("A",2), ("A", 10)]
myarray = [1, 1.5, 3, 4]
myarray = [('c', 2), ('a', 3), ('d', 3), ('a', 2), ('e',1), ('c',1)]
'''
def q1(mystring):
    newstring = tuple(mystring.split('\t')[1:3])
    return newstring



def q2(mystring):
    word = 'the'
    newstring = mystring.split('\t')
    numthe = newstring.count('the')
    return numthe



def q3(myarray):
    result = []
    for i in myarray:
        if i[0] == 'a':
            result.append(i[1])
    return sum(result)


def q4(myarray):
    """ 
    you cannot change how the array is iterated 
    and you cannot use any list operations on myarray """
    mystringarray = myarray
    count = 0
    for mynum in mystringarray:
        if mynum % 2 == 0:
            return count
        count= count+1
    else:
        return -1
        

        


def q5(myarray):
    mydic= {}
    for letter, num in myarray:
        if letter not in mydic: mydic[letter] = num
        else: mydic[letter] = mydic[letter] + num
    return mydic
'''
def main():
    #print(q1(mystring))
    #print(q2(mystring))
    #print(q3(myarray))
    #print(q4(myarray))
    #print(q5(myarray))
    return
    

if __name__ == '__main__':
    main()
'''

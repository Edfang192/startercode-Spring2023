import csv
#from mrjob.job import MRJob

#class retail(MRJob):

    def mapper(self, line):
    #parse lines in csv file
        parts = list(csv.reader ([line]))[0]
        invoiceno = parts[0]
        stockcode = parts[1]
        quantity = int(parts[3])
        unitprice = float(parts[5])
        country = parts[7]
        #yield key value pair
        yield (invoiceno, stockcode) , (quantity, mostspent)

    def reducer(self, key, values):
        mostexpensive = 0
        #Loop through the unit price values and set the highest one to be the most expensive
        for totquantity, mostexpensive in values:
            if unitprice > mostexpensive:
                unitprice = mostexpensive
        yield(mostexpensive, stockcode)
        
        
    
    

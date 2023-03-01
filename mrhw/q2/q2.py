import csv
from mrjob.job import MRJob

class RetailAnalysis(MRJob):

    def mapper(self, _, line):
        # Parse the line using csv package
        row = next(csv.reader([line]))
        country = row[7]
        stock_code = row[1]
        quantity = int(row[3])
        unit_price = float(row[5])
        amount_spent = quantity * unit_price

        # Emit key-value pair
        yield (country, stock_code), (quantity, amount_spent)

    def reducer(self, key, values):
        # Aggregate quantity and amount spent for each (country, stock code) pair
        total_quantity = 0
        total_amount_spent = 0
        for quantity, amount_spent in values:
            total_quantity += quantity
            total_amount_spent += amount_spent

        # Emit final result
        yield key, (total_quantity, total_amount_spent)

if __name__ == '__main__':
    RetailAnalysis.run()

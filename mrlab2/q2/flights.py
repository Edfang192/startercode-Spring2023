from mrjob.job import MRJob

class Flights(MRJob):

    def mapper(self, _, line):
        fields = line.strip().split(',')
        origin = fields[3]
        dest = fields[4]
        passengers = int(fields[11])

        # Emit key-value pairs for flights from each airport to Florida
        if dest == 'FL':
            yield origin, (passengers, 0)

        # Emit key-value pairs for flights from Illinois to each airport
        if origin == 'IL':
            yield dest, (0, passengers)

    def reducer(self, key, values):
        # Sum up the number of passengers for each airport code
        total_florida = 0
        total_illinois = 0
        for v in values:
            total_florida += v[0]
            total_illinois += v[1]

        # Emit the final result
        yield key, (total_florida, total_illinois)

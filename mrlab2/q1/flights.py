from mrjob.job import MRJob

class FlightAnalysis(MRJob):

    def mapper(self, _, line):
        fields = line.strip().split(',')
        origin = fields[3]
        dest = fields[4]
        passengers = int(fields[11])

        # Emit key-value pairs for incoming and outgoing flights
        yield origin, -passengers
        yield dest, passengers

    def reducer(self, key, values):
        # Sum up the number of passengers for each airport code
        net_passengers = sum(values)

        # Emit the final result
        yield key, net_passengers

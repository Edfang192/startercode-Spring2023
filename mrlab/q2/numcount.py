from mrjob.job import MRJob   # MRJob version

# Change the class name!!
class WordCount(MRJob):  #MRJob version
    def mapper(self, key, line):
        words = line.split()
        for w in words:
            yield (w, 1)

    def reducer(self, key, values):
        count = sum(values)
        if count >= 10:
            yield (key, sum(values))

if __name__ == '__main__':
    WordCount.run()   # MRJob version

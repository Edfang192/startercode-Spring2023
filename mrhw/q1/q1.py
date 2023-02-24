from mockmr import MockMR
import random

class LetterCount(MockMR):

    def mapper_init(self):
        self.letter_cache = {}

    def mapper(self, key, line):
        for character in line:
            letter = character[0]
            length = len(character)
            key = (letter, length)
            if key in self.letter_cache:
                self.letter_cache[key] += 1
            else:
                self.letter_cache[key] = 1
                
    def mapper_final(self):
       for character in self.letter_cache:
           yield character, self.letter_cache[character]


    def reducer(self, key, values_iterator):
        yield key, sum(values_iterator) 


if __name__ == "__main__":
    LetterCount.run(trace=True)

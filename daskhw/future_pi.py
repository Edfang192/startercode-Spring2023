import dask
import random
from dask.distributed import Client
import time

def worker_batched_job(num):
    tot = 0
    for i in range(num):
        #Samples x and y cords.
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        if x*x + y*y <= 1:
            tot += 1
    return tot

def pi(n):
    with Client(n_workers=4) as c: #set workers to n
        darts = int(n/4) #divide the simulations by workers to find darts.
        worker_results = c.map(worker_batched_job, [darts]*4)#Create list of futures.
        total = c.submit(sum,worker_results)#tot num of hits.
        start = time.perf_counter()
        pi = total.result()* 4 / n
        end = time.perf_counter()
        print(f"pi estimate: {pi}, in time {end-start}")

    
'''
def main():
    print(pi(5000))
    return
    

if __name__ == '__main__':
    main()
'''

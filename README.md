# Example
Program that writes data to disk.

## Performance bug report
I am using your program to write some data, but it is taking quite some time to execute (about 15.2 seconds). 
This is the configuration that I used:
 
* `clean = true`
* `dataSize = 5`
* `rounds = 2`

Could you please take a look at why the program is taking so long?

## Task
**Address the bug report**. Specifically, **answer the question** in the bug report **"why is the system taking so long to execute?"**?.

## Docs

### clean
Cleans the existing data.
Default = false

### data
The size of the data to write.
Default = 5

### rounds
The number of times to write.
Default = 10;

The first step of the assignment was to calculate new CPT based on the markov blanket for B, C, D, E. Then I created a node class 
for each node with the new CPTs and attach all the node relevant to each node so they can easily access their states. Each node 
class then was given a weighted randomizer for state that read the state of all the nodes in its markov blanket and then accessed the 
matching row in the CPT. it would roll a random number between 0 and 1, and then compares that value to the value in the selected 
row of the CPT and if it was less than or equal to that value the new state was true, otherwise the new state was false.
I then iterated over updating nodes B, C, D, and E, 10,000 times incrementing a counter everytime B=T and outputing the ratio of B=T to
iterations every 1,000 iterations to get P(B|A=T,G=T). This data was then placed in a table then graphed.

The pattern i noticed is that the P(B|A=T,G=T) seems to converge on a probability of approximatly .09 or 9% overall.

What i learned in this assignment is how to calculate a markov blanket and that you should alwys read carefully what you are supposed to
do so that you don't do a bunch of unnessesary and wrong work while being very confused. 

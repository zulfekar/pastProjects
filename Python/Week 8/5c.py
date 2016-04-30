#Zulfekar
#Labsheet 8 Question 5c

#input:-
#output:truth table of (not P) or (not Q)
#description:use boolean expression to write the truth table

#pseudocode:
#input range for p and q
#print boolean expressions

#code:

for p in range(2):
    for q in range(2):
        print p, "", q, "", (not p) or (not q)

#Zulfekar
#Labsheet 8 Question 5e
#(P or R) and (Q or R)

#input:-
#output:truth table of (P or R) and (Q or R)
#description:use boolean expression to write the truth table

#pseudocode:
#input range for p, q and r
#print boolean expressions

#code:

for p in range(2):
    for q in range(2):
        for r in range(2):
            print p, "", q, "", r, "", (p or r) and (q or r)

# Minimum Swaps for Bracket Balancing

You are given a string of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced string balanced by swapping adjacent characters of opposite type. Calculate the minimum number of swaps necessary to make a string balanced.

## Examples

	Input  : []][][
	Output : 2
	
	First swap:  Position 3 and 4 [][]][
	
	Second swap: Position 5 and 6 [][][]

	Input  : [[][]]
	Output : 0
	String is already balanced.

We can solve this problem using greedy strategies. If the first X characters form a balanced string, we can neglect these characters and continue on. If we encounter a ‘]’ before the required ‘[‘, then we must start swapping elements to balance the string.
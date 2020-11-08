## The statement of the problem
https://leetcode.com/problems/count-number-of-teams/
### O(N^2) approach
For each element from 1 to n-2, we find the number of greater elements, on the left and then on the right of the i-th element.
The number of teams that can be made and that have the i-th element on the middle position is **lowerLeft * greaterRight + greaterLeft * lowerRight**.

**greaterLeft** - the elements on the left of the i-th element that are greater than it.\
**greaterRight** - the elements on the right of the i-th element that are greater than it.\
**lowerLeft = i - greaterLeft** - the elements on the left of the i-th element that are lower than it.\
**lowerRight = n - 1 - i - greaterRight** - the elements on the right of the i-th element that are lower than it.

The final number of teams is the sum of the number of teams for each element.

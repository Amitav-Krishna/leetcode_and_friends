# How it works
## Process

1. Pick the element in the middle of our array.
2. If the key is found at the middle element, terminate the program. If the middle element is greater than the key, replace the array with the elements to the left of the middle. Otherwise, replace the array with the elements to the right of the middle.
4. Repeat until key is found.

## Example

Array: [1, 2, 2, 4, 5, 7, 9, 10, 14, 17, 18].
Key: 10

1a. The middle of the array is 7.
2a. 7 != 10. 7 !> 10. 7 < 10, therefore the array will be made up of the elements to the right of the middle.
New array: [9, 10, 14, 17, 18].

1b. The middle of the array is 14.
2b. 14 != 10. 14 > 10, therefore the array will be made up of the elements to the left of the middle.
New array: [9, 10]

1c. The middle of the array is 9.
2c. 9 != 10. 9 !> 10. 9 < 10, there for the array will be made up of the elements to the right of the middle.
New array: [10]

1d. The middle of the array is 10.
2d. 10 == 10. 10 !> 10. 10 <\! 10. Therefore, the key is the middle element
# Sources
[Geeks For Geeks](https://www.geeksforgeeks.org/dsa/binary-search/)

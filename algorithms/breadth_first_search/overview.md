# How it works
## Process
1. Queue all unvisited neighbours of the current node.
2. Traverse to next node in the queue.

## Examples
input: adj[][] = [[1, 2], [0, 5], [0, 3, 4], [0, 2], [2]]
```mermaid
graph TD;
    0-->1;
    0-->2;
    0-->3;
    1-->5;
    2-->3;
    2-->4;
    ```
\n
# Sources
[Geeks for Geeks](https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/)

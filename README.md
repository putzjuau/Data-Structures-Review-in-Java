# Java Data Structures Review

Welcome to the "Java Data Structures Review" repository. This repository is dedicated to reviewing and exploring various data structures implemented in Java. As we progress, we will cover different types of data structures, highlighting their key points, advantages, disadvantages, and common methods. So far, we have reviewed the `LinkedList`.

## LinkedList Overview

A `LinkedList` is a linear data structure consisting of nodes where each node contains a data part and a reference (or link) to the next node in the sequence. This structure allows for efficient insertion and deletion of elements.

### Key Points

- **Structure**: Each node in a `LinkedList` contains a data field and a reference to the next node.
- **Types**: There are singly linked lists (each node points to the next node) and doubly linked lists (each node points to both the next and the previous node).
- **Memory**: `LinkedList` nodes are stored in non-contiguous memory locations, making dynamic memory allocation efficient.

### Advantages

1. **Dynamic Size**: The size of a `LinkedList` can grow or shrink dynamically.
2. **Efficient Insertions/Deletions**: Inserting or deleting elements is more efficient compared to arrays, especially when these operations occur at the beginning or the middle of the list.
3. **No Wasted Memory**: Since `LinkedList` does not require a pre-allocated amount of memory, there is no memory wastage.

### Disadvantages

1. **Memory Overhead**: Each node requires additional memory for the reference to the next node.
2. **Sequential Access**: Access time for elements is linear (O(n)), making it slower than array access (O(1)).
3. **Extra Memory Usage**: Storing references increases the overall memory usage compared to arrays.

### Common Methods Managed

Here are some of the most commonly used methods in the `LinkedList` class and their purposes that have been reviewed so far:

- **`add(E element)`**: Appends the specified element to the end of the list.
- **`add(int index, E element)`**: Inserts the specified element at the specified position in the list.
- **`remove(int index)`**: Removes the element at the specified position in the list.
- **`remove(Object o)`**: Removes the first occurrence of the specified element from the list.
- **`get(int index)`**: Returns the element at the specified position in the list.
- **`set(int index, E element)`**: Replaces the element at the specified position in the list with the specified element.

By understanding and utilizing these methods, you can effectively manage and manipulate linked lists in Java.

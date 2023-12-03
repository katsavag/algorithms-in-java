# Sorting algorithms theory

## Stable vs Unstable sorting algorithms

1. Stable Sorting Algorithm:
   A stable sorting algorithm is one in which the relative order of equal elements remains unchanged after sorting. In
   other words, if two elements have equal keys in the input data, a stable sorting algorithm will ensure that the order
   of
   these elements remains the same in the sorted output. Stability is a desirable property in many sorting applications,
   as
   it helps preserve the original order of items when they have the same key.

2. Unstable Sorting Algorithm:
   An unstable sorting algorithm is one in which the relative order of equal elements is not guaranteed to remain the
   same
   after sorting. If two elements have equal keys in the input data, an unstable sorting algorithm may rearrange their
   order in the sorted output. Unstable sorting algorithms are typically faster and require less memory compared to
   stable
   sorting algorithms but may not preserve the original order of equal elements.

## Selection Sort Algorithm

Selection Sort divides the input array into two parts: the sorted part and the unsorted part. It repeatedly selects the
minimum (or maximum) element from the unsorted part and moves it to the end of the sorted part. In each iteration, the
smallest element is found and swapped with the element at the current position of the sorted part. The algorithm works
by finding the minimum (or maximum) element in the unsorted part and swapping it with the leftmost unsorted element.
This action expands the sorted part and reduces the unsorted part.

## Insertion Sort Algorithm

To sort an array of size N in ascending order iterate over the array and compare the current element (key) to its
predecessor, if the key element is smaller than its predecessor, compare it to the elements before. Move the greater
elements one position up to make space for the swapped element.
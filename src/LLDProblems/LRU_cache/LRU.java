package LLDProblems.LRU_cache;

public class LRU {
}


/*
Problem Statement
Design and implement an LRU (Least Recently Used) Cache with a fixed capacity. The cache should support fast retrieval and insertion, and automatically evict the least recently used item when the capacity is exceeded.

Requirements
Fixed Capacity: The cache has a maximum size. When full, the least recently used item is evicted on insertion.
Fast Operations: Both get(key) and put(key, value) operations should be O(1).
Eviction Policy: The least recently used item is removed when the cache exceeds its capacity.
Extensibility: Easy to change the eviction policy or underlying data structures.


single instance of LRU
strategy will be used for eviction policy and data structure


classes
1) Item
2)  strategy - interface
3) concrete strategy
4) LRU - works as a context class for strategy




 */
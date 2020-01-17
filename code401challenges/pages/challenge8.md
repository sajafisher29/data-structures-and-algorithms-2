## Challenge
<p>Write a function called mergeLists which takes two linked lists as arguments. 
Zip the two linked lists together into one so that the nodes alternate between the two 
lists and return a reference to the head of the zipped list. Try and keep additional space
down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the 
methods created in previous challenges.</p>


## Approach & Efficiency
Set two pointers and iterate through both lists swapping .nexts, while keeping track of the positions in the lists.


## Solution
<img src="../assets/challenge8.jpg"
     alt="White Board Picture"
     style="float: left; margin-right: 10px; width: 200px;" />
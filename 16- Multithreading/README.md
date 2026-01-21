
1. Asynchronization in JAVA:

Asynchronization: when two or more than threads use single resource simultaneously in waiting of each other called as asynchronization .
- Example of Asynchronization in java 
- (ASynchoronizationApp.java)

```
 Deposite Reads Balance: 100
 Deposite :Write New Balance: 150
 Widraw Reads Balance: 100
 Widraw :Write New Balance: 50
 Account Balance is: 50
 
```
2. Synchronization in JAVA

Synchronization mens when two or more than two threads use a single resource one by one sequentially or in the form of round robin called Synchronization.

We Perfrom the Synchronization by at two levels : <br>
	   <b> 1. Method level synchronization :</b><br>
	   Method level synchronization means we can synchronise a method or we can use the 'synchronized' keyword with method when we use the synchronized keyword with method then ensure the only one thread at a time can execute method on the same object. <br>
       <b> example:</b> <i>SynchronizationApp.java<i> <br>

       
        Deposite Reads Balance: 100 
        Deposite :Write New Balance: 150
        Widraw Reads Balance: 150
        Widraw :Write New Balance: 100
        Account Balance is: 100
    


---
<b> 2. Block level synchronization :</b><br>
	   Block level synchronization means we create instance block in function and use synchronized  with block and pass object as parameter called as block synchronization 
        A synchronized block allow you to synchronize only part of method instead of whole method 
    This is useful when only a small section of code needs thread safe - improving performance by reducing locking time 
 <br>
       <b> example:</b> <i>SynchronizationBlockApp.java<i> <br>

       
        DepositeReads Balance: 100
        Deposite:Write New Balance: 150
        WidrawReads Balance: 150
        Widraw:Write New Balance: 100
        Account Balance is: 100    

---
<b>Synchronized method and synchronized block 
</b><br>
    1. In synchronized method  lock scope for whole method and synchronized block lock scope for particular block.<br>
    2. Lock for whole working object and lock for specific object you choose.<br>
    3. Performance in method synchronization is slightly slower than block synchronization.<br>
    4. When we want to provide thread safety to entire method then synchronized method is better and when we want to provide thread safety to particular block or piece of code then synchronized block is recommended. 
 


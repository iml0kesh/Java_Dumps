Java is a high level, class based, Object Oriented Programming language built by sun microsystems in 1995. It works on the principle of Write Once Run Anywhere (WORA).
Features of java:
1.	Simple
2.	Object oriented
3.	Secured
4.	Platform independent
5.	Robust
6.	Portable
7.	Multithreaded
8.	Distributed
9.	Interpreted
10.	High Performance
11.	Dynamic
12.	Architecture neutral

JDK (Java Development Kit): it consists of jre, jvm, javac, documentation etc.

JRE (Java Runtime Environment): it consists of prescribed methods, classes, and packages that are needed to run the programs.

JVM (Java Virtual Machine): it interprets the bytecode. 
 
The code is converted into bytecode by javac and then the bytecode is interpreted by the JVM to CPU. The Bytecode is not directly executed by the CPU.

![alt text](image.png)
 
### Memory Management in Java:
Java handles memory automatically through a process known as automatic memory management, mainly using Garbage Collection (GC) to free up unused memory.

**_Java Memory Areas (Memory Model):_** when a java program runs, memory is divided into the following main areas:

**_Heap:_** Stores objects and instance variables. Managed by the garbage collector.

**_Stack:_** Stores method calls and local variables. Each method / thread has its own stack.

**_Method Area:_** Stores class-level metadata (class name, static variables, method info). Code is loaded into method area.

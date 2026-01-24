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

---
#### Types of variables in java:
1.	Local Variables: Local variables are a variable that are declared inside the body of a method.
2.	Instance / non-static variables: variable declared inside the class but outside the body of the method, is called an instance variable.
3.	Class / Static variables: Static variables are initialized only once, at the start of the program execution.
Class Demo {
	Static int a = 1; // static variable
	Int data = 99; 	// instance variable
	void method () {
	int b = 90; // local variable.
}
}

### Data Types:
Primitive data types are predefined and available within the java language. which include integer, character, Boolean, and float. \
Total 8 Types:


Byte	1 bit\
Short 	2 bit\
Int 	4 bit\
Long 	2 bit\
Char 	2 bit\
Float 	4 bit\
Double 	8 bit\
Boolean	1 bit

**_Non-Primitive data types_**: which include classes, arrays, and interfaces.
Type conversion and Type casting:

Case 1: Variable of smaller capacity is assigned to another variable of bigger capacity. \

``` java
Double d;
Int i = 10;
d = I;
```
This process is automatic, and non-explicit is known as conversion.

Case 2: Variable of larger capacity is assigned to another variable of smaller capacity.
```java
	Double d = 10;
	Int I;
	I = (int) d; 	[(int) -> Type cast operator]
```
You must specify the Type Cast Operator. This process is called Type casting.

//Writ	e a program to input a number n and display first n terms of Fibonacci series. E.g. if n = 8 then output should be 0 1 1 2 3 5 8 13.

fun main()
{
	var range = Integer.valueOf(readLine())
	var a = 0
	var b = 1
	print(a)
	print(" ")
	print(b)
	print(" ")
	for(i in 1..range-2)
		{   var z = a+b
			print(z)
			print(" ")
			a=b
			b=z
		}
}

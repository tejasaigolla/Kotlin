//. Write a program to input marks of three subjects of a student calculate and display total and percentage of student
fun main()
{
	var a = Integer.valueOf(readLine())
	var b = Integer.valueOf(readLine())
	var c = Integer.valueOf(readLine())
	
	var res = {x:Int,y:Int,z:Int ->
		var sum = x+y+z
		
		
	println("The Total is ${x+y+z}")
		println("The Percentage is ${(sum/3)}")
	}
	res(a,b,c)
	
	
}

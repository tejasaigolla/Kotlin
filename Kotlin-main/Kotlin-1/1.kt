package com.example.kotlinproj

	import java.util.*

fun main(){
  var sc = Scanner(System.`in`)
  print("Enter num1:")
  var num1=sc.nextInt()
  print("Enter num2:")
  val num2=sc.nextInt()
  val a=num1+num2
  val a1=num1-num2
  val a2=num1*num2
  val a3=num1/num2
  println("The addition of two number is=$a")
  println("The subtraction of two number is=$a1")
  println("The Multiplication of two number is=$a2")
  println("The division of two number is=$a3")
}

package com.example

import sys.process._

object Main {
  def main(args: Array[String]): Unit = {
    val cmd1 = "echo ls d:\\\\development\\\\*" #| "bash"
    println(cmd1) // ( [echo, ls, d:\\development\\*] #| [bash] ) 
    
    val cmd2  = """echo "ls d:\\\\development\\\\*"""" #| "bash"
    println(cmd2) // ( [echo, "ls, d:\\\\development\\\\*"] #| [bash] )
    
    println("Compare the output of cmd1 and cmd2, take of the the tokenized Linux command")
    
    // cmd1.!
    // cmd2.!
  }
}
object javaexpressions{
    def main(args:Array[String]):Unit={
        var a:Int=2
        var b:Int=3
        var c:Int=4
        var d:Int=5
        var k:Float=4.3f
        var g:Float=4.0f
        b-=1
        var expression=b*a+c*d
        d-=1        
        var expression2=a
        a+=1
        var expression3= -2*(g-k)+c
        var expression4=c;
        c+=1
        c+=1
        var expression5=c*a
        a+=1
        c= expression5
        println(s"--b * a + c *d -- = $expression \n a++ = $expression2 \n -2*(g-k)+c = $expression3 \n c=c++ = $expression4 \n c=++c*a++ = $expression5 \n")
       

    }
}
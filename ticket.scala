object ticket{
    def attendees(price:Int):Int={
        120+((15-price)/5)*20;
        }

    def revenue(price:Int):Int ={
        attendees(price)* price;
    }

    def cost(price:Int):Int={
        500+3*attendees(price);
    }

    def profit(price:Int):Int ={
        revenue(price)- cost(price)
    }
   
    def findBestTicketPrice(price1:Int,price2:Int,price3:Int):Int={ (profit(price1)>profit(price2) && profit(price1)>profit(price3)) match{
        case true => price1
        case x if(x==false && profit(price2)>profit(price3)) => price2
        case _ => price3
    }
}
    def main(args:Array[String]):Unit={
         println("The most profitable ticket price is : "+findBestTicketPrice(10,15,20)+"Profit:")
    }

}

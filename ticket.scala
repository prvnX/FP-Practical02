object ticket{
    def calculateCost(ticketPrice:Double):Double={ (ticketPrice) match{
        case 15.0 => 3.0*120+500.0
        case 10.0 => 3.0*140+500.0
        case 20.0 => 3.0*100+500.0
    }
}
    def calculateTicketIncome(ticketPrice:Double):Double={ (ticketPrice) match{
        case 15.0 => 15.0*120
        case 10.0 => 10.0*140
        case 20.0 => 20.0*100
    }
}
    def calculateProfit(ticketPrice:Double):Double={ (ticketPrice) match{
        case 15.0 => calculateTicketIncome(15.0)-calculateCost(15.0)
        case 10.0 => calculateTicketIncome(10.0)-calculateCost(10.0)
        case 20.0 => calculateTicketIncome(20.0)-calculateCost(20.0)
    }
}
    def findBestTicketPrice():Double={ (calculateProfit(15.0)>calculateProfit(10.0) && calculateProfit(15.0)>calculateProfit(20.0)) match{
        case true => 15.0
        case x if(x==false && calculateProfit(10.0)>calculateProfit(20.0)) => 10.0
        case _ => 20.0
    }
}
    def main(args:Array[String]):Unit={
        println("The most profitable ticket price is : "+findBestTicketPrice())
    }

}
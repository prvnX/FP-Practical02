object ot{
    def computeBasic(hours:Int):Double={
        250.0*hours
    }

    def computeOT(hours:Int):Double={
        85.0*hours
    }

    def computeTotSalary(normalHours:Int,otHours:Int):Double={
        computeBasic(normalHours)+computeOT(otHours)
    }

    def computeTax(salary:Double):Double={
        0.12*salary
    }

    def netSalary(salary:Double,tax:Double):Double={
        salary-tax
    }
    def main(args:Array[String]):Unit={
        println("Take home salary Salary :"+ netSalary(computeTotSalary(40,30),computeTax(computeTotSalary(40,30))))
    }
}
//Duc Tran
//07/02/2016
//CSE 2
// Purpose:compute the cost of the items bought, including the PA sales tax of 6%

public class Arithmetic { 
    public static void main (String[] args ){
//Number of pairs of pants
int numPants = 3;
//Cost per pair of pants
double pantsPrice = 34.98;

//Number of sweatshirts
int numShirts = 2;
//Cost per shirt
double shirtPrice = 24.99;

//Number of belts
int numBelts = 1;
//cost per box of envelopes
double beltCost = 33.99;

//the tax rate
double paSalesTax = 0.06;



double totalCostOfPants=numPants*pantsPrice;  //total cost of pants without tax

double times100paSalesTaxPants = paSalesTax*totalCostOfPants*100;//total tax of pants * 100 as double
int times100SalesTaxPants= (int) times100paSalesTaxPants;//total tax of pants *100 as integer
double SalesTaxPants= times100SalesTaxPants/100.0;//total tax of pants


double totalCostOfShirts=numShirts*shirtPrice;  //total cost of shirts without tax
double times100paSalesTaxShirts =paSalesTax*totalCostOfShirts*100; //total tax of shirts*100 as double
int times100SalesTaxShirts= (int) times100paSalesTaxShirts;//total tax of shirts *100 as integer
double SalesTaxShirts = times100SalesTaxShirts/100.0; //total tax of shirts

double totalCostOfBelts=numBelts*beltCost;   //total cost of belts without tax
double times100paSalesTaxBelts = paSalesTax*totalCostOfBelts*100;  //total tax of belts*100 as double
int times100SalesTaxBelts= (int) times100paSalesTaxBelts;//total tax of Belts*100 as integer
double SalesTaxBelts = times100SalesTaxBelts/100.0;//total tax of Belts

double totalCostOfPurchase = totalCostOfBelts+totalCostOfPants+totalCostOfShirts; //total cost of purchase without tax
double totalSalesTax=SalesTaxBelts+SalesTaxPants+SalesTaxShirts; //total sale tax
double totalCostOfTransaction=totalCostOfPurchase+totalSalesTax; //total cost of transaction with tax

//print out input data

System.out.println("total cost of pants without tax is $" + totalCostOfPants);
System.out.println("total cost of shirts without tax is $" +totalCostOfShirts);
System.out.println("total cost of belts without tax is $" +totalCostOfBelts);
System.out.println("total tax of pants is $" + SalesTaxPants);
System.out.println("total tax of shirts is $"+SalesTaxShirts);
System.out.println("total tax of belts is $"+SalesTaxBelts);
System.out.println("total cost of purchase without tax is $"+totalCostOfPurchase);
System.out.println("total sales tax is $" +totalSalesTax);
System.out.println("total cost of transaction with tax is $"+totalCostOfTransaction);
}
}


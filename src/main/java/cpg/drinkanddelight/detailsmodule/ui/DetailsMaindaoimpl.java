package cpg.drinkanddelight.detailsmodule.ui;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cpg.drinkanddelight.detailsmodule.service.DistributorDetailsServiceImpl;
import cpg.drinkanddelight.detailsmodule.service.DistributorDetailsServiceIntf;




public class DetailsMaindaoimpl {

	
	List <Long>list = new ArrayList<Long>();
	Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) throws Exception {
		
		
		//main class object......
		DetailsMaindaoimpl detailsmain= new DetailsMaindaoimpl();
		
		//service class object......
		
		DistributorDetailsServiceIntf distributorDetailsServiceIntf = new DistributorDetailsServiceImpl();
	
		//Function calling Through Service Class.......
		
		distributorDetailsServiceIntf.input();
		distributorDetailsServiceIntf.show(detailsmain.userChoice());
	}
	
	
	
	
	
	
	public long userInputID() {
		
		
		boolean flag=true;
		Long numberID=0L;
		String distributorid;
		
		do
		{
			System.out.println("Choose a Distributor ID\n");
			System.out.println(list+"\n");
			
			System.out.println("****************Enter the ID whose details you want to see***********\n");
			
			distributorid=scanner.next();
			distributorid=distributorid.trim();
			
			if(distributorid.matches("[0-9]+"))
			{	     
			 numberID=Long.parseLong(distributorid);
				flag=false;
				}
			else {
				System.out.println("Wrong Input");
				continue;	
			}	
		}while(flag);	
		return numberID;	
	}
	
	
	
	
	public long userChoice() {
		
		list.add(1613310207L);
		list.add(1613310208L);
		list.add(1613310209L);
		list.add(1613310210L);
		list.add(1613310211L);
		list.add(1613310212L);
		list.add(1613310213L);
		list.add(1613310214L);
		list.add(1613310215L);
		list.add(1613310216L);
		list.add(1613310202L);
		list.add(1613310200L);
	    list.add(1613310125L);
		list.add(1613310094L);
		list.add(1613310206L);
		list.add(1613310230L);
		list.add(1613310229L);
		list.add(1713313093L);
		list.add(1713310333L);
		list.add(1613310200L);
		list.add(1613310147L);
		list.add(1613310085L);
		list.add(1613310110L);
		list.add(1613310015L);
		
		 return (userInputID());
		
		
	}

}

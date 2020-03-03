package cpg.drinkanddelight.detailsmodule.dao;

import java.util.HashMap;

import cpg.drinkanddelight.detailsmodule.model.DistributorDetails;
import cpg.drinkanddelight.detailsmodule.exception.*;



public class DistributorDetailsImpl implements DistributorDetailsIntf {
	

	HashMap<Long,DistributorDetails> hmap=new HashMap<Long,DistributorDetails>();
	
	
	
	
	public void input()
	{
		hmap.put(1613310207L,new DistributorDetails(1613310207L,9810455749L,"Noida","Shruti"));
		hmap.put(1613310208L,new DistributorDetails(1613310208L,9810455749L,"Shamli","Shruti Gupta"));
		hmap.put(1613310209L,new DistributorDetails(1613310209L,7875489625L,"Goa","Shweta"));
		hmap.put(1613310210L,new DistributorDetails(1613310210L,8005419360L,"Mumbai","Shubham"));
		hmap.put(1613310211L,new DistributorDetails(1613310211L,8989741230L,"Tamil Nadu","Sneha"));
		hmap.put(1613310212L,new DistributorDetails(1613310212L,9810455749L,"Dehradun","Reetesh"));
		hmap.put(1613310213L,new DistributorDetails(1613310213L,9810455749L,"Banglore","Preeti"));
		hmap.put(1613310214L,new DistributorDetails(1613310214L,9810455749L,"Noida","Vinayak"));
		hmap.put(1613310215L,new DistributorDetails(1613310215L,9897456251L,"Mathura","Ankit"));
		hmap.put(1613310216L,new DistributorDetails(1613310216L,9810455749L,"Lucknow","Utkarsh"));
		hmap.put(1613310202L,new DistributorDetails(1613310202L,9810455749L,"Pune","Saurabh"));
		hmap.put(1613310200L,new DistributorDetails(1613310200L,9810455749L,"Patna","Shilpi"));
		hmap.put(1613310125L,new DistributorDetails(1613310125L,8800679447L,"Saharanpur","Nazuk"));
		hmap.put(1613310094L,new DistributorDetails(1613310094L,9810455748L,"Bulandsheher","Jyoti"));
		hmap.put(1613310206L,new DistributorDetails(1613310206L,9810455749L,"Jhansi","Shraddha"));
		hmap.put(1613310230L,new DistributorDetails(1613310230L,981047425L,"Chennai","Tanya"));
		hmap.put(1613310229L,new DistributorDetails(1613310229L,9810456789L,"Hyderabad","Vaibhav"));
		hmap.put(1713313093L,new DistributorDetails(1713313093L,9917040024L,"Moradabad","Tushar Chaudhary"));
		hmap.put(1713310333L,new DistributorDetails(1713310333L ,9917040536L,"Noida Electronic City","Ravi Anand Jha"));
		hmap.put(1613310200L,new DistributorDetails(1613310200L ,8979679679L,"Navi Mumbai","Shivam Dharwal"));
		hmap.put(1613310147L,new DistributorDetails(1613310147L ,9838375046L,"Kanpur","Pranjal Agarwal"));
		hmap.put(1613310085L,new DistributorDetails(1613310085L ,9205720534L,"Madhya Pradesh","Harsh Parihar"));
		hmap.put(1613310110L,new DistributorDetails(1613310110L ,9873372997L,"Dehradun","Muskan Mittal"));
		hmap.put(1613310015L,new DistributorDetails(1613310015L ,9999952320L,"Haryana","Akash Arayz"));
		
		
		
		
		
		
	}
	
	
	
	public void show(long c) throws Exception
	 {
		
	
		if(!hmap.containsKey(c)) {
			
			try {
				
			throw new DistributorDetailsException("Exception:-Distirbutor ID does not exists.....");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		else 
		{
			DistributorDetails emp=hmap.get(c);
			System.out.println("Distributor Name "+ emp.getName());
			System.out.println("Distributor ID "+ emp.getDistirbutor_ID());
			System.out.println("Distributor Phone Number  "+ emp.getPhone_number());
			System.out.println("Distributor Address  "+  emp.getAddress() );
		}
		
}
}

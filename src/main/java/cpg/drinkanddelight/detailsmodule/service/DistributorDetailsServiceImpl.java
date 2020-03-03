package cpg.drinkanddelight.detailsmodule.service;

import cpg.drinkanddelight.detailsmodule.dao.DistributorDetailsImpl;
import cpg.drinkanddelight.detailsmodule.dao.DistributorDetailsIntf;



public  class DistributorDetailsServiceImpl implements DistributorDetailsServiceIntf {

	
	public static DistributorDetailsIntf distributorDetailsIntf;
	
	
	
	public DistributorDetailsServiceImpl() {
		
		distributorDetailsIntf = new DistributorDetailsImpl();

	}
	
	
/*	static
	{
		distributorDetailsIntf = new DistributorDetailsImpl(sc);
	}*/
	
	
	
	
	public void input() {
		distributorDetailsIntf.input();

	}

	
	public void show(long c) throws Exception{
		distributorDetailsIntf.show(c);

	}

}

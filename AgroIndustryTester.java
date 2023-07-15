class AgroIndustryTester {

    public static void main(String[] args) {
        AgroIndustry agroIndustry1 = new AgroIndustry();
        agroIndustry1.name = "AgroIndustry1";
        agroIndustry1.location = "Location1";
        agroIndustry1.yearEstablished = 2005;
        agroIndustry1.numberOfEmployees = 100;
        agroIndustry1.mainCrop = "Crop1";
        agroIndustry1.hasCertification = true;
        agroIndustry1.annualRevenue = 500000.0;
        agroIndustry1.owner = "Owner1";
        agroIndustry1.isExporting = true;
        agroIndustry1.website = "www.agroindustry1.com";
		agroIndustry1.processCrop();
		System.out.println(agroIndustry1.location + "" + agroIndustry1.annualRevenue);
		
		AgroIndustry agroIndustry2 = new AgroIndustry();
        agroIndustry2.name = "AgroIndustry2";
        agroIndustry2.location = "Location2";
        agroIndustry2.yearEstablished = 2010;
        agroIndustry2.numberOfEmployees = 200;
        agroIndustry2.mainCrop = "Crop2";
        agroIndustry2.hasCertification = false;
        agroIndustry2.annualRevenue = 800000.0;
        agroIndustry2.owner = "Owner2";
        agroIndustry2.isExporting = false;
        agroIndustry2.website = "www.agroindustry2.com";
		agroIndustry2.processCrop();
		System.out.println(agroIndustry2.mainCrop  + "" + agroIndustry2.website );
		}
		}
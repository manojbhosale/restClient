package fileupload;

import java.util.SortedSet;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class VcfStatClient {
	
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		
		
		//vcf stats
	/*	WebTarget target = client.target("http://localhost:8080/vcf/webapi/myresource/vcfutil?name=one.vcf&type=BOTH");
		VcfStats res = target.request(MediaType.APPLICATION_JSON).get(VcfStats.class);
		System.out.println(res);
	*/	
		//vcf comparison
		//vcf stats
			/*	WebTarget target = client.target("http://localhost:8080/vcf/webapi/myresource/vcfcompare?leftFile=one.vcf&rightFile=two.vcf");
				ComparisonResult res = target.request(MediaType.APPLICATION_JSON).get(ComparisonResult.class);
				System.out.println(res);*/
		
				
				//liftover
				WebTarget target = client.target("http://localhost:8080/vcf/webapi/myresource/liftover?chr=chr1&start=17032814&stop=17032814");
				Object res =  target.request(MediaType.APPLICATION_JSON).get().getEntity();
				
				System.out.println((SortedSet<BedInterval>)res);
			
	} 
	

}

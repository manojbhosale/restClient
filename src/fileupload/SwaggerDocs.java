package fileupload;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import io.github.swagger2markup.Swagger2MarkupConverter;



public class SwaggerDocs {

	
public static void main(String[] args) throws MalformedURLException {
	URL remoteSwaggerFile = new URL("http://localhost:8080/vcf/api/swagger.json");
	Path outputDirectory = Paths.get("C:\\Users\\pc\\Desktop\\TestJava\\ForSwagger");

	Swagger2MarkupConverter.from(remoteSwaggerFile) 
	        .build()
	        .toFolder(outputDirectory); 
}
	
}

package com.sitech.cbn.server;

import com.sitech.ijcf.swaggerbsui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableSwaggerBootstrapUI
@SpringBootApplication(scanBasePackages = {"com.sitech.cbn","com.sitech.cbn.common"})
public class CbossZjsmServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbossZjsmServerApplication.class, args);
	}

}

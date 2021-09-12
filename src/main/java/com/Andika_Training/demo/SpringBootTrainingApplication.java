package com.Andika_Training.demo;

import com.Andika_Training.demo.sample1.MappingSample1;
import com.Andika_Training.demo.sample1.MappingSample2;
import com.Andika_Training.demo.sample1.Order;
import com.Andika_Training.demo.sample1.OrderDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTrainingApplication {

	public static void main(String[] args) {

		MappingSample1 sample1 = new MappingSample1();
		Order order1 = sample1.getOrderdata();
		OrderDto orderDto = sample1.convertSample1();


		MappingSample2 sample2 = new MappingSample2();
		Order order2 = sample2.getOrderdata();
		OrderDto orderDto2 = sample2.convertSample2();

		System.out.println("");
//		SpringApplication.run(SpringBootTrainingApplication.class, args);
	}

}

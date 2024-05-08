package com.chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;



@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) throws JRException {
		SpringApplication.run(ChatApplication.class, args);
		String filePath = "C:\\Users\\jerma\\Downloads\\chat\\chat\\src\\main\\resources\\templates\\demo2.jrxml";
		MicroFood food = new MicroFood("Carbohaydrate", 34);
		MicroFood food1 = new MicroFood("Protien", 26);
		MicroFood food2 = new MicroFood("Fat", 13);
		MicroFood food3 = new MicroFood("Vitamin", 27);
		List<MicroFood> microFoodList = new ArrayList<>();
		microFoodList.add(food);
		microFoodList.add(food1);
		microFoodList.add(food2);
		microFoodList.add(food3);
		JRBeanCollectionDataSource microFoodDatasource = new JRBeanCollectionDataSource(microFoodList);
		
//		BarChart barChart = new BarChart("Carbohaydrate", 34);
//		BarChart barChart1 = new BarChart("Protien", 26);
//		BarChart barChart2 = new BarChart("Fat", 13);
//		BarChart barChart3 = new BarChart("Vitamin", 27);
//		List<BarChart> barChartList = new ArrayList<>();
//		barChartList.add(barChart);
//		barChartList.add(barChart1);
//		barChartList.add(barChart2);
//		barChartList.add(barChart3);
//		JRBeanCollectionDataSource barChartDatasource = new JRBeanCollectionDataSource(barChartList);

		Demo demo = new Demo("abd","abc", 20, 10, 5);
		Demo demo1 = new Demo("dns","abc", 20, 10, 5);
		Demo demo2 = new Demo("aabb","abc", 20, 10, 5);
		Demo demo3 = new Demo("jdgg","abc", 20, 10, 5);
		Demo demo4 = new Demo("iwjn","abc", 20, 10, 5);
		Demo demo5 = new Demo("end","abc", 20, 10, 5);
		
		List<Demo> demoList = new ArrayList<>();
		demoList.add(demo);
		demoList.add(demo1);
		demoList.add(demo2);
		demoList.add(demo3);
		demoList.add(demo4);
		demoList.add(demo5);
		
		JRBeanCollectionDataSource demoDatasource = new JRBeanCollectionDataSource(demoList);
		
		Map<String, Object> parameters = new HashMap<>();
//		parameters.put("firstName", "john");
//		parameters.put("lastNAme", "Shegaw");
//		parameters.put("age", 23);
//		parameters.put("DOB", "23/08/1992");
//		parameters.put("demoDataset", demoDatasource);
		parameters.put("foodDataset", demoDatasource);
		parameters.put("microFoodDataset", microFoodDatasource);
//		parameters.put("barChartDataset", barChartDatasource);

		JasperReport report =JasperCompileManager.compileReport(filePath);
		JasperPrint print= JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
		JasperExportManager.exportReportToPdfFile(print,"C:\\Users\\jerma\\Downloads\\joo0o.pdf");
		System.out.println("report generated");
		
	}

}

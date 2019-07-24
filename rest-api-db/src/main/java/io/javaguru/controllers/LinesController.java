package io.javaguru.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaguru.models.Lines;
import io.javaguru.models.Orders;
import io.javaguru.services.LinesService;

@RestController
public class LinesController {
	@Autowired
	private LinesService linesService;
	
	@RequestMapping("/orders/{id}/lines")
	public List<Lines> getAllLines(@PathVariable Integer id){
		return linesService.getAllLines(id);
	}
	
	@RequestMapping("/orders/{orderId}/lines/{lineId}")
	public Lines getLine(@PathVariable Integer lineId) {
		return linesService.getLine(lineId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/orders/{orderId}/lines")
	public void addLine(@RequestBody Lines line, @PathVariable Integer orderId) {
		line.setOrder(new Orders(orderId, "","",null,"",null,"",null));
		linesService.addLine(line);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/orders/{orderId}/lines/{lineId}")
	public void updateLine(@RequestBody Lines line, @PathVariable Integer orderId) {
		line.setOrder(new Orders(orderId, "","",null,"",null,"",null));
		linesService.updateLine(line);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/orders/{orderId}/lines/{lineId}")
	public void addLine(@PathVariable Integer lineId) {
		linesService.deleteLine(lineId);
	}	
}

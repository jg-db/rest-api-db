package io.javaguru.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaguru.dao.LineRepository;
import io.javaguru.models.Lines;

@Service
public class LinesService {
	@Autowired
	private LineRepository linesRepository;

	public List<Lines> getAllLines(Integer orderId){
		List<Lines> lines = new ArrayList<>();
		linesRepository.findByOrderId(orderId).forEach(lines :: add);
		return lines;
	}
	
	public Lines getLine(Integer id) {
		return linesRepository.findOne(id);
	}
	
	public void addLine(Lines line) {
		linesRepository.save(line);
	}
	
	public void updateLine(Lines line) {
		linesRepository.save(line);
	}
	
	public void deleteLine(Integer id) {
		linesRepository.delete(id);
	}
}

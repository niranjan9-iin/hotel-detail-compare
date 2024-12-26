package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HotelDetailsResponse;
import com.example.demo.service.HotelDetailsService;
import com.ihg.cro.commons.domainObjects.hcm.rest.response.HotelContentWrapper;
import com.ihg.cro.commons.domainObjects.hcm.rest.response.HotelContentsResponseObject;

@RestController
public class HotelDetailsController {
	@Autowired
	private HotelDetailsService hotelService;

	@GetMapping("/getHotelDetails")
	public Object getHotelDetails() {
		return hotelService.getHotelDetails("ATLBH", "ICON");
	}
}
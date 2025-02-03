package com.reservation.feignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.reservation.DTO.TableDTO;

@FeignClient(name = "MANAGEMENT", path = "/manageTable")
public interface TableFeignClient {

	@GetMapping("/getall")
	public List<TableDTO> getAllTable();
}

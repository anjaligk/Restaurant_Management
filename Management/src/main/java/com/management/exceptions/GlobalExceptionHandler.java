package com.management.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandler {

	public ResponseEntity<String> handleTableNotFound(TableNotFound e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}

}

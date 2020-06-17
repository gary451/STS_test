package com.mckinley.payroll;

class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -72300125522706723L;

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
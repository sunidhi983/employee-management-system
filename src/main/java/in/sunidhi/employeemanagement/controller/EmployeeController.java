package in.sunidhi.employeemanagement.controller;

import in.sunidhi.employeemanagement.entity.Employee;
import in.sunidhi.employeemanagement.dto.EmployeeResponseDTO;
import in.sunidhi.employeemanagement.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping
    public ResponseEntity<EmployeeResponseDTO> addEmployee(@Valid @RequestBody Employee employee) {
        EmployeeResponseDTO savedEmployee=employeeService.addEmployee(employee);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body((savedEmployee));
    }


    @GetMapping
    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee) {
        EmployeeResponseDTO updatedEmployee=employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }


}

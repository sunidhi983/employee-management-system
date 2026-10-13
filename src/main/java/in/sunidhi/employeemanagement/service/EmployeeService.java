package in.sunidhi.employeemanagement.service;

import in.sunidhi.employeemanagement.entity.Employee;
import in.sunidhi.employeemanagement.dto.EmployeeResponseDTO;
import in.sunidhi.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public EmployeeResponseDTO addEmployee(Employee employee){
        Employee savedEmployee=employeeRepository.save(employee);
        return convertToDTO(savedEmployee);
    }

    public List<EmployeeResponseDTO> getAllEmployees() {
        return  employeeRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    public  EmployeeResponseDTO updateEmployee(Long id, Employee updatedmployee){
        Employee existingEmployee=employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee not found with id: " + id));

        existingEmployee.setName(updatedmployee.getName());
        existingEmployee.setEmail(updatedmployee.getEmail());
        existingEmployee.setDepartment(updatedmployee.getDepartment());
        existingEmployee.setSalary(updatedmployee.getSalary());

        Employee savedEmployee= employeeRepository.save(existingEmployee);
        return convertToDTO(savedEmployee);
    }

    public void deleteEmployee(Long id){
        if(!employeeRepository.existsById(id)){
            throw new RuntimeException("Employee not found with id: " + id);
        }
        employeeRepository.deleteById(id);
    }

    private EmployeeResponseDTO convertToDTO(Employee employee) {
        return new EmployeeResponseDTO(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getDepartment(),
                employee.getSalary()
        );
    }
}

package net.javaguides.springboot.springbootcurdrestfulwebservices.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name = "first_name", nullable = false)
    private String firstName;
	
	@Column(name = "last_name", nullable = false)
    private String lastName;
	
// 	@Column(name = "email_address", nullable = false)
//     private String emailId;
	//
	@Column(name = "Designation", nullable = false)
    private String Designation;
	
	@Column(name ="salary", nullable = false)
    private long salary;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
      //  this.emailId = emailId;
	     this.Designation = Designation;
    }

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

   
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
//     public String getEmailId() {
//         return emailId;
//     }
//     public void setEmailId(String emailId) {
//         this.emailId = emailId;
//     }

	
	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Designation=" + Designation
				+ ", salary=" + salary + "]";
	}
    
//     ", Designation=" + Designation
}

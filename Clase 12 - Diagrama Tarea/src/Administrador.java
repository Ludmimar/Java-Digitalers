
public class Administrador extends Usuario {
	private String adminName;
    private String email;
    
    // constructor
    public Administrador(String userId, String password, String loginStatus, String registerDate, String adminName, String email) {
        super(userId, password, loginStatus, registerDate);
        this.adminName = adminName;
        this.email = email;
    }
    
    // getters and setters
	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


    public boolean updateCatalog() {
        return true;
    }
}

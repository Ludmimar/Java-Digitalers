
public class Usuario {
	private String userId;
    private String password;
    private String loginStatus;
    private String registerDate;
    
    // constructor
    public Usuario(String userId, String password, String loginStatus, String registerDate) {
        this.userId = userId;
        this.password = password;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }
    
 // getters and setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	// metodo
	public boolean verifyLogin() {
        return true;
    }

    
}

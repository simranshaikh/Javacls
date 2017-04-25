package ExceptionHandling;

import javax.security.auth.login.AccountException;

public class Account 
{
	private String accId;//must start with ACC & accId length must be 6
	private String accType;
	
	
	public String getAccId() {
		return accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccid(String accid) throws AccountException {
		if(accid.startsWith("ACC")&&accid.length()==6)
		this.accId = accid;
		else
			throw new AccountException("invalid accid......");
	}
	public void setAcctype(String acctype) {
		this.accType = acctype;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + "]";
	}
	
	
	
}

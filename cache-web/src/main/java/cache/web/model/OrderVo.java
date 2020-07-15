package cache.web.model;

/**
 * Order VO.
 * 
 * @author houyunj
 *
 */
public class OrderVo {

	private String salesOrderNumber;

	private String agreementNumber;

	private String lineOfBusinessCode;

	private String soldToCustomerNumber;

	private String resellerCustomerNumber;
	
	
	
	

	public OrderVo(String salesOrderNumber, String agreementNumber, String lineOfBusinessCode,
			String soldToCustomerNumber, String resellerCustomerNumber) {
		super();
		this.salesOrderNumber = salesOrderNumber;
		this.agreementNumber = agreementNumber;
		this.lineOfBusinessCode = lineOfBusinessCode;
		this.soldToCustomerNumber = soldToCustomerNumber;
		this.resellerCustomerNumber = resellerCustomerNumber;
	}

	public OrderVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSalesOrderNumber() {
		return salesOrderNumber;
	}

	public void setSalesOrderNumber(String salesOrderNumber) {
		this.salesOrderNumber = salesOrderNumber;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public String getLineOfBusinessCode() {
		return lineOfBusinessCode;
	}

	public void setLineOfBusinessCode(String lineOfBusinessCode) {
		this.lineOfBusinessCode = lineOfBusinessCode;
	}

	public String getSoldToCustomerNumber() {
		return soldToCustomerNumber;
	}

	public void setSoldToCustomerNumber(String soldToCustomerNumber) {
		this.soldToCustomerNumber = soldToCustomerNumber;
	}

	public String getResellerCustomerNumber() {
		return resellerCustomerNumber;
	}

	public void setResellerCustomerNumber(String resellerCustomerNumber) {
		this.resellerCustomerNumber = resellerCustomerNumber;
	}

}

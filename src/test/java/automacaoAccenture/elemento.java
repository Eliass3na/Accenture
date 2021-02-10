package automacaoAccenture;

import org.openqa.selenium.By;

public class elemento {
	 
	private By Make = By.id("make");
	private By Model = By.id("model");
	private By CylinderCapacity = By.id("cylindercapacity");
	private By EnginePerformance = By.id("engineperformance");
	private By DateofManufacture = By.id("dateofmanufacture");
	private By NumberOfSeats = By.id("numberofseats");
	private By RightHandDrive = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	private By Payload = By.id("payload");
	private By NumberOfSeats2 = By.id("numberofseatsmotorcycle");
	private By TotalWeight = By.id("totalweight");
	private By FuelType = By.id("fuel");
	private By ListPrice = By.id("listprice");
	private By LicensePlateNumber = By.id("licenseplatenumber");
	private By AnnualMileage = By.id("annualmileage");
	private By Next = By.id("nextenterinsurantdata");
	private By FirstName = By.id("firstname");
	private By LastName = By.id("lastname");
	private By DateOfBirth = By.id("birthdate");
	private By Gender = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	private By StreetAddress = By.id("streetaddress");
	private By Country = By.id("country");
	private By ZipCode = By.id("zipcode");
	private By City = By.id("city");
	private By occupation = By.id("occupation");
	private By Hobbies = By.id("speeding");
	private By website = By.id("website");
	private By picture = By.id("picture");
	private By nextEnterProductData = By.id("nextenterproductdata");
	private By startDate = By.id("startdate");
	private By insuranceSum = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damageInsurance = By.id("damageinsurance");
	private By OptionalProducts = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1)");
	private By courtesyCar = By.id("courtesycar");
	private By nextSelectPriceoption = By.id("nextselectpriceoption");
	private By Silver = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1)");
	private By nextaba4 = By.id("nextsendquote");
	private By Email = By.id("email");
	private By Phone = By.id("phone");
	private By Username = By.id("username");
	private By Password = By.id("password");
	private By ConfirmPassword = By.id("confirmpassword");
	private By Comments = By.id("Comments");
	private By send = By.id("sendemail");
	private By cadastroFinalizado = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	private By validacao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	
	
	public By getEmail() {
		return Email;
	}
	public void setEmail(By email) {
		Email = email;
	}
	public By getPhone() {
		return Phone;
	}
	public void setPhone(By phone) {
		Phone = phone;
	}
	public By getUsername() {
		return Username;
	}
	public void setUsername(By username) {
		Username = username;
	}
	public By getPassword() {
		return Password;
	}
	public void setPassword(By password) {
		Password = password;
	}
	public By getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(By confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public By getComments() {
		return Comments;
	}
	public void setComments(By comments) {
		Comments = comments;
	}
	public void setNumberOfSeats2(By numberOfSeats2) {
		NumberOfSeats2 = numberOfSeats2;
	}
	public void setOccupation(By occupation) {
		this.occupation = occupation;
	}
	public void setOptionalProducts(By optionalProducts) {
		OptionalProducts = optionalProducts;
	}
	public void setSilver(By silver) {
		Silver = silver;
	}
	public By getStartDate() {
		return startDate;
	}
	public void setStartDate(By startDate) {
		this.startDate = startDate;
	}
	public By getInsuranceSum() {
		return insuranceSum;
	}
	public void setInsuranceSum(By insuranceSum) {
		this.insuranceSum = insuranceSum;
	}
	public By getMeritRating() {
		return meritRating;
	}
	public void setMeritRating(By meritRating) {
		this.meritRating = meritRating;
	}
	public By getDamageInsurance() {
		return damageInsurance;
	}
	public void setDamageInsurance(By damageInsurance) {
		this.damageInsurance = damageInsurance;
	}
	public By getEuroProtection() {
		return getEuroProtection();
	
	}
	public By getCourtesyCar() {
		return courtesyCar;
	}
	public void setCourtesyCar(By courtesyCar) {
		this.courtesyCar = courtesyCar;
	}
	public By getNextSelectPriceoption() {
		return nextSelectPriceoption;
	}
	public void setNextSelectPriceoption(By nextSelectPriceoption) {
		this.nextSelectPriceoption = nextSelectPriceoption;
	}
	public By getFirstName() {
		return FirstName;
	}
	public void setFirstName(By firstName) {
		FirstName = firstName;
	}
	public By getLastName() {
		return LastName;
	}
	public void setLastName(By lastName) {
		LastName = lastName;
	}
	public By getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(By dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public By getGender() {
		return Gender;
	}
	public void setGender(By gender) {
		Gender = gender;
	}
	public By getStreetAddress() {
		return StreetAddress;
	}
	public void setStreetAddress(By streetAddress) {
		StreetAddress = streetAddress;
	}
	public By getCountry() {
		return Country;
	}
	public void setCountry(By country) {
		Country = country;
	}
	public By getZipCode() {
		return ZipCode;
	}
	public void setZipCode(By zipCode) {
		ZipCode = zipCode;
	}
	public By getCity() {
		return City;
	}
	public void setCity(By city) {
		City = city;
	
		
	}
	public By getWebsite() {
		return website;
	}
	public void setWebsite(By website) {
		this.website = website;
	}
	public By getNextEnterProductData() {
		return nextEnterProductData;
	}
	public void setNextEnterProductData(By nextEnterProductData) {
		this.nextEnterProductData = nextEnterProductData;
	}
	public void setModel(By model) {
		Model = model;
	}
	public void setCylinderCapacity(By cylinderCapacity) {
		CylinderCapacity = cylinderCapacity;
	}
	public void setDateofManufacture(By dateofManufacture) {
		DateofManufacture = dateofManufacture;
	}
	public void setRightHandDrive(By rightHandDrive) {
		RightHandDrive = rightHandDrive;
	}
	public void setPayload(By payload) {
		Payload = payload;
	}
	public void setTotalWeight(By totalWeight) {
		TotalWeight = totalWeight;
	}
	public void setLicensePlateNumber(By licensePlateNumber) {
		LicensePlateNumber = licensePlateNumber;
	}
	public void setNext(By next) {
		Next = next;
	}
	public By getMake() {
		return Make;
	}
	public void setMake(By make) {
		Make = make;
	}
	public By getEnginePerformance() {
		return EnginePerformance;
	}
	public void setEnginePerformance(By enginePerformance) {
		EnginePerformance = enginePerformance;
	}
	public By getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(By numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public By getFuelType() {
		return FuelType;
	}
	public void setFuelType(By fuelType) {
		FuelType = fuelType;
	}
	public By getListPrice() {
		return ListPrice;
	}
	public void setListPrice(By listPrice) {
		ListPrice = listPrice;
	}
	public By getAnnualMileage() {
		return AnnualMileage;
	}
	public void setAnnualMileage(By annualMileage) {
		AnnualMileage = annualMileage;
	}
	public By getNext() {
		return Next;
	}
	public By getModel() {
		return Model;
	}
	public By getCylinderCapacity() {
		return CylinderCapacity;
	}
	public By getDateofManufacture() {
		return DateofManufacture;
	}
	public By getRightHandDrive() {
		return RightHandDrive;
	}
	public By getPayload() {
		return Payload;
	}
	public By getTotalWeight() {
		return TotalWeight;
	}
	public By getLicensePlateNumber() {
		return LicensePlateNumber;
	}
	public By getOptionalProducts() {
		return OptionalProducts;
	}
	public By getNumberOfSeats2() {
		return NumberOfSeats2;
	}
	public By getOccupation() {
		return occupation;
	}
	public By getSilver() {
		return Silver;
	}
	public By getCadastroFinalizado() {
		return cadastroFinalizado;
	}
	public By getPicture() {
		return picture;
	}
	public By getHobbies() {
		return Hobbies;
	}
	public By getNextaba4() {
		return nextaba4;
	}
	public By getSend() {
		return send;
	}
	public By getValidacao() {
		return validacao;
	}
	

}


package automacaoAccenture;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Metodos metodos = new Metodos();
	elemento elemento = new elemento();
	
	@Given("^que eu esteja no \"([^\"]*)\"$")
	public void que_eu_esteja_no(String url) throws Throwable {
		
		metodos.abrirBrowser(url, "CHROME");
	    
	}

	@When("^quando preencho os formularios das abas e pressiono next$")
	public void quando_preencho_os_formularios_das_abas_e_pressiono_next() throws Throwable {
	
		metodos.selecionarCombo(elemento.getMake(), "BMW");
		metodos.selecionarCombo(elemento.getModel(), "Motorcycle");
		metodos.escrever(elemento.getCylinderCapacity(), "1200");
		metodos.escrever(elemento.getEnginePerformance(), "1200");
		metodos.escrever(elemento.getDateofManufacture(), "01/04/2020");
		metodos.selecionarCombo(elemento.getNumberOfSeats(), "1");
		metodos.selecionarCombo(elemento.getFuelType(), "Electric Power");
		metodos.clicar(elemento.getRightHandDrive());
		metodos.selecionarCombo(elemento.getNumberOfSeats2(), "2");
		metodos.escrever(elemento.getPayload(), "222");
		metodos.escrever(elemento.getTotalWeight(), "555");
		metodos.escrever(elemento.getListPrice(), "4444");
		metodos.escrever(elemento.getLicensePlateNumber(), "3620");
		metodos.escrever(elemento.getAnnualMileage(), "1515");
		metodos.clicar(elemento.getNext());
		metodos.escrever(elemento.getFirstName(), "Elias");
		metodos.escrever(elemento.getLastName(), "Sena");
		metodos.escrever(elemento.getDateOfBirth(), "04/01/1998");
		metodos.clicar(elemento.getGender());
		metodos.escrever(elemento.getStreetAddress(), "Rua Alemanha");
		metodos.selecionarCombo(elemento.getCountry(), "Brazil");
		metodos.escrever(elemento.getZipCode(), "06286150");
		metodos.escrever(elemento.getCity(), "Osasco");
		metodos.selecionarCombo(elemento.getOccupation(), "Employee");
		metodos.pausa(2000);
		metodos.clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
		metodos.escrever(elemento.getWebsite(), "www.teste.com");
		metodos.escrever(elemento.getPicture(), "teste");
		metodos.clicar(elemento.getNextEnterProductData());
		metodos.escrever(elemento.getStartDate(), "10/10/2021");
		metodos.selecionarCombo(elemento.getInsuranceSum(), "3000000");
		metodos.selecionarCombo(elemento.getMeritRating(), "Bonus 2");
		metodos.selecionarCombo(elemento.getDamageInsurance(), "No Coverage");
		metodos.clicar(elemento.getOptionalProducts());
		metodos.selecionarCombo(elemento.getCourtesyCar(), "No");
		metodos.clicar(elemento.getNextSelectPriceoption());
		metodos.clicar(elemento.getSilver());
		metodos.pausa(5000);
	    metodos.clicar(elemento.getNextaba4());
		metodos.escrever(elemento.getEmail(), "elias@sena.com");
		metodos.escrever(elemento.getPhone(), "11910101010");
		metodos.escrever(elemento.getUsername(),"Elias");
		metodos.escrever(elemento.getPassword(), "Ab12345");
		metodos.escrever(elemento.getConfirmPassword(), "Ab12345");
	    metodos.escrever(elemento.getComments(), "PROCESSO SELETIVO ACCENTURE");
	    metodos.clicar(elemento.getSend());
	    metodos.pausa(10000);
	    
	}

	@Then("^valido a mensagem \"([^\"]*)\"$")
	public void valido_a_mensagem(String textoEsperado) throws Throwable {
		
		metodos.validarTexto("Sending e-mail success!", elemento.getValidacao());
	    metodos.fechar();
	}
	
}

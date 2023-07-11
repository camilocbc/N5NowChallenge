package Definitions;

import PageObjects.NetflixPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NetflixSD {
    NetflixPage netflixPage;
    public NetflixSD(Hooks hooks) {
        this.netflixPage = new NetflixPage(hooks.getDriver());
    }

    @Given("que estoy en la página principal de Netflix")
    public void navigateToNetflix() {
        netflixPage.navigateToNetflix();
    }

    @When("maximizo la pantalla")
    public void maximizeScreen() {
        netflixPage.maximizeScreen();
    }

    @When("Doy click en Iniciar Sesion")
    public void doyClickEnIniciarSesion() {
        netflixPage.clickSingInHome();
    }
    @When("Digito Email o Telefono {string}")
    public void digitoEmailOTelefono(String string) {
        netflixPage.textEmailOrPhone(string);
    }
    @When("Digito Clave {string}")
    public void digitoClave(String string) {
        netflixPage.textPassword(string);
    }
    @When("Doy click en Iniciar Sesion Usuario")
    public void doyClickEnIniciarSesionUsuario() {
        netflixPage.clickSingInLogin();
    }

    @Then("debería ver el título de la página")
    public void verifyTitle() {
        netflixPage.printTitle();
    }

    @Then("debería ver la URL actual")
    public void verifyURL() {
        netflixPage.printURL();
    }

    @Then("Valido mensaje de Error {string}")
    public void validoMensajeDeError(String string) {
        netflixPage.validateMessageWrongCredentials(string);
    }
    @Then("Valido mensaje de correo o telefono {string}")
    public void validoMensajeDeCorreoOTelefono(String string) {
        netflixPage.validateMessageEmailOrPhone(string);
    }
    @Then("Valido mensaje de clave {string}")
    public void validoMensajeDeClave(String string) {
        netflixPage.validateMessagePassword(string);
    }





}

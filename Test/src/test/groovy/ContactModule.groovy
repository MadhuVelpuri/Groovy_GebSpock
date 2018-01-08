import geb.Module

class ContactFormModule extends Module {

    static content = {
        nameInput{ $('.form-modern-placeholder', name:"Naam") }
        emailInput { $('.form-modern-placeholder', name:"E-mail") }
       // subjectSelect { $('.form-modern-placeholder', name:"E-mail" ) }
        bodyTextArea { $('.form-modern-placeholder', name:"Typ hier je bericht…") }
        submitButton {$("a", class:contains("submit-form")) }
    }

    void fillInValidEntries() {
        nameInput.value("Madhu")
        emailInput.value("madhu.velpuri@gmail.com")
       // subjectSelect.value("Overige")
        bodyTextArea.value("Hi, I'm running the Geb spock test from the blog post")
    }

    void submitForm(){
        submitButton.click()
    }

}

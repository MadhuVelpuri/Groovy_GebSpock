import geb.Page
import ContactFormModule

class ContactPage extends Page {

    static url = "contact"
    static at = { title == "JDriven | Contact | Nieuwegein" }

    static content = {
        heading { $("h2") }
        contactForm { module ContactFormModule }
    }
}

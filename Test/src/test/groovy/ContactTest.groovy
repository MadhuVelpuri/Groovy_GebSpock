import geb.spock.GebReportingSpec
import ContactPage
import geb.spock.GebSpec

class ContactFormSpec extends GebSpec {

    def "Navigate to contact form and fill in valid form"() {

        given:
        to ContactPage

        and:
        page.contactForm.fillInValidEntries()

        when:
        page.contactForm.submitForm()

        then:
        at ContactPage
        assert page.contains("Succesvol verzonden")


    }

}
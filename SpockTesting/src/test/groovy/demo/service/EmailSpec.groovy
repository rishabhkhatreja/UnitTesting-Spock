package demo.service


import demo.domain.Order
import spock.lang.Specification

class EmailSpec extends Specification {

    def "Send Email"() {
        setup:
        Email emailservice = Email.getInstance();

        when:

        emailservice.sendEmail(Mock(Order));

        then:
        thrown(RuntimeException)
    }

    def "Send Email using a string"() {

        setup:
        Email emailservice = Email.getInstance();

        when:
        Order order = Mock(Order)
        Boolean result = emailservice.sendEmail(new Order(), "abc");

        then:
        result
    }
}

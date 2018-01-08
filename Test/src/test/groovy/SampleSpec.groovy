import geb.spock.GebReportingSpec

class sampleSpec extends GebReportingSpec{

        def "should return 2 from first element of list"() {
            given:
            List<Integer> list = new ArrayList<>()
            when:
            list.add(1)
            then:
            2 == list.get(0)
            expect:
            1==list.get(0)
            //Math.pow(2,2)==4
        }
}
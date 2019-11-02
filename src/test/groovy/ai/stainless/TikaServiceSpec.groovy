package ai.stainless

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

/**
 * Test for tikaService: try to parse test data.
 */
class TikaServiceSpec extends Specification implements ServiceUnitTest<TikaService> {

    def 'Parse a word file to XML'() {
        given:
        def file = new File('testdata/parserTest.doc')

        when:
        def xml = service.parseFile(file)

        then:
        def doc = new XmlSlurper().parseText(xml)
        doc.body.p.find{
            it.text() == 'This is a simple test document'
        }
    }
}

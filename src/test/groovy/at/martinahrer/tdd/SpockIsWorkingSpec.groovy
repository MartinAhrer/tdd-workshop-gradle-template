package at.martinahrer.tdd

import spock.lang.Specification


class SpockIsWorkingSpec extends Specification {
    def "true" () {
        expect:
        true == true
    }

}
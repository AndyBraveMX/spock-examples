package com.test.groovy

import org.apache.commons.lang3.StringUtils

import spock.lang.*

class FirstSpecification extends Specification {
	
	 CharSequence emptyString = ""
	 CharSequence whiteString = " "
	 CharSequence multipleSpacesString = "      "
	 CharSequence notNullString = "Andres"
	
	 def "Prueba si alguna cadena es vacia"() {
		expect:
		StringUtils.isEmpty(emptyString) == true
		StringUtils.isEmpty(whiteString) == false
		StringUtils.isEmpty(multipleSpacesString) == false
		StringUtils.isEmpty(notNullString) == false
	
 	 };
	  
	 def "Prueba si alguno de los elemento es vacio"() {
		 expect:
		 StringUtils.isAnyEmpty(emptyString) == true
		 StringUtils.isAnyEmpty(emptyString, whiteString) == true
		 StringUtils.isAnyEmpty(emptyString, whiteString, multipleSpacesString) == true
		 StringUtils.isAnyEmpty(whiteString, multipleSpacesString) == false
		 
	 };
	 
	 def "Prueba si alguna de las cadenas está limpia"() {
		 expect:
		 StringUtils.isBlank(emptyString) == true
		 StringUtils.isBlank(whiteString) == true
		 StringUtils.isBlank(multipleSpacesString) == true
		 StringUtils.isBlank(notNullString) == false
	 };
	 
	 def "Prueba trim de cadenas" () {
		 expect: 
		 StringUtils.trim(input) == output;
		 
		 where:
		 input      | output
		 ""         | ""
		 "abc"      | "abc"
		 "  ab"     | "ab"
		 "  abc   " | "abc"
	 };
	 
	 def "Prueba trim to null "() {
		 expect: 
		 StringUtils.trimToNull(input)  == output;
		 
		 where:
		 input    | output
		 ""       | null
		 "    "   | null
		 "abc"    | "abc"
		 "   abc" | "abc"
	 }
	 
	 def "Prueba trim to empty" (){
		 expect:
		 StringUtils.trimToEmpty(input) == output;
		 
		 where:
		 input    | output
		 null     | ""
		 ""       | ""
		 "    "   | ""
		 "abc"    | "abc"
		 "   abc" | "abc"
	 }
	   
 
}
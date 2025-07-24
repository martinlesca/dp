package main

import "fmt"

func GetPerson(personType string) (IPerson, error) {
	if personType == "prospect" {
		return newProspect(), nil
	}
	if personType == "customer" {
		return newCustomer(), nil
	}
	return nil, fmt.Errorf("Tipo de pessoa inválido")
}

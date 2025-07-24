package main

import "fmt"

func main() {
	prospect, _ := GetPerson("prospect")
	customer, _ := GetPerson("customer")

	printDetails(prospect)
	printDetails(customer)

}

func printDetails(p IPerson) {
	fmt.Printf("Nome: %s", p.getNome())
	fmt.Println()
	fmt.Printf("Email: %s", p.getEmail())
	fmt.Println()
}

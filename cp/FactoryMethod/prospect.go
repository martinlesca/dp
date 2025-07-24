package main

type Prospect struct {
	Person
}

func newProspect() IPerson {
	return &Prospect{
		Person: Person{
			nome:  "Joao",
			email: "joao123@gotmail.com",
		},
	}
}

package main

type customer struct {
	Person
}

func newCustomer() IPerson {
	return &customer{
		Person: Person{
			nome:  "Paulo",
			email: "paulo456@gmail.com",
		},
	}
}

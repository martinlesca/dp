package main

type IPerson interface {
	setNome(nome string)
	setEmail(email string)
	getNome() string
	getEmail() string
}

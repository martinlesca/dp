package main

type Person struct {
	nome  string
	email string
}

func (p *Person) setNome(nome string) {
	p.nome = nome
}

func (p *Person) getNome() string {
	return p.nome
}

func (p *Person) setEmail(email string) {
	p.email = email
}

func (p *Person) getEmail() string {
	return p.email
}
